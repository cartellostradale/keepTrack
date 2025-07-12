import { CommonModule } from '@angular/common';
import { Component, OnDestroy } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { LoginService } from '../../services/login.service';
import { Subscription } from 'rxjs';
import { SharedDataService } from '../../services/shared-data.service';
import { Router } from '@angular/router';

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
  showErrorNotFound: boolean = false;
  showErrorEmpty: boolean = false;

  subscriptions: Subscription[] = [];

  constructor(
    private readonly loginService: LoginService,
    private readonly sharedData: SharedDataService,
    private readonly router: Router,
  ) { }

  ngOnDestroy(): void {
    this.subscriptions.forEach(s => s.unsubscribe());
  }

  login() {
    if (this.user != "") {
      this.subscriptions.push(this.loginService.login(this.user).subscribe(login => {
        if (login) {
          this.sharedData.setIdentifier(login.id);
          this.router.navigate(['/menu']);
        } else {
      this.showErrorNotFound = true;
      this.showErrorEmpty = false;
    }
      }));
    } else {
      this.showErrorEmpty = true;
      this.showErrorNotFound = false;
    }
  }
}
