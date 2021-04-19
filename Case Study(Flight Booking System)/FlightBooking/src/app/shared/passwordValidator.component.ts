import { AbstractControl } from "@angular/forms";

function passwordValidator(control: AbstractControl) {
    const password = control.get('password');
    const confirmPassword=control.get('confirmPassword');
    if(password.pristine || confirmPassword.pristine){
      return null;
    }
    return password && confirmPassword && password.value != confirmPassword.value?{'misMatch':true}:null;
  }