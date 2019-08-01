import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FlashcardService {
  readonly rootUrl = 'http://3.16.111.130:8085/Revature/Titanium';
  fns: any[];

  constructor() { }
}
