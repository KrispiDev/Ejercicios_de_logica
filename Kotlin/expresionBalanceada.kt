package dev.krispi.expresionBalanciada

/*
 * Reto de "EXPRESIONES EQUILIBRADAS"
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que comprueba si los paréntesis, llaves y corchetes de una expresión están equilibrados.
 * - Equilibrado significa que estos delimitadores se abren y cieran en orden y de forma correcta.
 * - Paréntesis, llaves y corchetes son igual de prioritarios. No hay uno más importante que otro.
 * - Expresión balanceada: { [ a * ( c + d ) ] - 5 }
 * - Expresión no balanceada: { a * ( c + d ) ] - 5 }
 */

import java.util.*

fun expresionBalanceada(expresion: String): Boolean {
    val pila = Stack<Char>()

    for (caracter in expresion) {
        when (caracter) {
            '(', '{', '[' -> pila.push(caracter)
            ')', '}', ']' -> {
                if (pila.isEmpty()) {
                    return false
                }
                val delimitadorApertura = pila.pop()
                if (!esDelimitadorEquilibrado(delimitadorApertura, caracter)) {
                    return false
                }
            }
        }
    }

    return pila.isEmpty()
}

fun esDelimitadorEquilibrado(apertura: Char, cierre: Char): Boolean {
    return (apertura == '(' && cierre == ')') ||
            (apertura == '{' && cierre == '}') ||
            (apertura == '[' && cierre == ']')
}

fun main() {
    val expresionBalanceada = "{[a * (c + d)] - 5}"
    val expresionNoBalanceada = "{a * (c + d)] - 5}"

    if (expresionBalanceada(expresionBalanceada)) {
        println("La expresión balanceada está balanceada.")
    } else {
        println("La expresión balanceada no está balanceada.")
    }

    if (expresionBalanceada(expresionNoBalanceada)) {
        println("La expresión no balanceada está balanceada.")
    } else {
        println("La expresión no balanceada no está balanceada.")
    }
}

