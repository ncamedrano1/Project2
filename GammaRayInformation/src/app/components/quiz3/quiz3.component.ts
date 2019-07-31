import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { QuizService } from 'src/app/services/quiz.service';

@Component({
  selector: 'app-quiz3',
  templateUrl: './quiz3.component.html',
  styleUrls: ['./quiz3.component.css']
})
export class Quiz3Component implements OnInit {
  currentQuestionNumber: number;
  start:boolean = false;
  subjectId: number;
  

  constructor(private router: Router, private quizService: QuizService) { }

  ngOnInit() {
    this.quizService.seconds = 0;
    this.quizService.qnProgress = 0;
    this.quizService.getQuestions().subscribe(
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