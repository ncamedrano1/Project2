import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { QuizService } from 'src/app/services/quiz.service';

@Component({
  selector: 'app-quizzes',
  templateUrl: './quizzes.component.html',
  styleUrls: ['./quizzes.component.css']
})
export class QuizzesComponent implements OnInit {

  constructor(private router: Router, public quizService: QuizService) { }

  ngOnInit() {
  }

  quizzer(id){
    this.router.navigate(["quiz" + id])
    console.log(id)


  }
}
