import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FlashcardService } from 'src/app/services/flashcard.service';

@Component({
  selector: 'app-flashcards6',
  templateUrl: './flashcards6.component.html',
  styleUrls: ['./flashcards6.component.css']
})
export class Flashcards6Component implements OnInit {

  constructor(private router:Router, private flashcardService: FlashcardService) { }

  ngOnInit() {
    this.flashcardService.fnProgress = 0;
    this.flashcardService.getQuestions().subscribe(
      (data: any) => {
        this.flashcardService.fns = data;
      }
    );
  }

}
