package com.example.lib
// Ejercicio 03

fun main() {
    val dias = listOf(1, 2, 10, 5, 16, 4, 7, 9, 3, 6)

    for (d in dias) {
        val nombre = when (d) {
            1 -> "Lunes"
            2 -> "Martes"
            3 -> "Miercoles"
            4 -> "Jueves"
            5 -> "Viernes"

            else -> "Dia no valido"
        }

        println("$d -> $nombre")
    }
}
