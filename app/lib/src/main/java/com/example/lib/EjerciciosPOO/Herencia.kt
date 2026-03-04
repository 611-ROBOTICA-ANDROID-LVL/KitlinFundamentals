package com.example.lib.EjerciciosPOO

open class Animal (val nombre: String, val edad: Int) {
    open fun hacerSonido () {
        println ("Sonido generico.")
    }

    fun describirse () {
        println ("Soy un $nombre, por alguna razon puedo hablar y tengo $edad años ")
    }
}

class Perro (nombre: String, edad: Int) : Animal (nombre, edad) {
    override fun hacerSonido() {
      println ("Guau!!!!")
    }
}

class Gato (nombre: String, edad: Int) : Animal (nombre, edad) {
    override fun hacerSonido() {
      println ("Miau!!!")
    }
}

class Vaca (nombre: String, edad: Int) : Animal (nombre, edad) {
    override fun hacerSonido() {
        println (" Waaaaa!!!!")
    }
}

fun main () {
    val perro  = Perro ("Firulais" , 3)
    val gato = Gato ("Michi", 2)
    val perico = Vaca ("Pericazo" , 5)


    perro.describirse()
    perro.hacerSonido()
    println ("---------------------------------")

    gato.describirse()
    gato.hacerSonido()
    println ("---------------------------------")

    perico.describirse()
    perico.hacerSonido()

}

