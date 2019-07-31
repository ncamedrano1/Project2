import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations'
import { NgModule } from '@angular/core';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { FlashcardsComponent } from './components/flashcards/flashcards.component';
import { QuizzesComponent } from './components/quizzes/quizzes.component';
import { ResourcesComponent } from './components/resources/resources.component';
import { PerformanceComponent } from './components/performance/performance.component';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { ProfileComponent } from './components/profile/profile.component';
import { QuizComponent } from './components/quiz/quiz.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NavbarComponent,
    FlashcardsComponent,
    QuizzesComponent,
    ResourcesComponent,
    PerformanceComponent,
    LoginComponent,
    RegisterComponent,
    ProfileComponent,
    QuizComponent
  ],
  imports: [
    BrowserModule, BrowserAnimationsModule,
    NgbModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
