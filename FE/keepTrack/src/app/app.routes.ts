import { Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { MenuComponent } from './components/menu/menu.component';
import { ListConfigComponent } from './components/list-config/list-config.component';
import { ListDetailComponent } from './components/list-detail/list-detail.component';

export const routes: Routes = [

    {
        path: '',
        redirectTo: 'login',
        pathMatch: 'full'
    },
    {
        path: 'login',
        component: LoginComponent
    },
    {
        path: 'menu',
        component: MenuComponent
    },
    {
        path: 'listDetail',
        component: ListDetailComponent
    },
    {
        path: 'listConfig',
        component: ListConfigComponent
    },
];
