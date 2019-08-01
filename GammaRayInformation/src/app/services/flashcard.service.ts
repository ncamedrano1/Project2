import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class FlashcardService {
  readonly rootUrl = 'http://3.16.111.130:8085/RevatureTitanium/questions/allQuestions';
  FId: number;
  fns: any[];
  fnProgress: number;

  constructor(private http: HttpClient) { }

  getQuestionsSubject(subject) {
    console.log(this.http.get(this.rootUrl+'-'+subject))
    return this.http.get(this.rootUrl + '-'+subject);
  }

  storeId(id) {
    this.FId = id;
  }
}