import UIKit

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

func expresionBalanceada(_ expresion: String) -> Bool {
    var pila = [Character]()
    let delimitadores: [Character: Character] = [")": "(", "}": "{", "]": "["]
    
    for caracter in expresion {
        if let apertura = delimitadores[caracter] {
            pila.append(apertura)
        } else if delimitadores.values.contains(caracter) {
            if pila.isEmpty || pila.removeLast() != caracter {
                return false
            }
        }
    }
    
    return pila.isEmpty
}

let expresion1 = "{ [ a * ( c + d ) ] - 5 }"
let expresion2 = "{ a * ( c + d ) ] - 5 }"

if expresionBalanceada(expresion1) {
    print("La expresión 1 está balanceada.")
} else {
    print("La expresión 1 no está balanceada.")
}

if expresionBalanceada(expresion2) {
    print("La expresión 2 está balanceada.")
} else {
    print("La expresión 2 no está balanceada.")
}

