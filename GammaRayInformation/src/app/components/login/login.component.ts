import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(
    /**
     * Router object created for use below.
     */

    private router: Router
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

}
