package com.kopring.demo.controller

import org.springframework.web.bind.annotation.*
import org.springframework.http.ResponseEntity

import com.kopring.demo.entity.Task
import com.kopring.demo.service.TaskService

@RestController
@RequestMapping("/tasks")
class TaskController(val taskService: TaskService) {
    @GetMapping("")
    fun tasks(): ResponseEntity<Iterable<Task>>  {
      return ResponseEntity.ok(taskService.tasks());
    }

    @PostMapping("")
    fun save(@RequestBody task: Task): ResponseEntity<Task> {
      return ResponseEntity.ok(taskService.save(task));
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Unit> {
      taskService.delete(id);
      return ResponseEntity.ok().build();
    }
}