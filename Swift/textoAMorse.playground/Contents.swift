import UIKit

/*
 * Reto de "CÓDIGO MORSE"
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que sea capaz de transformar texto natural a código morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en https://es.wikipedia.org/wiki/Código_morse.
 */

let morseToText = [
    "A": ".-", "B": "-...", "C": "-.-.", "D": "-..", "E": ".",
    "F": "..-.", "G": "--.", "H": "....", "I": "..", "J": ".---",
    "K": "-.-", "L": ".-..", "M": "--", "N": "-.", "O": "---",
    "P": ".--.", "Q": "--.-", "R": ".-.", "S": "...", "T": "-",
    "U": "..-", "V": "...-", "W": ".--", "X": "-..-", "Y": "-.--",
    "Z": "--..", "0": "-----", "1": ".----", "2": "..---", "3": "...--",
    "4": "....-", "5": ".....", "6": "-....", "7": "--...", "8": "---..",
    "9": "----.", ".": ".-.-.-", ",": "--..--", "?": "..--..",
    "'": ".----.", "!": "-.-.--", "/": "-..-.", "(": "-.--.", ")": "-.--.-",
    "&": ".-...", ":": "---...", ";": "-.-.-.", "=": "-...-", "+": ".-.-.",
    "-": "-....-", "_": "..--.-", "\"": ".-..-.", "$": "...-..-", "@": ".--.-."
]

func textoAMorse(_ texto: String) -> String {
    var morse = ""
    
    for caracter in texto.uppercased() {
        if let codigoMorse = morseToText[String(caracter)] {
            morse += codigoMorse + " "
        } else if caracter == " " {
            morse += " "
        }
    }
    
    return morse
}

func morseATexto(_ morse: String) -> String {
    var texto = ""
    let palabras = morse.components(separatedBy: "  ")  // Separar palabras
    
    for palabraMorse in palabras {
        let letrasMorse = palabraMorse.components(separatedBy: " ")  // Separar letras
        for letraMorse in letrasMorse {
            if let caracter = morseToText.first(where: { $0.value == letraMorse })?.key {
                texto += caracter
            }
        }
        texto += " "  // Agregar espacio entre palabras
    }
    
    return texto
}

let entrada = "Hola Mundo"  // Cambia la entrada según lo que desees convertir

if entrada.contains(".") || entrada.contains("-") {
    let textoConvertido = morseATexto(entrada)
    print("Texto original: \(textoConvertido)")
} else {
    let morseConvertido = textoAMorse(entrada)
    print("Morse: \(morseConvertido)")
}

