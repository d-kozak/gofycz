import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {GofyczTask} from "../model/GofyczTask";

@Injectable({
  providedIn: 'root'
})
export class TaskService {

  private baseUrl: string = "https://gofycz.herokuapp.com";

  constructor(private http: HttpClient) {
  }

  getRandomTask(): Observable<GofyczTask> {
    return this.http.get<GofyczTask>(`${this.baseUrl}/api/random-task`)
  }
}
