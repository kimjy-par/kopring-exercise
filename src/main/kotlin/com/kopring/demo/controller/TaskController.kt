package com.kopring.demo.controller

import org.springframework.web.bind.annotation.*
import org.springframework.http.ResponseEntity

import com.kopring.demo.entity.Task
import com.kopring.demo.resolver.TaskResolver

@RestController
@RequestMapping("/tasks")
class TaskController(val taskResolver: TaskResolver) {
    @GetMapping("")
    fun tasks(): ResponseEntity<Iterable<Task>>  {
      return ResponseEntity.ok(taskResolver.tasks());
    }

    @PostMapping("")
    fun save(@RequestBody task: Task): ResponseEntity<Task> {
      return ResponseEntity.ok(taskResolver.save(task));
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Unit> {
      taskResolver.delete(id);
      return ResponseEntity.ok().build();
    }
}