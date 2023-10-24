import UIKit

/*
 * Reto de "SECUENCIA FIBONACCI"
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Escribe un programa que muestre los primeros 50 números de la secuencia de Fibonacci, comenzando con 0.
 
 * La serie de Fibonacci es una secuencia de números en la que cada número siguiente es la suma de los dos números anteriores.
 * La secuencia inicia con 0, y los números subsiguientes son 1, 1, 2, 3, 5, 8, 13 y así sucesivamente, siguiendo la regla de la suma de los dos números anteriores. El programa debe imprimir los primeros 50 números de esta secuencia.
 */

func fibonacciSequence(n: Int) -> [Int] {
    if n <= 0 {
        return []
    } else if n == 1 {
        return [0]
    } else if n == 2 {
        return [0, 1]
    }
    
    var sequence = [0, 1]
    
    while sequence.count < n {
        let nextNumber = sequence[sequence.count - 1] + sequence[sequence.count - 2]
        sequence.append(nextNumber)
    }
    
    return sequence
}

let n = 50 // Cambia n al número de términos que desees en la secuencia
let result = fibonacciSequence(n: n)
print(result)


