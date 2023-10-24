'''
Reto de "ASPECT RATIO DE UNA IMAGEN"
Dificultad: DIFÍCIL

Enunciado: Crea un programa que se encargue de calcular el aspect ratio de una imagen a partir de una url.
- Url de ejemplo: https://www.krispi.dev/assets/img/krispidev.png
- Por ratio hacemos referencia por ejemplo a los "16:9" de una imagen de 1920*1080px.
- Ejecuta pip install pillow en terminal
'''

from PIL import Image
import requests
from io import BytesIO

def calcular_aspect_ratio(url):
    try:
        # Descargar la imagen desde la URL
        response = requests.get(url)
        if response.status_code == 200:
            # Abrir la imagen y obtener sus dimensiones
            img = Image.open(BytesIO(response.content))
            width, height = img.size

            # Calcular el aspect ratio
            aspect_ratio = f"{width}:{height}"

            return aspect_ratio
        else:
            return "Error al descargar la imagen desde la URL"
    except Exception as e:
        return f"Error: {str(e)}"

# URL de ejemplo
url = "https://www.krispi.dev/assets/img/krispidev.png"

aspect_ratio = calcular_aspect_ratio(url)

if aspect_ratio:
    print(f"El aspect ratio de la imagen en la URL {url} es: {aspect_ratio}")
else:
    print("No se pudo calcular el aspect ratio.")
