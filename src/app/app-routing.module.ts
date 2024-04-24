import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { InfoComponent } from './info/info.component';
import { PacksComponent } from './packs/packs.component';
import { AccueilComponent } from './accueil/accueil.component';
import { EditionsPasseesComponent } from './editions-passees/editions-passees.component';
import { FooterComponent } from './footer/footer.component';
import { FormulaireComponent } from './formulaire/formulaire.component';
import { LoginComponent } from './login/login.component';
import { NavbarComponent } from './navbar/navbar.component';
import { SignUpComponent } from './sign-up/sign-up.component';

const routes: Routes = [
  {
    path:'info',
    component:InfoComponent
  },
  {
    path:'packs',
    component:PacksComponent,
    pathMatch: 'full'
  },
  {
    path:'accueil',
    component:AccueilComponent
  },
  {
    path:'editions-passees',
    component:EditionsPasseesComponent
  },
  {
    path:'footer',
    component:FooterComponent
  },
  {
    path:'formulaire',
    component:FormulaireComponent
  },
  {
    path:'login',
    component:LoginComponent
  },
  {
    path:'navbar',
    component:NavbarComponent
  },
  {
    path:'sign-up',
    component:SignUpComponent
  },
  {
    path: '**',
    redirectTo: '/accueil' // Redirect to the "Accueil" component or any other default route
  },  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
