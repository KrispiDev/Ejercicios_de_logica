'''
Reto de "ÁREA DE UN POLÍGONO"
Dificultad: FÁCIL

Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
- La función recibirá por parámetro sólo UN polígono a la vez.
- Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
- Imprime el cálculo del área de un polígono de cada tipo.
'''

def calcular_area_poligono(poligono):
    if isinstance(poligono, dict):
        tipo = poligono.get("tipo")
        if tipo:
            if tipo == "triangulo":
                base = poligono.get("base")
                altura = poligono.get("altura")
                if base is not None and altura is not None:
                    area = 0.5 * base * altura
                    print(f"El área del triángulo es: {area}")
                else:
                    print("Faltan datos para calcular el área del triángulo.")
            elif tipo == "cuadrado":
                lado = poligono.get("lado")
                if lado is not None:
                    area = lado ** 2
                    print(f"El área del cuadrado es: {area}")
                else:
                    print("Faltan datos para calcular el área del cuadrado.")
            elif tipo == "rectangulo":
                base = poligono.get("base")
                altura = poligono.get("altura")
                if base is not None and altura is not None:
                    area = base * altura
                    print(f"El área del rectángulo es: {area}")
                else:
                    print("Faltan datos para calcular el área del rectángulo.")
            else:
                print("Polígono no soportado.")
        else:
            print("Tipo de polígono no especificado.")
    else:
        print("Entrada no válida. Debe ser un diccionario.")

# Ejemplo de uso:
triangulo = {"tipo": "triangulo", "base": 5, "altura": 4}
cuadrado = {"tipo": "cuadrado", "lado": 3}
rectangulo = {"tipo": "rectangulo", "base": 6, "altura": 2}

calcular_area_poligono(triangulo)
calcular_area_poligono(cuadrado)
calcular_area_poligono(rectangulo)

