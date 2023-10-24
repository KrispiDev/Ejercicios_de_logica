import UIKit

/*
 * Reto de "¿ES UN NÚMERO PRIMO?"
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

func esPrimo(_ numero: Int) -> Bool {
    if numero <= 1 {
        return false
    }
    if numero <= 3 {
        return true
    }
    
    if numero % 2 == 0 || numero % 3 == 0 {
        return false
    }
    
    var i = 5
    while i * i <= numero {
        if numero % i == 0 || numero % (i + 2) == 0 {
            return false
        }
        i += 6
    }
    
    return true
}

func numerosPrimosHasta100() {
    for numero in 1...100 {
        if esPrimo(numero) {
            print(numero)
        }
    }
}

numerosPrimosHasta100()

