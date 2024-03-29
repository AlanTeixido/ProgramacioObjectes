## 1. Diagrama UML de Clases

El diagrama de clases en UML representa la estructura estática de un sistema, mostrando las clases, sus atributos y métodos, así como las relaciones entre ellas. Algunos elementos clave son:

- **Clase**: Representa un conjunto de objetos con características y comportamientos similares.
- **Atributo**: Una propiedad o característica de una clase.
- **Método**: Una acción que una clase puede realizar.
- **Asociación**: Una relación entre dos clases que indica que un objeto de una clase está relacionado con un objeto de otra clase.
- **Herencia**: Representa la relación entre una clase base y una clase derivada, indicando que la clase derivada hereda los atributos y métodos de la clase base.
- **Interfaz**: Define un conjunto de métodos que una clase debe implementar.

## 2. Diagrama de Casos de Uso

El diagrama de casos de uso en UML describe la interacción entre el sistema y sus usuarios. Aquí hay algunos conceptos importantes:

- **Actor**: Representa un rol o usuario que interactúa con el sistema.
- **Caso de Uso**: Describe una funcionalidad del sistema que proporciona valor a un actor.
- **Relación de Inclusión**: Indica que un caso de uso incluye otro caso de uso.
- **Relación de Extensión**: Indica que un caso de uso puede ser extendido por otro caso de uso.

## Teoria de representación

### En el Diagrama UML de Clases:

- **Línea Sólida**: Se utiliza para mostrar una relación de asociación entre dos clases. Indica que una instancia de una clase se asocia con una instancia de la otra clase.

- **Línea con Diamante Vacío**: Representa una relación de agregación entre dos clases. Indica que una clase (todo) "tiene" o "está compuesta por" otras clases (partes). Las partes pueden existir independientemente del todo.

- **Línea con Diamante Lleno**: Indica una relación de composición entre dos clases. Es similar a la agregación, pero con una relación más fuerte, lo que significa que las partes no pueden existir sin el todo.

- **Línea con Flecha Punteada**: Se utiliza para representar una relación de herencia entre una clase base y una clase derivada. Indica que la clase derivada hereda atributos y métodos de la clase base.

### En el Diagrama de Casos de Uso:

- **Línea Sólida**: Se usa para conectar un actor con un caso de uso principal, indicando que el actor está involucrado en ese caso de uso.

- **Línea Discontinua**: Representa una relación de inclusión entre casos de uso. Indica que un caso de uso incluye otro caso de uso. Esta relación se activa solo en ciertas condiciones, especificadas en el caso de uso principal.

- **Línea con Flecha Punteada**: Indica una relación de extensión entre casos de uso. Se usa para mostrar que un caso de uso puede ser extendido por otro caso de uso en ciertas condiciones.


## 1. Diagrama UML de Clases

El diagrama de clases en UML representa la estructura estática de un sistema, mostrando las clases, sus atributos y métodos, así como las relaciones entre ellas. Aquí está la teoría de representación para las clases:

### Clases:

Para representar una clase en un diagrama UML, sigue estos pasos:

1. Dibuja un rectángulo.
2. Escribe el nombre de la clase en la parte superior del rectángulo.
3. Divide el rectángulo en tres secciones:
   - La sección superior para los atributos.
   - La sección media para los métodos.
   - La sección inferior para los métodos.
4. Escribe los atributos y métodos dentro de las secciones correspondientes.

### Ejemplo:

```plantuml
+-------------------+
|   Cliente         |
+-------------------+
| nombre: String    |
| edad: int         |
+-------------------+
| comprar()         |
| devolver()        |
+-------------------+
```

## 2. Diagrama de Casos de Uso

El diagrama de casos de uso en UML describe la interacción entre el sistema y sus usuarios. Aquí está la teoría de representación para los casos de uso:

### Casos de Uso:

Para representar un caso de uso en un diagrama UML, sigue estos pasos:

1. Dibuja un óvalo.
2. Escribe el nombre del caso de uso dentro del óvalo.
3. Conecta los actores con los casos de uso mediante líneas.

### Ejemplo:

```plantuml
  Usuario
    |
+------------+
|  Realizar  |
|  Compra    |
+------------+
    |        \    <<includes>>
  Seleccionar  \
   Producto    \
                \
                 \
                  \
                  Aplicar Descuento
```
