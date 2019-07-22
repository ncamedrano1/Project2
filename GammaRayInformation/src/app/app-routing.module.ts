import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { FlashcardsComponent } from './components/flashcards/flashcards.component';
import { PerformanceComponent } from './components/performance/performance.component';
import { QuizzesComponent } from './components/quizzes/quizzes.component';
import { ResourcesComponent } from './components/resources/resources.component';


const routes: Routes = [
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
}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
