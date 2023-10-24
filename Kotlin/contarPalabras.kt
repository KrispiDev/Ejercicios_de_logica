package dev.krispi.contarPalabras

/*
 * Reto de "CONTANDO PALABRAS"
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que cuente cuantas veces se repite cada palabra y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.
 */

fun main() {
    val texto = """
        Este es un ejemplo de un programa que cuenta cuántas veces se repite cada palabra.
        Las palabras, sin importar si están en mayúsculas o minúsculas, deben contarse.
        También, se deben ignorar los signos de puntuación.
        """

    // Limpia el texto de signos de puntuación y lo divide en palabras
    val palabras = limpiarTexto(texto)

    // Crea un mapa para realizar un seguimiento de la frecuencia de las palabras
    val conteoPalabras = mutableMapOf<String, Int>()

    for (palabra in palabras) {
        // Convierte la palabra a minúsculas para que sea insensible a mayúsculas/minúsculas
        val palabraMinusc = palabra.toLowerCase()

        // Incrementa el contador de la palabra en el mapa
        conteoPalabras[palabraMinusc] = (conteoPalabras[palabraMinusc] ?: 0) + 1
    }

    // Muestra el recuento final de las palabras
    for ((palabra, frecuencia) in conteoPalabras) {
        println("'$palabra' se repite $frecuencia veces.")
    }
}

fun limpiarTexto(texto: String): List<String> {
    // Define los caracteres que se considerarán signos de puntuación
    val signosPuntuacion = setOf('.', ',', '!', '?', ':', ';', '-', '(', ')', '[', ']', '{', '}', '"', '\n')

    // Reemplaza los signos de puntuación por espacios en blanco y divide el texto en palabras
    var textoLimpio = texto
    for (signo in signosPuntuacion) {
        textoLimpio = textoLimpio.replace(signo, ' ')
    }

    // Divide el texto en palabras separadas por espacios en blanco
    val palabras = textoLimpio.split("\\s+".toRegex())

    return palabras.filter { it.isNotBlank() }
}
