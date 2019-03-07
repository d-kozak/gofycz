package io.dkozak.gofycz.service

import io.dkozak.gofycz.repository.GofyczTaskRepository
import org.springframework.stereotype.Service

@Service
class GofyczTaskService(private val taskRepository: GofyczTaskRepository) {

    fun all() = taskRepository.findAll()

    fun random() = taskRepository.random()

    fun one(id: Long) = taskRepository.findById(id)
}