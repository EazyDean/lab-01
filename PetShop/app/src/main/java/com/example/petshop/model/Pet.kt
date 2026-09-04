package com.example.petshop.model

abstract class Pet(val name: String, var age: Int) {
    abstract fun speak(): String
}

