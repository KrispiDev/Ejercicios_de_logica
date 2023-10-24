import UIKit

/*
 * Reto de "ÁREA DE UN POLÍGONO"
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */


func calcularAreaPoligono(base: Double, altura: Double, tipo: String) -> Double {
    var area: Double = 0.0
    
    switch tipo {
    case "triangulo":
        area = (base * altura) / 2.0
        print("Área del triángulo: \(area)")
    case "cuadrado":
        area = base * base
        print("Área del cuadrado: \(area)")
    case "rectangulo":
        area = base * altura
        print("Área del rectángulo: \(area)")
    default:
        print("Polígono no soportado")
    }
    
    return area
}

// Ejemplos de uso
let areaTriangulo = calcularAreaPoligono(base: 5.0, altura: 4.0, tipo: "triangulo")
let areaCuadrado = calcularAreaPoligono(base: 4.0, altura: 4.0, tipo: "cuadrado")
let areaRectangulo = calcularAreaPoligono(base: 6.0, altura: 3.0, tipo: "rectangulo")

