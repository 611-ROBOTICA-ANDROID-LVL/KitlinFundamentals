package com.example.lib


fun main() {
    val palabra = "externocleidomastuideo"

    var a = 0
    var e = 0
    var i = 0
    var o = 0
    var u = 0


    for (c in palabra.lowercase()) {
        when (c) {
            'a' -> a++
            'e' -> e++
            'i' -> i++
            'o' -> o++
            'u' -> u++

        }
    }

    println("Palabra: \"$palabra\"")
    println("a: $a")
    println("e: $e")
    println("i: $i")
    println("o: $o")
    println("u: $u")
}