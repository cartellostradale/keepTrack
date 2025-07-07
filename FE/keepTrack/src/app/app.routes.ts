import { Routes } from '@angular/router';
import { LoginComponent } from './login/login/login.component';

export const routes: Routes = [

    {
        path: 'login',
        component: LoginComponent
    },
    {
        path: '',       // 👈 root path
        redirectTo: 'login',
        pathMatch: 'full' // importante per il redirect
    },
];
