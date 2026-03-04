package com.example.lib

class Persona (val nombre: String, val edad: Int, val ciudad: String) {

    fun saludar () {
        println ("Hola, me llamo $nombre y tengo $edad años de edad")
    }

    fun esMayorDeEdad (): Boolean {
        return edad >= 18
    }

}

fun main () {
    val persona1 = Persona ("Loenthgreen", 20, "Leon")
    val persona2 = Persona  ("Miguel", 17, "Irapuato")
    val persona3 = Persona ("Antonio" , 67, "Ibiza")

    persona1.saludar()
    println ("${persona1.nombre} es mayor de edad?: ${persona1.esMayorDeEdad ()}")

    persona2.saludar()
    println ("${persona2.nombre} es mayor de edad?: ${persona2.esMayorDeEdad ()}")

    persona3.saludar ()
    println ("${persona3.nombre} es mayor de edad?: ${persona3.esMayorDeEdad()}")

}