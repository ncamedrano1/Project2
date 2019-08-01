import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { FlashcardsComponent } from './components/flashcards/flashcards.component';
import { PerformanceComponent } from './components/performance/performance.component';
import { QuizzesComponent } from './components/quizzes/quizzes.component';
import { ResourcesComponent } from './components/resources/resources.component';
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
import { Flashcards1Component } from './components/flashcardsPages/flashcards1/flashcards1.component';
import { Flashcards2Component } from './components/flashcardsPages/flashcards2/flashcards2.component';
import { Flashcards3Component } from './components/flashcardsPages/flashcards3/flashcards3.component';
import { Flashcards4Component } from './components/flashcardsPages/flashcards4/flashcards4.component';
import { Flashcards5Component } from './components/flashcardsPages/flashcards5/flashcards5.component';
import { Flashcards6Component } from './components/flashcardsPages/flashcards6/flashcards6.component';
import { Flashcards7Component } from './components/flashcardsPages/flashcards7/flashcards7.component';
import { Flashcards8Component } from './components/flashcardsPages/flashcards8/flashcards8.component';


const routes: Routes = [
  /**
   * Here are a collection of our created routes. It is important to note that for an empty
   * direction, the HomeComponent is called.
   */
{
  path: 'home',
  component: HomeComponent
},
{
  path: '',
  component: HomeComponent
},
{
  path: 'flashcards',
  component: FlashcardsComponent
},
{
  path:'performance',
  component:PerformanceComponent
},
{
  path: 'quizzes',
  component: QuizzesComponent
},
{
  path: 'resources',
  component: ResourcesComponent
},
{
  path: 'login',
  component: LoginComponent

},
{
path: 'register',
component: RegisterComponent
},
{
  path: 'profile',
  component: ProfileComponent
},
{
  path: 'quiz1',
  component: Quiz1Component
},
{
  path: 'quiz2',
  component: Quiz2Component
},
{
  path: 'quiz3',
  component: Quiz3Component
},
{
  path: 'quiz4',
  component: Quiz4Component
},
{
  path: 'quiz5',
  component: Quiz5Component
},
{
  path: 'quiz6',
  component: Quiz6Component
},
{
  path: 'quiz7',
  component: Quiz7Component
},
{
  path: 'quiz8',
  component:  Quiz8Component
},
{
  path: 'flashcards1',
  component: Flashcards1Component
},
{
  path: 'flashcards2',
  component: Flashcards2Component
},
{
  path: 'flashcards3',
  component: Flashcards3Component
},
{
  path: 'flashcards4',
  component: Flashcards4Component
},
{
  path: 'flashcards5',
  component: Flashcards5Component
},
{
  path: 'flashcards6',
  component: Flashcards6Component
},
{
  path: 'flashcards7',
  component: Flashcards7Component
},
{
  path: 'flashcards8',
  component: Flashcards8Component
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
