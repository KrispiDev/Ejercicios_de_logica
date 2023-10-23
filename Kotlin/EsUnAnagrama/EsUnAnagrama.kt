package dev.krispi.fizzbuzz

/*
 * ¿ES UN ANAGRAMA?
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que acepte dos cadenas de texto (String) y devuelva un valor booleano (Bool) que indique si las dos cadenas son anagramas o no.
 * Un anagrama es una palabra o frase que se forma reorganizando todas las letras de otra palabra o frase original.
 * No es necesario verificar si ambas cadenas existen.
 * Es importante destacar que dos cadenas idénticas no se consideran anagramas.
 */

fun sonAnagramas(palabra1: String, palabra2: String): Boolean {
    // Eliminar espacios en blanco y convertir las palabras a minúsculas
    val palabra1SinEspacios = palabra1.replace(" ", "").toLowerCase()
    val palabra2SinEspacios = palabra2.replace(" ", "").toLowerCase()

    // Verificar si tienen la misma longitud
    if (palabra1SinEspacios.length != palabra2SinEspacios.length) {
        return false
    }

    // Convertir las palabras en listas de caracteres y ordenarlas
    val listaCaracteres1 = palabra1SinEspacios.toList().sorted()
    val listaCaracteres2 = palabra2SinEspacios.toList().sorted()

    // Verificar si las listas ordenadas son iguales
    return listaCaracteres1 == listaCaracteres2
}

fun main() {
    val palabra1 = "listen"
    val palabra2 = "silent"
    
    if (sonAnagramas(palabra1, palabra2)) {
        println("$palabra1 y $palabra2 son anagramas.")
    } else {
        println("$palabra1 y $palabra2 no son anagramas.")
    }
}
