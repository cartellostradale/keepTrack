import { CommonModule } from '@angular/common';
import { Component, OnDestroy, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Subscription } from 'rxjs';
import { SharedDataService } from '../../services/shared-data.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-menu.component',
  imports: [CommonModule, FormsModule],
  templateUrl: './menu.component.html',
  styleUrl: './menu.component.css'
})
export class MenuComponent implements OnInit, OnDestroy {

  identifier: number | undefined;
  subscriptions: Subscription[] = [];

  constructor(
    private readonly sharedData: SharedDataService,
    private readonly router: Router
  ) { }

  ngOnInit(): void {
    this.subscriptions.push(this.sharedData.identifier$.subscribe(id => this.identifier = id));
  }

  ngOnDestroy(): void {
    this.subscriptions.forEach(s => s.unsubscribe());
  }

  addList() {
    this.router.navigate(["/listConfig"])
  }
}
