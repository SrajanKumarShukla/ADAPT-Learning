import React from "react";
import { Link, withRouter } from "react-router-dom";
import"./Footer.css"
function Footer() {
  return (
    <div>
      <div className="footer text-center">
        <span className="text-active" >
         | <Link className="footerLink" to={"/aboutUs"}>About Us</Link> 
         | <Link className="footerLink" to={"/contactUs"}>Contact Us</Link> 
         | <Link className="footerLink" to={"/refundPolicy"}>Refund Policy</Link> | 
        </span>
      </div>
      <br></br>
    </div>
  );
}

export default withRouter(Footer);
