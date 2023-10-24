'''
Reto de "EXPRESIONES EQUILIBRADAS"
Dificultad: MEDIA

Enunciado: Crea un programa que comprueba si los paréntesis, llaves y corchetes de una expresión están equilibrados.
- Equilibrado significa que estos delimitadores se abren y cieran en orden y de forma correcta.
- Paréntesis, llaves y corchetes son igual de prioritarios. No hay uno más importante que otro.
- Expresión balanceada: { [ a * ( c + d ) ] - 5 }
- Expresión no balanceada: { a * ( c + d ) ] - 5 }
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
