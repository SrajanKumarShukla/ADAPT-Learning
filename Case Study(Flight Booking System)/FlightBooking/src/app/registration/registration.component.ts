import { Component, OnInit } from '@angular/core';
import { AbstractControl, FormBuilder,Validators} from '@angular/forms';
import {RegistrationService} from '../../service/registration.service';
import {Registration} from '../../service/registration';
@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
  registration: Registration = new Registration();
  submitted = false;
// getter methods for validation purposes
  get fullName(){
    return this.registrationForm.get('fullName')
  }
  get userName(){
    return this.registrationForm.get('userName')
  } 
  get email(){
    return this.registrationForm.get('email')
  }
  get phoneNumber(){
    return this.registrationForm.get('phoneNumber')
  }
  get password(){
    return this.registrationForm.get('password')
  }
  get confirmPassword(){
    return this.registrationForm.get('confirmPassword')
  }
// ==========================================================
// constructor
  constructor(private fb: FormBuilder,private registrationService: 
    RegistrationService) {}
  registrationForm =this.fb.group({
      fullName:['',Validators.required],
      userName:['',[Validators.required,Validators.minLength(3)]],
      email:['',[Validators.required,Validators.email]],
      phoneNumber:['',[Validators.required,Validators.minLength(10),Validators.maxLength(10)]],
      password: ['',[Validators.required]],
      confirmPassword: ['',Validators.required]
    },{validator:passwordValidator})

  ngOnInit(): void {
  }
  newRegisteration(): void {
    this.submitted = false;
    this.registration = new Registration();
  }

  save() {
    this.registrationService.createUser(this.registration)
      .subscribe(data => console.log(data), error => console.log(error));
    this.registration = new Registration();
  }

  onSubmit() {
    this.submitted = true;
    this.save();
  }
  
}
function passwordValidator(control: AbstractControl) {
  const password = control.get('password');
  const confirmPassword=control.get('confirmPassword');
  if(password.pristine || confirmPassword.pristine){
    return null;
  }
  return password && confirmPassword && password.value != confirmPassword.value?{'misMatch':true}:null;
}