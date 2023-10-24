'''
Reto de "CÓDIGO MORSE"
Dificultad: MEDIA

Enunciado: Crea un programa que sea capaz de transformar texto natural a código morse y viceversa.
- Debe detectar automáticamente de qué tipo se trata y realizar la conversión.
- En morse se soporta raya "—", punto ".", un espacio " " entre letras o símbolos y dos espacios entre palabras "  ".
- El alfabeto morse soportado será el mostrado en https://es.wikipedia.org/wiki/Código_morse.
'''

def son_anagramas(palabra1, palabra2):
    # Eliminar espacios y convertir todo a minúsculas para comparar de manera uniforme
    palabra1 = palabra1.replace(" ", "").lower()
    palabra2 = palabra2.replace(" ", "").lower()

    # Comprobar si las palabras tienen la misma cantidad de letras
    if len(palabra1) != len(palabra2):
        return False

    # Crear diccionarios para contar las letras en ambas palabras
    contador1 = {}
    contador2 = {}

    # Contar las letras en la primera palabra
    for letra in palabra1:
        if letra in contador1:
            contador1[letra] += 1
        else:
            contador1[letra] = 1

    # Contar las letras en la segunda palabra
    for letra in palabra2:
        if letra in contador2:
            contador2[letra] += 1
        else:
            contador2[letra] = 1

    # Comparar si los diccionarios son iguales
    return contador1 == contador2

# Ejemplos de uso
print(son_anagramas("listen", "silent"))  # Debe devolver True
print(son_anagramas("hello", "world"))    # Debe devolver False
print(son_anagramas("anagram", "nagaram")) # Debe devolver True

