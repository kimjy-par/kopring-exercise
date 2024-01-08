package com.kopring.demo.repository

import com.kopring.demo.entity.Task
import org.springframework.data.jpa.repository.JpaRepository

interface TaskRepository : JpaRepository<Task, Long>