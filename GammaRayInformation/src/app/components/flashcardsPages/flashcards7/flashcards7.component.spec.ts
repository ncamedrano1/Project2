import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Flashcards7Component } from './flashcards7.component';

describe('Flashcards7Component', () => {
  let component: Flashcards7Component;
  let fixture: ComponentFixture<Flashcards7Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Flashcards7Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Flashcards7Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
