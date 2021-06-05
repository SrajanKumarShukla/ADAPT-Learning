import React from "react";
import { useHistory } from "react-router-dom";
import "./home.css";
import homePic from "../../../image/homePic.png";
function Home() {
  const history = useHistory();

  const routeChange = () =>{ 
    let path = "/flights"; 
    history.push(path);
  }
  return (
    <div>
    <section className="containerHome" >
      <div className="content">
        <h1>Book Your Journey Now</h1>
        <h3>explore the world with us</h3>
        <p>find flights for around the world at affordable prices</p>
        <button onClick={routeChange}>Find Flights</button>
      </div>
      <div className="image">
        <img src={homePic} alt="" />
      </div>
    </section>
    </div>
    // <div>
    //   <FlightSearch />
    // </div>
  );
}

export default Home;
