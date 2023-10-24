package dev.krispi.esUnAnagrama

/*
 * Reto de "¿ES UN ANAGRAMA?"
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que acepte dos cadenas de texto (String) y devuelva un valor booleano (Bool) que indique si las dos cadenas son anagramas o no.
 * Un anagrama es una palabra o frase que se forma reorganizando todas las letras de otra palabra o frase original.
 * No es necesario verificar si ambas cadenas existen.
 * Es importante destacar que dos cadenas idénticas no se consideran anagramas.
 */

fun sonAnagramas(cadena1: String, cadena2: String): Boolean {
    // Elimina espacios en blanco y convierte las cadenas a minúsculas para la comparación
    val cadena1Limpia = cadena1.replace("\\s".toRegex(), "").toLowerCase()
    val cadena2Limpia = cadena2.replace("\\s".toRegex(), "").toLowerCase()

    // Comprueba si las cadenas tienen la misma longitud
    if (cadena1Limpia.length != cadena2Limpia.length) {
        return false
    }

    // Convierte las cadenas en listas de caracteres y ordena las listas
    val listaCadena1 = cadena1Limpia.toList().sorted()
    val listaCadena2 = cadena2Limpia.toList().sorted()

    // Compara si las listas ordenadas son iguales
    return listaCadena1 == listaCadena2
}

fun main() {
    val cadena1 = "listen"
    val cadena2 = "silent"

    if (sonAnagramas(cadena1, cadena2)) {
        println("$cadena1 y $cadena2 son anagramas.")
    } else {
        println("$cadena1 y $cadena2 no son anagramas.")
    }
}
