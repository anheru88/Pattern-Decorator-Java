# Taller Patron Estrategia

### Enunciado

Se desea extender la funcionalidad de las estrategias de guardado (JSON y XML) desarrolladas en un taller anterior, agregando servicios de caching, encriptación (AES) y logging de operaciones. Estos servicios son opcionales y es posible que el cliente desee realizar combinaciones de estos, las cuales deben funcionar sin importar el tipo de estrategia de guardado utilizada. Lo anterior debe hacerse posible sin que sea necesario que cada combinación de servicios sea conocida en tiempo de compilación (se debe evitar una explosión combinatoria en el número de clases).

Para lo anterior ud. debe implementar el patrón decorador, de manera que se puedan agregar los servicios mencionados en tiempo de ejecución. A manera de ejemplo de funcionamiento de los servicios desarrollados, cree en tiempo de ejecución una estrategia JSON decorada con encriptación y caching, y además una estrategia XML con logging.

Recuerde que debe proporcionar el código fuente y un diagrama de clases UML que detalle la estructura de la solución planteada.

> NOTA: Las estrategias de guardado deben permitir además de la operación de guardado (save), la búsqueda y recuperación (retrieve) de estudiantes por su nombre o código.

### Diagrama UML

![Digrama UML](/UML.png "Diagrama UML")
