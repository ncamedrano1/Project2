import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class FlashcardService {
  readonly rootUrl = 'http://3.16.111.130:8085/Revature/Titanium';
  FId: number;
  fns: any[];
  fnProgress: number;

  constructor(private http: HttpClient) { }

  getQuestions() {
    return this.http.get(this.rootUrl + '/questions');
  }

  storeId(id) {
    this.FId = id;
  }
}