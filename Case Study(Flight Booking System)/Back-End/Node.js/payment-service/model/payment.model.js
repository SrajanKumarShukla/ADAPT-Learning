const mongoose=require("mongoose");
var PaymentSchema = new mongoose.Schema({
    paymentid:{
        type: String,
        required:"Rrquired"
    },
    orderid:{
        type: String,
        required:"Rrquired"
    },
    signature:{
        type: String,
        required:"Rrquired"
    },
    bookingid:{
        type: String,
        required:"Rrquired"
    },
    userid:{
        type: String,
        required:"Rrquired"
    }
});
mongoose.model("Payment",PaymentSchema)