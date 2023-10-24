import UIKit

/*
 * Reto de "INVIRTIENDO CADENAS"
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */

func invertirCadena(_ cadena: String) -> String {
    var resultado = ""
    for caracter in cadena {
        resultado = String(caracter) + resultado
    }
    return resultado
}

let texto = "Hola mundo"
let textoInvertido = invertirCadena(texto)
print(textoInvertido)
