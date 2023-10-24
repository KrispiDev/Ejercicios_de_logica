package dev.krispi.calcularAspectRatioDesdeURL

/*
 * Reto de "ASPECT RATIO DE UNA IMAGEN"
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Crea un programa que se encargue de calcular el aspect ratio de una imagen a partir de una url.
 * - Url de ejemplo: https://www.krispi.dev/assets/img/krispidev.png
 * - Por ratio hacemos referencia por ejemplo a los "16:9" de una imagen de 1920*1080px.
 */

import java.awt.Image
import java.awt.image.BufferedImage
import java.net.URL
import javax.imageio.ImageIO

fun main() {
    val imageUrl = "https://www.krispi.dev/assets/img/krispidev.png"

    try {
        val url = URL(imageUrl)
        val image = ImageIO.read(url)

        val width = image.width
        val height = image.height

        val aspectRatio = calcularAspectRatio(width, height)

        println("Ancho de la imagen: $width")
        println("Alto de la imagen: $height")
        println("Aspect Ratio: $aspectRatio")
    } catch (e: Exception) {
        println("Error al acceder a la imagen: ${e.message}")
    }
}

fun calcularAspectRatio(ancho: Int, alto: Int): String {
    val gcd = gcd(ancho, alto)
    val ratio = "${ancho / gcd}:${alto / gcd}"
    return ratio
}

fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}
