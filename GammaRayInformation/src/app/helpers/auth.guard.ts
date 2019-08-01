/*
The auth guard is used to prevent unauthenticated users from
accessing restricted routes
*/

import { Injectable } from '@angular/core';
import { Router, CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { state } from '@angular/animations';

import { AuthenticationService } from 'src/app/services/authentication.service';

@Injectable({ providedIn: 'root'})
export class AuthGuard implements CanActivate {
    constructor(
        private router: Router,
        private authenticationService: AuthenticationService
    ) {}

    canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
        const currentAccount = this.authenticationService.currentAccountValue;
        if (currentAccount) {
            //authorised so return true
            return true;
        }
        
        //not logged in so redirect to login page with return url
        this.router.navigate(['/login'], { queryParams: { returnUrl: state.url }});
        return false;
    }

}