package com.kopring.demo.resolver

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.MutationMapping
import com.kopring.demo.entity.Task
import com.kopring.demo.service.TaskService
import com.kopring.demo.schema.Message
@Controller
class TaskResolver(val taskService: TaskService) {
    @QueryMapping("tasks")
    fun tasks(): Iterable<Task>? {
      return taskService.tasks();
    }

    @MutationMapping("createTask")
    fun createTask(@Argument description: String): Task? {
      println("description: $description")
      val task = Task(description = description)
      return taskService.save(task);
    }

    @MutationMapping("deleteTask")
    fun deleteTask(@Argument id: Long): Message? {
      taskService.delete(id)
      return Message("Task deleted successfully");
    }
}