import {Component, OnInit} from '@angular/core';
import {TaskService} from "../_service/task.service";
import {GofyczTask} from "../model/GofyczTask";

@Component({
  selector: 'app-task',
  templateUrl: './task.component.html',
  styleUrls: ['./task.component.css']
})
export class TaskComponent implements OnInit {

  randomTask: GofyczTask = {
    challenge: 'Loading...'
  };

  constructor(private taskService: TaskService) {
  }

  ngOnInit() {
    this.randomChallenge();
  }

  newChallenge() {
    this.randomChallenge()
  }

  private randomChallenge() {
    this.taskService.getRandomTask()
      .subscribe(
        task => this.randomTask = task
      );
  }
}
