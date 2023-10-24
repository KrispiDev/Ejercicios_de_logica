package dev.krispi.invertirCadena

/*
 * Reto de "INVIRTIENDO CADENAS"
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */

fun invertirCadena(cadena: String): String {
    var cadenaInvertida = ""
    for (i in cadena.length - 1 downTo 0) {
        cadenaInvertida += cadena[i]
    }
    return cadenaInvertida
}

fun main() {
    val texto = "Hola mundo"
    val textoInvertido = invertirCadena(texto)
    println("Texto original: $texto")
    println("Texto invertido: $textoInvertido")
}
