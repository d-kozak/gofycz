import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {GofyczTask} from "../model/GofyczTask";
import {environment} from "../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class TaskService {

  constructor(private http: HttpClient) {
  }

  getRandomTask(): Observable<GofyczTask> {
    return this.http.get<GofyczTask>(`${environment.baseUrl}/api/random-task`)
  }
}
