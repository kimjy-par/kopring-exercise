package com.kopring.demo.controller

import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/tasks")
class TaskController {
    @GetMapping("")
    fun tasks() = "to be completed"
}