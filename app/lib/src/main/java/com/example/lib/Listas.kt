package com.example.lib

fun main () {
    val numeros = listOf (50,19,22,36,47,52,69,77,81,1)
    var numeroMaximo = numeros [0]


    for (n in numeros) {
        if (n > numeroMaximo) {
            numeroMaximo = n
        }
    }
    println(numeroMaximo)
    val palindromo = "Anita lava la tina"
    for (letra in palindromo) {
        println (letra)
    }
}

//Operador aritmetico %