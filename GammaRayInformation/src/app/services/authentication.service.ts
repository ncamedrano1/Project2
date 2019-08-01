/*
The authentication service is used to login and logout of the
application, to login it posts the users credentials to the api
and checks the response for a JWT token, if there is one it means
authentication was successful so the user details including the 
token are added.
*/

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';
import { map } from 'rxjs/operators';

import { Account } from 'src/app/components/register/account/account';

@Injectable({ providedIn: 'root' })
export class AuthenticationService {
  private currentAccountSubject: BehaviorSubject<Account>;
  public currentAccount: Observable<Account>;

  constructor(private http: HttpClient) {
    this.currentAccountSubject = new BehaviorSubject<Account>(JSON.parse(storage.getItem('currentAccount')));
    this.currentAccount = this.currentAccountSubject.asObservable();
   }

   public get currentAccountValue(): Account {
     return this.currentAccountSubject.value;
   }

   login(username, password) {
     return this.http.post<any>(`${config.apiUrl}/users/authenticate`, { username, password })
      .pipe(map(user => {
        //store user details and jwt token in storage to keep user logged in btw page refreshes
        Storage.setItem(`currentAccount`, JSON.stringify(account));
        this.currentAccountSubject.next(account);
        return account;
      }));

   }

   logout() {
     //remove user from local storage and set current user to null
     Storage.removeItem('currentAccount');
     this.currentAccountSubject.next(null);
   }


}
