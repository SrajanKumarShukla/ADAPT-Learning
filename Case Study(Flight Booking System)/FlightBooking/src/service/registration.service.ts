import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RegistrationService {
  private baseUrl = 'http://localhost:8080/api/users';
  constructor(private http: HttpClient) { }
  createUser(registeration: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}` + `/create`, registeration);
  }
}