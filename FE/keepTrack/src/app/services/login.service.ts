import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Apis } from '../costants/apis';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(
    private readonly http: HttpClient
  ) { }

  login(username: string): Observable<any> {
    const body = { username };
    return this.http.post(Apis.baseUrl + Apis.login, body);
  }
  
}
