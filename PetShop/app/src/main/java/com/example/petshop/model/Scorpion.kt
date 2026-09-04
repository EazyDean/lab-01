package com.example.petshop.model

class Scorpion(name: String, age: Int) : Pet(name, age) {
    override fun speak(): String {
        return "hiss"
    }
}

