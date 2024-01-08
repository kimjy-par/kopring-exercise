package com.kopring.demo.resolver

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

import com.kopring.demo.repository.TaskRepository
import com.kopring.demo.entity.Task

@Service
@Transactional
class TaskResolver(val taskRepository: TaskRepository) {
    fun tasks() = taskRepository.findAll()
    fun save(task: Task) = taskRepository.save(task)
    fun delete(id: Long) = taskRepository.deleteById(id)
}