import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Flashcards8Component } from './flashcards8.component';

describe('Flashcards8Component', () => {
  let component: Flashcards8Component;
  let fixture: ComponentFixture<Flashcards8Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Flashcards8Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Flashcards8Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
