'''
Reto de "INVIRTIENDO CADENAS"
Dificultad: FÁCIL

Enunciado: Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje que lo hagan de forma automática.
- Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
'''

def invertir_cadena(cadena):
    cadena_invertida = ""
    for caracter in reversed(cadena):
        cadena_invertida += caracter
    return cadena_invertida

# Ejemplo de uso
cadena_original = "Hola mundo"
cadena_invertida = invertir_cadena(cadena_original)

print(f"Cadena original: {cadena_original}")
print(f"Cadena invertida: {cadena_invertida}")
