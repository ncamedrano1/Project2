import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Flashcards5Component } from './flashcards5.component';

describe('Flashcards5Component', () => {
  let component: Flashcards5Component;
  let fixture: ComponentFixture<Flashcards5Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Flashcards5Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Flashcards5Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
