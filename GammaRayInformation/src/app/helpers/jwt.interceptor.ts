/*
The JWT Interceptor intercepts (haha) http requests from the application to add
a JWT auth token to the Authorization header if the user is logged in.
*/

import { Injectable } from '@angular/core';
import { HttpRequest, HttpHandler, HttpEvent, HttpInterceptor } from '@angular/common/http';
import { Observable } from 'rxjs';

// import { AuthenticationService } from '';

@Injectable()
export class JwtInterceptor implements HttpInterceptor {
    constructor(private authenticationService: AuthenticationService) {}

    intercept(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
        //add authorization header with jwt token if available
        let currentAccount = this.authenticationService.currentAccountValue;
        if (currentAccount && currentAccount.token) {
            request = request.clone({
                setHeaders: {
                    Authorization: `Bearer ${currentAccount.token}`
                }
            });
        }

        return next.handle(request);
    }
}