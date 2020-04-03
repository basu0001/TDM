import { PosComponent } from './navigation/pos/pos.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './navigation/home/home.component';
import { LoginComponent } from './navigation/login/login.component';
import { CreateComponent } from './navigation/create/create.component';
import { ModifyComponent } from './navigation/modify/modify.component';
import { DisplayComponent } from './navigation/display/display.component';
import { DeleteComponent } from './navigation/delete/delete.component';
import { ModifComponent} from './navigation/modif/modif.component';

const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: '', redirectTo: '/login', pathMatch: 'full' },
  { path: 'create', component: CreateComponent },
  { path: 'modify', component: ModifyComponent },
  { path: 'display', component: DisplayComponent },
  { path: 'delete', component: DeleteComponent },
  { path: 'pos', component: PosComponent },
  { path: 'modif', component: ModifComponent },
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
