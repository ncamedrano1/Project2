import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FlashcardService } from 'src/app/services/flashcard.service';

@Component({
  selector: 'app-flashcards5',
  templateUrl: './flashcards5.component.html',
  styleUrls: ['./flashcards5.component.css']
})
export class Flashcards5Component implements OnInit {

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
