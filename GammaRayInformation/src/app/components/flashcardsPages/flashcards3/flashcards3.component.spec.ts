import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Flashcards3Component } from './flashcards3.component';

describe('Flashcards3Component', () => {
  let component: Flashcards3Component;
  let fixture: ComponentFixture<Flashcards3Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Flashcards3Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Flashcards3Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
