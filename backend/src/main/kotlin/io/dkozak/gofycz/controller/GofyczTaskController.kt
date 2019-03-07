package io.dkozak.gofycz.controller

import io.dkozak.gofycz.entity.GofyczTask
import io.dkozak.gofycz.service.GofyczTaskService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class GofyczTaskController(private val taskService: GofyczTaskService) {


    @GetMapping("/task")
    fun all(): List<GofyczTask> = taskService.all()

    @GetMapping("/random-task")
    fun random(): GofyczTask? = taskService.random()


}