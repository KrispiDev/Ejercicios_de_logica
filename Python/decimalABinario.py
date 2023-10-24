'''
Reto de "DECIMAL A BINARIO"
Dificultad: FÁCIL

Enunciado: Crea un programa se encargue de transformar un número decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
'''

def decimal_a_binario(decimal):
    if decimal == 0:
        return '0'

    binario = ""
    while decimal > 0:
        residuo = decimal % 2
        binario = str(residuo) + binario
        decimal //= 2

    return binario

# Ejemplo de uso
numero_decimal = 42
numero_binario = decimal_a_binario(numero_decimal)

print(f"El número decimal {numero_decimal} en binario es: {numero_binario}")
