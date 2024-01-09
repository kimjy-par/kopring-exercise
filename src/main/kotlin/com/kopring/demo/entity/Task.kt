package com.kopring.demo.entity
import jakarta.persistence.*

@Entity
class Task(
    @Id @GeneratedValue val id: Long? = null, 
    val description: String
)