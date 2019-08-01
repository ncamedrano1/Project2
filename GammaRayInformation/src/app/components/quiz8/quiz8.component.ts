import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { QuizService } from 'src/app/services/quiz.service';
import { FormGroup, FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-quiz8',
  templateUrl: './quiz8.component.html',
  styleUrls: ['./quiz8.component.css']
})
export class Quiz8Component implements OnInit {

  form:FormGroup
  currentQuestionNumber: number;
  start: boolean = false;
  correct: boolean = false;
  wrong: boolean = false;
  questionNumber: number;
  question: string;
  choices: string[];
  choice1:string;
  choice2:string;
  choice3:string;
  choice4:string;
  choice5:string;





  constructor(private router: Router, private quizService: QuizService, public fb:FormBuilder) { }

  registrationForm = this.fb.group({
    choice1:''
  })

  ngOnInit() {
    this.quizService.seconds = 0;
    this.quizService.qnProgress = 0;
    this.quizService.getQuestionsSubject('spring').subscribe(
      (data: any) => {
        this.quizService.qns = data;
        this.startTimer();
      }
    );
    this.questionNumber = 1;
  }

  startTimer() {
    this.quizService.timer = setInterval(() => {
      this.quizService.seconds++;
    }, 1000);
  }
/**
 * Here resides the method to take a quiz.
 * It works by using the QuizService which has already fetched the data.
 * Here we format said data for each question
 */
  takeQuiz() {
    this.start = true;
    this.question = this.quizService.qns[this.questionNumber-1]['question']
    this.choices = [this.quizService.qns[this.questionNumber-1]['answer'], 
      this.quizService.qns[this.questionNumber-1]['red_herring_one'],
      this.quizService.qns[this.questionNumber-1]['red_herring_two'],
      this.quizService.qns[this.questionNumber-1]['red_herring_three'],
      this.quizService.qns[this.questionNumber-1]['red_herring_four']
     ]
    this.choices = this.shuffle(this.choices)
    this.choice1 = this.choices[0]
    this.choice2 = this.choices[1]
    this.choice3 = this.choices[2]
    this.choice4 = this.choices[3]
    this.choice5 = this.choices[4]
    

  }

  next() {
    if (this.questionNumber > 0 && this.questionNumber < this.quizService.qns.length) {
      this.questionNumber++
    } else {
      this.questionNumber = this.questionNumber
    }
    this.correct = false
    this.wrong=false

    
    

  }

  previous() {
    if (this.questionNumber > 1) {
      this.questionNumber--
    } else {
      this.questionNumber = this.questionNumber
    }
    this.correct = false
    this.wrong=false

  }


  Answer(qID, choice) {
    this.quizService.qns[this.quizService.qnProgress].answer = choice;


  }

  shuffle(array) {
    var currentIndex = array.length, temporaryValue, randomIndex;
  
    // While there remain elements to shuffle...
    while (0 !== currentIndex) {
  
      // Pick a remaining element...
      randomIndex = Math.floor(Math.random() * currentIndex);
      currentIndex -= 1;
  
      // And swap it with the current element.
      temporaryValue = array[currentIndex];
      array[currentIndex] = array[randomIndex];
      array[randomIndex] = temporaryValue;
    }
  
    return array;
  }

  checker1(){
    
    if (this.choice1 == this.quizService.qns[this.questionNumber-1]['answer']){
      console.log("yay")
      this.correct = true
      this.wrong=false
    } else{
      console.log("Incorrect choice!")
      this.wrong = true
      this.correct=false
    }
  }

  checker2(){
    
    if (this.choice2 == this.quizService.qns[this.questionNumber-1]['answer']){
      console.log("yay")
      this.correct = true
      this.wrong=false
    } else{
      console.log("Incorrect choice!")
      this.wrong = true
      this.correct=false
    }
  }

  checker3(){
    
    if (this.choice3 == this.quizService.qns[this.questionNumber-1]['answer']){
      console.log("yay")
      this.correct = true
      this.wrong=false
    } else{
      console.log("Incorrect choice!")
      this.wrong = true
      this.correct=false
    }
  }
  checker4(){
    
    if (this.choice4 == this.quizService.qns[this.questionNumber-1]['answer']){
      console.log("yay")
      this.correct = true
      this.wrong=false
    } else{
      console.log("Incorrect choice!")
      this.wrong = true
      this.correct=false
    }
  }

  checker5(){
    
    if (this.choice5 == this.quizService.qns[this.questionNumber-1]['answer']){
      console.log("yay")
      this.correct = true
      this.wrong=false
    } else{
      console.log("Incorrect choice!")
      this.wrong = true
      this.correct=false
    }
  }
}
