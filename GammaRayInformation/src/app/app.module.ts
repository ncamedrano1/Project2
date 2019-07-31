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
import { Quiz1Component } from './components/quiz1/quiz1.component';
import { Quiz2Component } from './components/quiz2/quiz2.component';
import { Quiz3Component } from './components/quiz3/quiz3.component';
import { Quiz4Component } from './components/quiz4/quiz4.component';
import { Quiz5Component } from './components/quiz5/quiz5.component';
import { Quiz6Component } from './components/quiz6/quiz6.component';
import { Quiz7Component } from './components/quiz7/quiz7.component';
import { Quiz8Component } from './components/quiz8/quiz8.component';


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
    Quiz1Component,
    Quiz2Component,
    Quiz3Component,
    Quiz4Component,
    Quiz5Component,
    Quiz6Component,
    Quiz7Component,
    Quiz8Component
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
