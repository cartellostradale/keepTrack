import { CommonModule } from '@angular/common';
import { Component, OnDestroy } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { LoginService } from '../../services/login.service';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-login.component',
  imports: [CommonModule, FormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css',
  standalone: true,
})
export class LoginComponent implements OnDestroy{

  user: string = '';
  identifier: string = '';

  subscriptions: Subscription[] = [];

  constructor(
    private readonly loginService: LoginService
  ) { }

  ngOnDestroy(): void {
    this.subscriptions.forEach(s => s.unsubscribe());
  }

  login() {
    if (this.user != "") {
      this.subscriptions.push(this.loginService.login(this.user).subscribe(login => {
        if (login) {
          this.identifier = login;
        }
      }));
    }

  }

}
