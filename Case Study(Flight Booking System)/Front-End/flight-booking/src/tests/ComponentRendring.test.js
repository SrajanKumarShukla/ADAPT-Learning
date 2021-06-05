import React from'react';
import ReactDOM from 'react-dom';
import AboutUs from '../components/aboutUs/AboutUs';
import ContactUs from '../components/contactUs/ContactUs';
import CovidGuideLines from '../components/covidGuidelines/CovidGuidelines';
import RefundPolicy from '../components/refundPolicy/RefundPolicy';
import Home from '../components/global/Home/Home';
import FlightSearch from '../components/user/FlightSearch';
import Login from '../components/auth/Login/Login';
import Register from '../components/auth/Register/Register';
import {cleanup} from "@testing-library/react";

afterEach(cleanup);
it("About Us renders without crashing",()=>{
    const div = document.createElement("div");
    ReactDOM.render(<AboutUs></AboutUs>,div)
})

it("Contact Us renders without crashing",()=>{
    const div = document.createElement("div");
    ReactDOM.render(<ContactUs></ContactUs>,div)
})

it("Covid GuideLines renders without crashing",()=>{
    const div = document.createElement("div");
    ReactDOM.render(<CovidGuideLines></CovidGuideLines>,div)
})
it("Refund Policy renders without crashing",()=>{
    const div = document.createElement("div");
    ReactDOM.render(<RefundPolicy></RefundPolicy>,div)
})

it("Home renders without crashing",()=>{
    const div = document.createElement("div");
    ReactDOM.render(<Home></Home>,div)
})
it("FlightSearch renders without crashing",()=>{
    const div = document.createElement("div");
    ReactDOM.render(<FlightSearch></FlightSearch>,div)
})
it("Login renders without crashing",()=>{
    const div = document.createElement("div");
    ReactDOM.render(<Login></Login>,div)
})
it("Register renders without crashing",()=>{
    const div = document.createElement("div");
    ReactDOM.render(<Register></Register>,div)
})
