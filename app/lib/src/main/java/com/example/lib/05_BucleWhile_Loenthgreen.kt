package com.example.lib
//Ejercicio 05
fun main() {
    val numeros = listOf(12345, 9081, 100, 19092005, 22122005)

    for (n in numeros) {
        var numero = n
        var suma = 0

        while (numero > 0) {
           suma = suma + (numero % 10)
            numero = numero / 10
        }

        println("Suma de digitos de $n: $suma")
    }
}