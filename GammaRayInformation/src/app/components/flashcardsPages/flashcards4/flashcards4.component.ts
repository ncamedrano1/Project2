import { Component, OnInit } from '@angular/core';
import { FlashcardService } from 'src/app/services/flashcard.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-flashcards4',
  templateUrl: './flashcards4.component.html',
  styleUrls: ['./flashcards4.component.css']
})
export class Flashcards4Component implements OnInit {

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
