import { Component, OnInit } from '@angular/core';
import { trigger, state, style, transition, animate } from '@angular/animations';
import { FlashcardService } from 'src/app/services/flashcard.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-flashcards1',
  templateUrl: './flashcards1.component.html',
  styleUrls: ['./flashcards1.component.css'],
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
export class Flashcards1Component implements OnInit {
  currentQuestionNumber: number;
  subjectId: number;

  constructor(private router: Router, private flashcardService: FlashcardService) { }

  ngOnInit() {
    this.flashcardService.fnProgress = 0;
    this.flashcardService.getQuestions().subscribe(
      (data: any) => {
        this.flashcardService.fns = data;
      }
    );
  }

  flasher(id) {
    this.router.navigate(["flashcard" + id])
    console.log(id)
  }

  flip: string = 'inactive';
  toggleFlip() {
    this.flip = (this.flip == 'inactive') ? 'active' : 'inactive';
  }

}
