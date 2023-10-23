'''
¿ES UN ANAGRAMA?
Dificultad: MEDIA

Enunciado: Escribe una función que acepte dos cadenas de texto (String) y devuelva un valor booleano (Bool) que indique si las 
dos cadenas son anagramas o no.

Un anagrama es una palabra o frase que se forma reorganizando todas las letras de otra palabra o frase original.
No es necesario verificar si ambas cadenas existen.
Es importante destacar que dos cadenas idénticas no se consideran anagramas.
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

