package com.example.lib



fun main() {
    val numeros = listOf(4, 7, 12, 15, 8, 3, 22, 11, 6, 9, 13, 19, 74)

    val pares = mutableListOf<Int>()
    val impares = mutableListOf<Int>()

    // TODO: Recorre la lista y agrega cada numero a pares o impares segun corresponda
    for (num in numeros) {
        if (num % 2 == 0) {
            pares.add(num)
        } else {
           impares.add(num)
        }
    }
    println("Pares: $pares")
    println("Impares: $impares")
}