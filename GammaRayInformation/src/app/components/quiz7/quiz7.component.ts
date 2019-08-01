import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { QuizService } from 'src/app/services/quiz.service';

@Component({
  selector: 'app-quiz7',
  templateUrl: './quiz7.component.html',
  styleUrls: ['./quiz7.component.css']
})
export class Quiz7Component implements OnInit {

  currentQuestionNumber: number;
  start:boolean = false;
  subjectId: number;
  

  constructor(private router:Router, private quizService:QuizService) { }

  ngOnInit() {
    this.quizService.seconds = 0;
    this.quizService.qnProgress = 0;
    this.quizService.getQuestionsSubject('servlets').subscribe(
      (data: any) => {
        this.quizService.qns = data;
        this.startTimer();
      }
    );
  }

  startTimer() {
    this.quizService.timer = setInterval(() => {
      this.quizService.seconds++;
    }, 1000);
  }

  Answer(qID, choice) {
    this.quizService.qns[this.quizService.qnProgress].answer = choice;


  }

  beginQuiz(){
    this.start = true;
    console.log(this.start)
    console.log(this.quizService.QId);
  }

}
