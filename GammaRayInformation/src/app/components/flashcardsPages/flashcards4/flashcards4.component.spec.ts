import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Flashcards4Component } from './flashcards4.component';

describe('Flashcards4Component', () => {
  let component: Flashcards4Component;
  let fixture: ComponentFixture<Flashcards4Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Flashcards4Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Flashcards4Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
