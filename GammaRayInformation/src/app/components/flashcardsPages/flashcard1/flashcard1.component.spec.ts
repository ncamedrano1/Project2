import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Flashcard1Component } from './flashcard1.component';

describe('Flashcard1Component', () => {
  let component: Flashcard1Component;
  let fixture: ComponentFixture<Flashcard1Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Flashcard1Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Flashcard1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
