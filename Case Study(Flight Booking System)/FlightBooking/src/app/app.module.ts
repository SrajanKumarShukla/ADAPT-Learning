import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
// Importing components
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { CovidComponent } from './covid/covid.component';
import { NewsComponent } from './news/news.component';
import { BookingComponent } from './booking/booking.component';
import { SearchComponent } from './search/search.component';

import { AboutusComponent } from './aboutus/aboutus.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AdminComponent } from './admin/admin.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    RegistrationComponent,
    CovidComponent,
    NewsComponent,
    BookingComponent,
    SearchComponent,
    AboutusComponent,
    AdminComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
