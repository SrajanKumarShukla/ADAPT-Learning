var express = require("express"); // Get the module
var app = express();
const path = require("path");
const shortid = require("shortid");
const Razorpay = require("razorpay");
const cors = require("cors");
const bodyParser = require("body-parser");
const mongoose=require("mongoose");
// link to mongodb atlas
mongoose.connect("mongodb+srv://admin:admin@flightbookingwebapp.n5q6g.mongodb.net/myFirstDatabase?retryWrites=true&w=majority",{ useUnifiedTopology: true },(error)=>{
  if(!error)
  {
    console.log("Mongo db Sucess");
  }
  else{
    console.log(error);
  }
});
const Payment = require("./model/payment.model")
app.use(
  cors({
    origin: ["http://localhost:3000"],
    methods: ["GET", "POST", "PUT"],
    credentials: true,
  })
);

app.use(cors());
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

const razorpay = new Razorpay({
  key_id: "rzp_test_3qpMwKLiYT1YtE",
  key_secret: "CumQjIhqjflfOXDAvml0O4N1",
});

app.get("/logo.svg", (req, res) => {
  res.sendFile(path.join(__dirname, "logo.svg"));
});

app.post("/verification", (req, res) => {
  // do a validation
  const secret = "12345678";

  console.log(req.body);

  const crypto = require("crypto");

  const shasum = crypto.createHmac("sha256", secret);
  shasum.update(JSON.stringify(req.body));
  const digest = shasum.digest("hex");

  console.log(digest, req.headers["x-razorpay-signature"]);

  if (digest === req.headers["x-razorpay-signature"]) {
    console.log("request is legit");
    // process it
    require("fs").writeFileSync(
      "payment1.json",
      JSON.stringify(req.body, null, 4)
    );
  } else {
    // pass it
  }
  res.json({ status: "ok" });
});

app.post("/razorpay", async (req, res) => {
  const payment_capture = 1;
  const amount = req.body.fare;
  const currency = "INR";

  const options = {
    amount: amount * 100,
    currency,
    receipt: shortid.generate(),
    payment_capture,
  };

  try {
    const response = await razorpay.orders.create(options);
    console.log(response);
    res.json({
      id: response.id,
      currency: response.currency,
      amount: response.amount,
    });
  } catch (error) {
    console.log(error);
  }
});

//save payment to db
app.post("/addPayment", (req, res) => {
  const paymentid = req.body.paymentid;
  const orderid = req.body.orderid;
  const signature = req.body.signature;
  const bookingid = req.body.bookingid;
  const userid = req.body.userid;
  Payment.save((err,doc)=>{
    if(!err){
      console.log("Payment Saved")
    }
    else{
      console.log("payment not saved");
    }
  });
});

app.post("/getPayment", (req, res) => {
  const bookingid = req.body.bookingid;
  console.log(bookingid);
  Payment.find(bookingid,(err, result) => {
    if (err) {
      res.send({ err: err });
    } else {
      res.send(result[0]);
    }
  });
});

app.listen(3002, () => {
  console.log("Payments listening on 3002");
});
