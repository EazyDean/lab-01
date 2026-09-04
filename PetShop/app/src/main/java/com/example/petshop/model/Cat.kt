package com.example.petshop.model

class Cat(name: String, age: Int) : Pet(name, age), Pettable {
    override fun speak(): String {
        return "Meow"
    }

    override fun pet() {
        println("The cat $name is being petted")
    }
}

