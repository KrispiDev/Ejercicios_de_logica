package dev.krispi.calcularAreaPoligono

/*
 * Reto de "ÁREA DE UN POLÍGONO"
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */

// Definición de la interfaz Poligono
interface Poligono {
    fun calcularArea(): Double
}

// Implementación de la clase Triangulo
class Triangulo(private val base: Double, private val altura: Double) : Poligono {
    override fun calcularArea(): Double {
        return 0.5 * base * altura
    }
}

// Implementación de la clase Cuadrado
class Cuadrado(private val lado: Double) : Poligono {
    override fun calcularArea(): Double {
        return lado * lado
    }
}

// Implementación de la clase Rectangulo
class Rectangulo(private val base: Double, private val altura: Double) : Poligono {
    override fun calcularArea(): Double {
        return base * altura
    }
}

// Función para calcular y imprimir el área de un polígono
fun calcularArea(poligono: Poligono) {
    val nombrePoligono = when (poligono) {
        is Triangulo -> "Triángulo"
        is Cuadrado -> "Cuadrado"
        is Rectangulo -> "Rectángulo"
        else -> "Polígono Desconocido"
    }

    val area = poligono.calcularArea()
    println("El área de un $nombrePoligono es $area")
}

// Ejemplo de uso:
fun main() {
    val triangulo = Triangulo(5.0, 4.0)
    val cuadrado = Cuadrado(3.0)
    val rectangulo = Rectangulo(6.0, 7.0)

    calcularArea(triangulo)
    calcularArea(cuadrado)
    calcularArea(rectangulo)
}

