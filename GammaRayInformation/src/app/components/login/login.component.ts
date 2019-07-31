import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  username;
  pwd;
  constructor(
    /**
     * Router object created for use below.
     */
    private http:HttpClient, private router:Router
    
  ) { }

  ngOnInit() {
  }
/**  
 * Here the resiterer() function is declared. It takes no input, but does utilize a Router 
 * object declared in the constructor above. Simply use this router to navigate to the desired 
 * register page.  
 */

  registerer(){
    this.router.navigate(["register"])
  }

  giveData(){
    this.http.post<boolean>("http://3.16.111.130:8085/RevatureTitanium/",
    {username: this.username, password: this.pwd}).subscribe(response =>{
      if(response){
        this.router.navigate(["profile"])
      }
    })
  }


}
