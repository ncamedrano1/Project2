import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  fname;
  lname;
  username;
  psw;
  email;

  constructor(private http:HttpClient, private router:Router) { }

  ngOnInit() {
  }

  public giveData(){
    this.http.post<boolean>("http://3.16.111.130:8085/RevatureTitanium/",{firstName: this.fname, lastName: this.lname, username: this.username,
     password: this.psw, email: this.email}).subscribe( response => {
      if(response){
        this.router.navigate(["login"])
      } else{
        this.router.navigate(["register"])
      }
    })



  }

}
