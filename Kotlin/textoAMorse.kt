package dev.krispi.textoAMorse

/*
 * Reto de "CÓDIGO MORSE"
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que sea capaz de transformar texto natural a código morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en https://es.wikipedia.org/wiki/Código_morse.
 */

fun textoNaturalAMorse(texto: String): String {
    val morseAlphabet = mapOf(
        'A' to ".-", 'B' to "-...", 'C' to "-.-.", 'D' to "-..", 'E' to ".",
        'F' to "..-.", 'G' to "--.", 'H' to "....", 'I' to "..", 'J' to ".---",
        'K' to "-.-", 'L' to ".-..", 'M' to "--", 'N' to "-.", 'O' to "---",
        'P' to ".--.", 'Q' to "--.-", 'R' to ".-.", 'S' to "...", 'T' to "-",
        'U' to "..-", 'V' to "...-", 'W' to ".--", 'X' to "-..-", 'Y' to "-.--",
        'Z' to "--..", '0' to "-----", '1' to ".----", '2' to "..---", '3' to "...--",
        '4' to "....-", '5' to ".....", '6' to "-....", '7' to "--...", '8' to "---..",
        '9' to "----."
    )

    val words = texto.trim().split("  ") // Dividir por espacios dobles para separar palabras
    val result = StringBuilder()

    for (word in words) {
        val letters = word.split(' ')
        for (letter in letters) {
            for ((char, morse) in morseAlphabet) {
                if (morse == letter) {
                    result.append(char)
                    break
                }
            }
        }
        result.append(' ')
    }

    return result.toString().trim()
}

fun detectarTipoDeTexto(texto: String): String {
    val morsePattern = "^[.\\-\\s]+$".toRegex()
    return when {
        morsePattern.matches(texto) -> "Morse"
        else -> "Texto Natural"
    }
}

fun main() {
    val entrada = "HELLO WORLD" // Cambia la entrada a texto o morse según lo desees
    val tipoDeTexto = detectarTipoDeTexto(entrada)

    val resultado = when (tipoDeTexto) {
        "Morse" -> textoNaturalAMorse(entrada)
        "Texto Natural" -> textoNaturalAMorse(entrada)
        else -> "Entrada no válida"
    }

    println("Entrada ($tipoDeTexto): $entrada")
    println("Resultado: $resultado")
}
