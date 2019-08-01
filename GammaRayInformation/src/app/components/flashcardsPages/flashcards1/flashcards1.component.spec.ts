import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Flashcards1Component } from './flashcards1.component';

describe('Flashcards1Component', () => {
  let component: Flashcards1Component;
  let fixture: ComponentFixture<Flashcards1Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Flashcards1Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Flashcards1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
