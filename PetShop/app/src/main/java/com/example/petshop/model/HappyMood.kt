package com.example.petshop.model

class HappyMood(date: String) : Mood(date) {
    override fun description(): String {
        return "Happy"
    }
}

