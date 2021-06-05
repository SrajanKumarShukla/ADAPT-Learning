import React from "react";
import"./ContactUs.css";
function ContactUs(){
    return(
    <div className="body">    
        {/* <div className="contact-info">
            <div className="container-fluid">
                <div className="row">
                    <div className="col-lg-10 offset-lg-1 d-flex justify-content-between"> */}
                        {/* phone number */}
                        {/* <div className="contact-info-item d-flex justify-content-start align-items-center">
                            <img src="https://img.icons8.com/office/24/000000/iphone.png" alt="phone" />
                            <div className="contact-info-content">
                                <div className="contact_info_title">
                                    Phone
                                </div>
                                <div className="contact_info_text">
                                    +91 1111 543 2198
                                </div>
                            </div>
                        </div> */}
                         {/* email */}
                         {/* <div className="contact_info_item d-flex justify-content-start align-items-center">
                            <img src="https://img.icons8.com/office/24/000000/iphone.png" alt="phone" />
                            <div className="contact_info_content">
                                <div className="contact_info_title">
                                    Email
                                </div>
                                <div className="contact_info_text">
                                    flights@flyhigh.com
                                </div>
                            </div>
                        </div>
                         address */}
                         {/* <div className="contact_info_item d-flex justify-content-start align-items-center">
                            <img src="https://img.icons8.com/office/24/000000/iphone.png" alt="phone" />
                            <div className="contact_info_content">
                                <div className="contact_info_title">
                                    Address
                                </div>
                                <div className="contact_info_text">
                                    Ludhiana, Punjab, India
                                </div>
                            </div>
                        </div>

                    </div>

                </div>

            </div>
        </div>     */}
        {/* contact us form */}
        {/* <div className="contact_form">
            <div className="container">
                <div className="row">
                    <div className="col-lg-10 offset-lg-1">
                        <div className="contact_form_container py-5">
                            <div className="contact_form_title">
                                Get in Touch
                            </div>
                            <form id="contact_form">
                                <div className="contact_form_name d-flex justify-content-between align-item-between">
                                    <input typpe="text" id="contact_form_name" className="contact_form_name input_field" placeholder="Your Name" required="true"/>
                                    <input typpe="email" id="contact_form_email" className="contact_form_email input_field" placeholder="Your Email" required="true"/>
                                    <input typpe="number" id="contact_form_phone" className="contact_form_phone input_field" placeholder="Your Phone Number" required="true"/>
                                </div>
                                <div className="contact_form_text mt-5">
                                    <textarea className="text_field contact_form_message" placeholder="Message" cols="30" rows="10"></textarea>

                                </div>
                                <div classname="contact_form_button">
                                    <button type="submit" className="button contact_submit_button">Send Message</button>

                                </div>
                            </form>



                        </div>

                    </div>

                </div>

            </div>


        </div> */}
<div className="wrapper">
  <div className="title">
    <h1>contact us form</h1>
  </div>
  <div className="contact-form">
    <div className="input-fields">
      <input type="text" className="input" placeholder="Name" />
      <input type="text" className="input" placeholder="Email Address" />
      <input type="text" className="input" placeholder="Phone" />
      <input type="text" className="input" placeholder="Subject" />
    </div>
    <div className="msg">
      <textarea placeholder="Message"></textarea>
      <div className="btn" style={{color:"white",background: "#39b7dd"}}>send</div>
    </div>
  </div>
</div>
    </div>
    );
}

export default ContactUs;
