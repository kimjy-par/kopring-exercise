package com.kopring.demo.entity
import jakarta.persistence.*

@Entity
data class Task(@Id @GeneratedValue val id: Long, val description: String)