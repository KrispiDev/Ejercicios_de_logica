package dev.krispi.decimalABinario

/*
 * Reto de "DECIMAL A BINARIO"
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa se encargue de transformar un número decimal a binario sin utilizar funciones propias del lenguaje que lo
 * hagan directamente.
 */

fun decimalABinario(decimal: Int): String {
    var numDecimal = decimal
    var resultadoBinario = ""

    if (numDecimal == 0) {
        resultadoBinario = "0"
    } else {
        while (numDecimal > 0) {
            val residuo = numDecimal % 2
            resultadoBinario = residuo.toString() + resultadoBinario
            numDecimal /= 2
        }
    }

    return resultadoBinario
}

fun main() {
    val numeroDecimal = 42 // Cambia este número al decimal que desees convertir
    val binario = decimalABinario(numeroDecimal)
    println("El número decimal $numeroDecimal en binario es: $binario")
}
