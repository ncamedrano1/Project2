import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class QuizService {
  readonly rootUrl = 'http://3.16.111.130:8085/Revature/Titanium';
  qns: any[];
  seconds: number;
  timer;
  qnProgress: number;


  constructor(private http : HttpClient) { }

  getQuestions() {
    return this.http.get(this.rootUrl + '/questions');

  }

}