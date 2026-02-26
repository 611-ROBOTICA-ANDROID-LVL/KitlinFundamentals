package com.pjasoft.lib

fun main () {
    //Control K y contorl C para comentar
    //Ctrl K y Ctrl U
////variables INMUTABLES
//    val name : String = "Loenthgreen"
//
////Variable INMUTABLE
//
//    var age : Int? = null
//    age = 20
//    //Tipos de Datos: int, string, double, float, char, array, boolean
//    val is01d : Boolean = false
//    val height : Double = 1.70
//    //String Interpolation
//    println("El nombnre es: $name, con edad de $age años y una altura de $height")
//    println(name + "" + age + ""+  height)
//    println(age)
//    println(height)
//
//    // Estructuras de control
//    // 1. If-Else
//    if(age>18) {
//        println ("Es mayor de edad")
//    }
//else {
//    println ("Es un morrito")
//    }
//
//    //Ciclo for
//    //Scope
//    for (i in 1..10) {
//        println(i)
//    }
//    for (i in 10 downTo 0 step 2) {
//        println(i)
//    }
//    //Switch case
//    val dayOfWeek = 4
//    when (dayOfWeek) {
//        1 -> println ("Es lunes")
//        2 -> println ("Es martes")
//        6, 7 -> println ("Es fin de semana")
//        else -> println ("Es un dia cualquiera")
//    }


    /*
    * Escribir un programa que calcule el area de un rectangulo
     */
    //KOTLIN ES UN LENGUAJE NULL SAFETY
    //Operadores aritmeticaos + = - * /
    //Operadores logicos: || &&
    //Operador Elvis ?:
    var base: Double  = 0.0
    var height: Double = 0.0
    println ("Digita la base del rectangulo")
    val baseInput = readlnOrNull ()
    base = baseInput?.toDoubleOrNull() ?: 0.0
    println("Digita la altura del rectangulo")
    val heightInput = readlnOrNull ()
    height = heightInput?.toDoubleOrNull() ?: 0.0
    val area = base * height
    println ("El area es: $area")

    if (area==0.0){
        println("No seas wey, usa números solamente")
    }
    else {
        println ("El area es: $area")
    }

}

