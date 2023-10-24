'''
Reto de "CONTANDO PALABRAS"
Dificultad: MEDIA
 
Enunciado: Crea un programa que cuente cuantas veces se repite cada palabra y que muestre el recuento final de todas ellas.
- Los signos de puntuación no forman parte de la palabra.
- Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
- No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.
'''

import string

def contar_palabras(texto):
    # Eliminar signos de puntuación y convertir a minúsculas
    translator = str.maketrans('', '', string.punctuation)
    texto = texto.translate(translator).lower()

    # Tokenizar el texto en palabras
    palabras = texto.split()

    # Crear un diccionario para contar las palabras
    contador = {}
    for palabra in palabras:
        if palabra in contador:
            contador[palabra] += 1
        else:
            contador[palabra] = 1

    return contador

# Ejemplo de uso
texto = "Este es un ejemplo de texto. Este es un ejemplo de palabra. Palabra, palabra."
resultado = contar_palabras(texto)

# Mostrar el recuento final de palabras
for palabra, conteo in resultado.items():
    print(f"{palabra}: {conteo}")
