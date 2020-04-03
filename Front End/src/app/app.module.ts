import { PosComponent } from './navigation/pos/pos.component';
import { HttpClient, HttpHandler, HttpClientModule } from '@angular/common/http';
import { DatePipe } from '@angular/common';
import { MaterialModule } from './modules/material/material.module';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {NgxMaterialTimepickerModule} from 'ngx-material-timepicker';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { LoginComponent } from './navigation/login/login.component';
import { HomeComponent } from './navigation/home/home.component';
import { CreateComponent } from './navigation/create/create.component';
import { ModifyComponent } from './navigation/modify/modify.component';
import { DisplayComponent } from './navigation/display/display.component';
import { DeleteComponent } from './navigation/delete/delete.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HeaderComponent } from './shared/header/header.component';
import { FooterComponent } from './shared/footer/footer.component';
import { SidenavComponent } from './shared/sidenav/sidenav.component';
import { RestClientService } from './services/rest-client.service';
import { CdkColumnDef } from '@angular/cdk/table';
import { ModifComponent } from './navigation/modif/modif.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent,
    CreateComponent,
    ModifyComponent,
    DisplayComponent,
    DeleteComponent,
    HeaderComponent,
    FooterComponent,
    SidenavComponent,
    PosComponent,
    ModifComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MaterialModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    NgxMaterialTimepickerModule,
  ],
  providers: [
    DatePipe,
    RestClientService,
    HttpClient,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
