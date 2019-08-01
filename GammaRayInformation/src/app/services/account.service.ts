/*
The account service contains a standard set of CRUD methods for 
managing accounts, it acts as the interface btw the ng app and
the backend api.
*/

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Account } from 'src/app/components/register/account/account';

@Injectable({ providedIn: 'root' })
export class AccountService {

  constructor(private http: HttpClient) { }

  getAll() {
    return this.http.get<Account[]>("http://3.16.111.130:8085/RevatureTitanium/users");
  }

  register(account: Account) {
    return this.http.post("http://3.16.111.130:8085/RevatureTitanium/users/register", account);
  }

  delete(id: number) {
    return this.http.delete("http://3.16.111.130:8085/RevatureTitanium/users/${id}");
  }

}
