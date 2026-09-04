package com.example.petshop.model

class SadMood(date: String) : Mood(date) {
    override fun description(): String {
        return "Sad"
    }
}

