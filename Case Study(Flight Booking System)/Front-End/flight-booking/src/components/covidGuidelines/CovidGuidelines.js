import React from "react";

import "./CovidGuidelines.css";
function CovidGuidelines(){
    return(
        <div className="container py-3" style={{backgroundColor:"white"}}>
            <div className="clearfix">&nbsp; </div>
            <h1 style={{textAlign:"center",marginTop:"-5rem"}}>Covid-19 Travel Guidelines</h1>
            <br />
            <h2 style={{marginTop:"-2rem"}}>Guidelines for international travellers in India:</h2>
            <p className="text-justify">
                <p className="inner">• All Travellers must submit a self health declaration form on Air Suvidha portal.</p>
                <p className="inner">• They must upload the negative RT PCR report which should not be earlier than 72 hours on Air Suvidha portal.</p>
                <p className="inner">• Only such passengers who are arriving to exigency of death in their family are allowed without negative RT PCR report.</p>                
                <p className="inner">• Thermal screening will be conducted in respect of all passengers.</p>
                <p className="inner">• If any passenger found symptomatic on arrival at the time of thermal screening they must be isolated and sent for immediate medical treatment.</p>
                <p className="inner">• Only those passengers are allowed to board and deboard who have submitted their self declaration and RT PCR report on Air Suvidha portal.</p>
                <p className="inner">• Those passengers who are traveling India from international flights must register on newdelhiairport.in. Registration should be done before 72 hours of departure. To know more details click on <a href="https://www.newdelhiairport.in/covid19">https://www.newdelhiairport.in/covid19</a></p>
                <p className="inner">• All travellers coming from the UK, South Africa and Brazil will be allowed to exit the airport only after confirmation of COVID-19 negative test report at the airport. They must undergo another test on day 7 at their own expense.</p>
                <p className="inner">• Passengers arriving from Afghanistan, Bahrain, France, Germany, Iraq, Kuwait, Netherlands, Oman, Qatar, Russian Fed., Ukraine or United Arab Emirates are subject to a Coronavirus (COVID-19) molecular test upon arrival at their own expense.</p>
            </p>
</div>
    );
}
export default CovidGuidelines;