package com.example.petshop.model

abstract class Mood(val date: String) {
    abstract fun description(): String
}

