'''
Reto de "SECUENCIA FIBONACCI"
Dificultad: DIFÍCIL

Enunciado: Escribe un programa que muestre los primeros 50 números de la secuencia de Fibonacci, comenzando con 0.
 
La serie de Fibonacci es una secuencia de números en la que cada número siguiente es la suma de los dos números anteriores.
La secuencia inicia con 0, y los números subsiguientes son 1, 1, 2, 3, 5, 8, 13 y así sucesivamente, siguiendo la regla de la suma de los dos números anteriores. El programa debe imprimir los primeros 50 números de esta secuencia.
'''

def fibonacci(n):
    fib = [0, 1]
    while len(fib) < n:
        fib.append(fib[-1] + fib[-2])
    return fib

# Imprimir los primeros 50 números de Fibonacci
n = 50
resultado = fibonacci(n)

for num in resultado:
    print(num, end=" ")
