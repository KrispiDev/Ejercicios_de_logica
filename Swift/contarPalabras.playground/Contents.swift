import UIKit

/*
 * Reto de "CONTANDO PALABRAS"
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que cuente cuantas veces se repite cada palabra y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.
 */

func contarPalabras(texto: String) -> [String: Int] {
    var palabraContador = [String: Int]()
    
    let separadores = CharacterSet.whitespacesAndNewlines.union(CharacterSet.punctuationCharacters)
    let palabras = texto.components(separatedBy: separadores)
    
    for palabra in palabras {
        // Eliminar signos de puntuación y normalizar a minúsculas
        let palabraLimpia = palabra.lowercased().trimmingCharacters(in: separadores)
        
        // Ignorar palabras vacías
        if !palabraLimpia.isEmpty {
            if let contador = palabraContador[palabraLimpia] {
                palabraContador[palabraLimpia] = contador + 1
            } else {
                palabraContador[palabraLimpia] = 1
            }
        }
    }
    
    return palabraContador
}

let texto = "Este es un ejemplo. Este es otro ejemplo, un ejemplo más."
let recuentoPalabras = contarPalabras(texto: texto)

for (palabra, contador) in recuentoPalabras {
    print("\(palabra): \(contador)")
}

