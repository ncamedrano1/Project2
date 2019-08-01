import { Component, OnInit } from '@angular/core';
import { trigger, state, style, transition, animate } from '@angular/animations';
import { Router } from '@angular/router';
import { FlashcardService } from 'src/app/services/flashcard.service';

@Component({
  selector: 'app-flashcards8',
  templateUrl: './flashcards8.component.html',
  styleUrls: ['./flashcards8.component.css'],
  animations: [
    trigger('flipState', [
      state('active', style({
        transform: 'rotateY(179deg)'
      })),
      state('inactive', style({
        transform: 'rotateY(0)'
      })),
      transition('active => inactive', animate('500ms ease-out')),
      transition('inactive => active', animate('500ms ease-in'))
    ])
  ]
})
export class Flashcards8Component implements OnInit {
  currentQuestionNumber: number;
  start: boolean = false;
  questionNumber: number;
  subjectId: number;
  question: string;
  answer: string[];

  constructor(private router: Router, private flashcardService: FlashcardService) { }

  ngOnInit() {
    this.flashcardService.fnProgress = 0;
    this.flashcardService.getQuestionsSubject('java').subscribe(
      (data: any) => {
        this.flashcardService.fns = data;
      }
    );
    this.questionNumber = 1;
  }

  takeFlashcards() {
    this.start = true;
    this.question = this.flashcardService.fns[this.questionNumber - 1]['question']
    this.answer = [this.flashcardService.fns[this.questionNumber - 1]['answer']]
  }

  flasher(id) {
    this.router.navigate(["flashcard" + id])
    console.log(id)
  }

  flip: string = 'inactive';
  toggleFlip() {
    this.flip = (this.flip == 'inactive') ? 'active' : 'inactive';
  }

  next() {
    if (this.questionNumber > 0 && this.questionNumber < this.flashcardService.fns.length) {
      this.questionNumber++
    } else {
      this.questionNumber = this.questionNumber
    }


  }

  previous() {
    if (this.questionNumber > 1) {
      this.questionNumber--
    } else {
      this.questionNumber = this.questionNumber
    }
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

}
