import UIKit

/*
 * ¿ES UN ANAGRAMA?
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que acepte dos cadenas de texto (String) y devuelva un valor booleano (Bool) que indique si las dos cadenas son anagramas o no.
 * Un anagrama es una palabra o frase que se forma reorganizando todas las letras de otra palabra o frase original.
 * No es necesario verificar si ambas cadenas existen.
 * Es importante destacar que dos cadenas idénticas no se consideran anagramas.
 */


func sonAnagramas(_ palabra1: String, _ palabra2: String) -> Bool {
    // Elimina los espacios en blanco y convierte las palabras a minúsculas
    let palabra1Limpia = palabra1.lowercased().replacingOccurrences(of: " ", with: "")
    let palabra2Limpia = palabra2.lowercased().replacingOccurrences(of: " ", with: "")
    
    // Comprueba si las palabras tienen la misma cantidad de letras
    if palabra1Limpia.count != palabra2Limpia.count {
        return false
    }
    
    // Convierte las palabras a arreglos de caracteres y los ordena
    let arregloPalabra1 = Array(palabra1Limpia)
    let arregloPalabra2 = Array(palabra2Limpia)
    
    let palabraOrdenada1 = String(arregloPalabra1.sorted())
    let palabraOrdenada2 = String(arregloPalabra2.sorted())
    
    // Compara las palabras ordenadas
    return palabraOrdenada1 == palabraOrdenada2
}

// Ejemplo de uso:
let palabra1 = "listen"
let palabra2 = "silent"

if sonAnagramas(palabra1, palabra2) {
    print("Son anagramas")
} else {
    print("No son anagramas")
}

