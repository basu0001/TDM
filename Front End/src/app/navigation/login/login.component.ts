import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  form: FormGroup;

  constructor(private router: Router) { }

  public onLoginClick(form){
    if(form.value.username=='cris_hyd' && form.value.password=='cris123'){
      this.router.navigate(['./home']);
    }
    else{
      alert("Wrong Username/Password. Try Again!");
    }
  }

  public onResetClick(){
    this.form.reset;
  }

  ngOnInit() {
  }
}
