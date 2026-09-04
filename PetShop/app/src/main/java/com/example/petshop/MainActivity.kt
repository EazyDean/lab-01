package com.example.petshop

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import com.example.petshop.model.Cat
import com.example.petshop.model.Dog
import com.example.petshop.model.HappyMood
import com.example.petshop.model.Mood
import com.example.petshop.model.Pet
import com.example.petshop.model.Pettable
import com.example.petshop.model.SadMood
import com.example.petshop.model.Scorpion

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val cat = Cat("Coco", 6)
        val dog = Dog("Mochi", 6)
        val scorpion = Scorpion("Stinger", 32)

        val pets = mutableListOf<Pet>(cat, dog, scorpion)
        val pettablePets = mutableListOf<Pettable>(cat, dog)
        val moods = listOf<Mood>(
            HappyMood("2026-09-04"),
            SadMood("2026-09-05"),
        )

        pettablePets.forEach { it.pet() }

        val summary = buildString {
            appendLine("PetShop")
            appendLine()
            pets.forEach { pet ->
                appendLine("${pet.name}, age ${pet.age}: ${pet.speak()}")
            }
            appendLine()
            moods.forEach { mood ->
                appendLine("${mood.date}: ${mood.description()}")
            }
        }

        setContentView(TextView(this).apply {
            text = summary
            textSize = 20f
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
        })
    }
}

