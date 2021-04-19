import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { BookingComponent } from './booking/booking.component';
import { CovidComponent } from './covid/covid.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { NewsComponent } from './news/news.component';
import { RegistrationComponent } from './registration/registration.component';
import { SearchComponent } from './search/search.component';

const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'covid',component:CovidComponent},
  {path:'news',component:NewsComponent},
  {path:'login',component:LoginComponent},
  {path:'registration',component:RegistrationComponent},
  {path:'flightBooking',component:BookingComponent},
  {path:'flightSearch',component:SearchComponent},
  {path:'aboutUs',component:AboutusComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
