'''
Reto de "¿ES UN NÚMERO PRIMO?"
Dificultad: MEDIA

Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
Hecho esto, imprime los números primos entre 1 y 100.
'''

def es_primo(numero):
    if numero <= 1:
        return False
    if numero <= 3:
        return True
    if numero % 2 == 0 or numero % 3 == 0:
        return False
    i = 5
    while i * i <= numero:
        if numero % i == 0 or numero % (i + 2) == 0:
            return False
        i += 6
    return True

def imprimir_primos_en_rango(rango):
    for num in range(2, rango + 1):
        if es_primo(num):
            print(num)

# Imprimir números primos entre 1 y 100
print("Números primos entre 1 y 100:")
imprimir_primos_en_rango(100)
