import UIKit

/*
 * Reto de "DECIMAL A BINARIO"
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa se encargue de transformar un número decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */

func decimalABinario(_ numero: Int) -> String {
    if numero == 0 {
        return "0"
    }
    
    var numeroDecimal = numero
    var binario = ""
    
    while numeroDecimal > 0 {
        let bit = numeroDecimal % 2
        binario = String(bit) + binario
        numeroDecimal = numeroDecimal / 2
    }
    
    return binario
}

let numeroDecimal = 42 // Cambia este número al que desees convertir a binario
let binario = decimalABinario(numeroDecimal)
print("El número decimal \(numeroDecimal) en binario es \(binario)")

