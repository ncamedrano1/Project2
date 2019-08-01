import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { AuthenticationService } from 'src/app/services/authentication.service';
import { Account } from 'src/app/components/register/account/account';

import 'src/app/content/app.less';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  currentAccount: Account;

  constructor(
    private router: Router,
    private authenticationService: AuthenticationService
  ) {
    this.authenticationService.currentAccount.subscribe(x => this.currentAccount = x);
  }

  logout() {
    this.authenticationService.logout();
    this.router.navigate(['/login']);
}

  title = 'GammaRayInformation';
}
