import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SharedDataService {

  constructor() { }

  private readonly identifier = new BehaviorSubject<number>(0);
  public identifier$ = this.identifier.asObservable();

  setIdentifier(value: number) {
    this.identifier.next(value);
  }

  getIdentifier(): number {
    return this.identifier.getValue();
  }
}
