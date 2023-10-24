import UIKit

/*
 * Reto de "ASPECT RATIO DE UNA IMAGEN"
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Crea un programa que se encargue de calcular el aspect ratio de una imagen a partir de una url.
 * - Url de ejemplo: https://www.krispi.dev/assets/img/krispidev.png
 * - Por ratio hacemos referencia por ejemplo a los "16:9" de una imagen de 1920*1080px.
 */

func calcularAspectRatioDesdeURL(url: URL, completion: @escaping (String?) -> Void) {
    URLSession.shared.dataTask(with: url) { (data, _, error) in
        if let data = data, let imagen = UIImage(data: data) {
            let width = imagen.size.width
            let height = imagen.size.height
            
            let gcd = greatestCommonDivisor(Int(width), Int(height))
            let aspectRatio = "\(Int(width / CGFloat(gcd))):\(Int(height / CGFloat(gcd)))"
            
            completion(aspectRatio)
        } else {
            completion(nil)
        }
    }.resume()
}

// Función para calcular el máximo común divisor
func greatestCommonDivisor(_ a: Int, _ b: Int) -> Int {
    if b == 0 {
        return a
    } else {
        return greatestCommonDivisor(b, a % b)
    }
}

if let url = URL(string: "https://www.krispi.dev/assets/img/krispidev.png") {
    calcularAspectRatioDesdeURL(url: url) { aspectRatio in
        if let aspectRatio = aspectRatio {
            print("Aspect Ratio: \(aspectRatio)")
        } else {
            print("No se pudo obtener la imagen o calcular el aspect ratio.")
        }
    }
} else {
    print("URL no válida")
}

