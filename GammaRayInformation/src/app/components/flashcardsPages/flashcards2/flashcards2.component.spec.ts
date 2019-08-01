import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Flashcards2Component } from './flashcards2.component';

describe('Flashcards2Component', () => {
  let component: Flashcards2Component;
  let fixture: ComponentFixture<Flashcards2Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Flashcards2Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Flashcards2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
