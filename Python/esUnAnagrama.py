'''
Reto de "¿ES UN ANAGRAMA?"
Dificultad: MEDIA

Enunciado: Escribe una función que acepte dos cadenas de texto (String) y devuelva un valor booleano (Bool) que indique si las dos cadenas son anagramas o no.
Un anagrama es una palabra o frase que se forma reorganizando todas las letras de otra palabra o frase original.
No es necesario verificar si ambas cadenas existen.
Es importante destacar que dos cadenas idénticas no se consideran anagramas.
'''

def son_anagramas(cadena1, cadena2):
    # Eliminar espacios en blanco y convertir a minúsculas
    cadena1 = cadena1.replace(" ", "").lower()
    cadena2 = cadena2.replace(" ", "").lower()

    # Verificar si las cadenas tienen la misma longitud
    if len(cadena1) != len(cadena2):
        return False

    # Ordenar las cadenas y comparar
    cadena1_sorted = ''.join(sorted(cadena1))
    cadena2_sorted = ''.join(sorted(cadena2))

    return cadena1_sorted == cadena2_sorted

# Ejemplo de uso
cadena1 = "listen"
cadena2 = "silent"
resultado = son_anagramas(cadena1, cadena2)

if resultado:
    print(f"'{cadena1}' y '{cadena2}' son anagramas.")
else:
    print(f"'{cadena1}' y '{cadena2}' no son anagramas.")
