import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.html',
  styleUrl: './app.css',
  template: `<router-outlet></router-outlet>`,
  standalone: true,
})
export class App {
  protected title = 'keepTrack';
}
