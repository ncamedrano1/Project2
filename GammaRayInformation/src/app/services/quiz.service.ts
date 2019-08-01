import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class QuizService {
  readonly rootUrl = 'http://3.16.111.130:8085/RevatureTitanium/questions/allQuestions';
  QId: number;
  qns: any[];
  seconds: number;
  timer;
  qnProgress: number;


  constructor(private http : HttpClient) { }

  displayTimeElapsed(){
    return Math.floor(this.seconds / 3600) + ':' + Math.floor(this.seconds / 60) + ':' + Math.floor(this.seconds % 60);

  }

  getQuestionsSubject(subject) {
    console.log(this.http.get(this.rootUrl+'-'+subject))
    return this.http.get(this.rootUrl + '-'+subject);

  }
}
