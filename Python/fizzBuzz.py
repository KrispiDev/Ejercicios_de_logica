'''
Reto de "FIZZ BUZZ"
Dificultad: FÁCIL

Enunciado: Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
- Múltiplos de 3 por la palabra "fizz".
- Múltiplos de 5 por la palabra "buzz".
- Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
'''

for numero in range(1, 101):
    # Comprobar si es múltiplo de 3 y 5 primero
    if numero % 3 == 0 and numero % 5 == 0:
        print("fizzbuzz")
    # Luego, comprobar si es múltiplo de 3
    elif numero % 3 == 0:
        print("fizz")
    # Después, comprobar si es múltiplo de 5
    elif numero % 5 == 0:
        print("buzz")
    # Si no es múltiplo de 3 ni de 5, imprimir el número
    else:
        print(numero)
