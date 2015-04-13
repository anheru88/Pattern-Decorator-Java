# Taller Patron Estrategia

### Enunciado
Ud. es contratado para desarrollar una pequeña aplicación de consola que tome la información de N estudiantes (nombre, código, edad, sexo, dirección) y proceda a guardarla en un archivo. El formato del archivo será XML, y la estructura del archivo deberá ser similar a la siguiente:
```xml
<estudiantes>
    <estudiante>
        <nombre>John Connor</nombre>
        <codigo>T-1000</codigo>
        <edad>25</edad>
        <sexo>M</sexo>
        <direccion>Desconocida</direccion>
    </estudiante>
    <estudiante>
    …
    </estudiante>
    …
<estudiantes>
```

Imagine que luego de desarrollar la aplicación, se le pide que la aplicación también pueda guardar los datos en formato JSON, lo que se vería de la siguiente manera:
``` json
{"estudiantes": [
{
    "nombre": "John Connor",
    "codigo": "T-1000",
    "edad": 25,
    "sexo": "M",
    "direccion": "Desconocida"
},
{…},
…
}
```

Aplique el patrón Strategy para diseñar e implementar una solución que cumpla el principio OpenClosed, y satisfacer los requerimientos del cliente.

> NOTA: Ud debe adjuntar tanto el código desarrollado como un diagrama de
clases UML que detalle la estructura de clases resultante

### Diagrama UML

![Digrama UML](/UML.png "Diagrama UML")
