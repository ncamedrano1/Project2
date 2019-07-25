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
}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
