package com.example.lib.EjerciciosPOO

class CuentaBancaria (val titular: String) {
    var saldo: Double = 0.0

    fun depositar (cantidad: Double) {
        saldo += cantidad
        println ("Deposito Completo. Su saldo actual es de: $saldo pesos")
    }

    fun retirar (cantidad: Double) {
    if (cantidad <= saldo) {
        saldo -= cantidad
        println ("Retiro Completado, su retiro fue de $cantidad pesos. Su saldo restante es de $saldo pesos")
    } else {
        println ("Slado insuficiente. Saldo actual de: $saldo pesos")

    }
    }

    fun mostrarSaldo () {
    println ("Titular: $titular. Su saldo actual es de: $saldo pesos")
    }
}

fun main () {
    val cuenta = CuentaBancaria("Loenthgreen Villagomez")
    cuenta.depositar (1200.0)
    cuenta.retirar (400.0)
    cuenta.retirar (800.0)
    cuenta.retirar (100.0)
    cuenta.mostrarSaldo ()
}