package dev.krispi.fibonacci

/*
 * Reto de "SECUENCIA FIBONACCI"
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Escribe un programa que muestre los primeros 50 números de la secuencia de Fibonacci, comenzando con 0.

 * La serie de Fibonacci es una secuencia de números en la que cada número siguiente es la suma de los dos números anteriores.
 * La secuencia inicia con 0, y los números subsiguientes son 1, 1, 2, 3, 5, 8, 13 y así sucesivamente, siguiendo la regla de la suma de los dos números anteriores. El programa debe imprimir los primeros 50 números de esta secuencia.
 */

fun main() {
    val n = 50 // Cantidad de números de la secuencia de Fibonacci a mostrar
    var a = 0L
    var b = 1L

    println("Los primeros $n números de la secuencia de Fibonacci son:")
    print("$a, $b")

    for (i in 2 until n) {
        val temp = a + b
        a = b
        b = temp
        print(", $b")
    }
}
