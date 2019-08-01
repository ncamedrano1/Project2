import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Flashcards6Component } from './flashcards6.component';

describe('Flashcards6Component', () => {
  let component: Flashcards6Component;
  let fixture: ComponentFixture<Flashcards6Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Flashcards6Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Flashcards6Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
