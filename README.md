# Ejercicio Introducción POO: Biblioteca y Libros

## Descripción
Este ejercicio consiste en la creación de un programa para gestionar libros en una biblioteca. El sistema debe permitir agregar libros, prestarlos, devolverlos, buscar libros por título o autor, eliminar libros y consultar cuáles están disponibles. Para ello, se implementarán dos clases: `Libro` y `Biblioteca`, que trabajarán juntas para administrar los libros.

## Clases

### Clase `Libro`
La clase `Libro` contiene los siguientes atributos y métodos:

#### Atributos:
- `titulo` (String): El título del libro.
- `autor` (String): El nombre del autor del libro.
- `genero` (String): El género del libro.
- `ISBN` (String): El código ISBN del libro.
- `cantidadDisponible` (int): La cantidad disponible del libro.
- `disponible` (boolean): Indica si el libro está disponible o no para ser prestado.

#### Métodos:
- **Constructor:** Inicializa los atributos.
- **Getters y Setters** para cada atributo.
- **prestar():** Reduce `cantidadDisponible` en 1 y marca el libro como no disponible si no quedan copias.
- **devolver():** Aumenta `cantidadDisponible` en 1 y marca el libro como disponible si la cantidad de copias era 0.
- **mostrarInfo():** Imprime la información del libro (título, autor, género, ISBN, cantidad disponible y si está disponible o no).

### Clase `Biblioteca`
La clase `Biblioteca` contiene los siguientes atributos y métodos:

#### Atributos:
- `nombre` (String): Nombre de la biblioteca.
- `libros` (ArrayList<Libro>): Una lista que almacena los libros que tiene la biblioteca.

#### Métodos:
- **Constructor:** Inicializa el nombre de la biblioteca y crea una lista vacía de libros.
- **agregarLibro(Libro libro):** Agrega un libro a la lista de libros de la biblioteca. Si un libro con el mismo ISBN ya existe, aumenta `cantidadDisponible` del libro existente en lugar de agregar uno nuevo.
- **mostrarLibrosDisponibles():** Muestra solo los libros que están disponibles.
- **buscarLibroPorTitulo(String titulo):** Busca un libro por su título y lo devuelve si lo encuentra.
- **buscarLibrosPorAutor(String autor):** Busca todos los libros de un autor y los devuelve.
- **eliminarLibro(String titulo):** Elimina un libro de la biblioteca si coincide con el título y la cantidad disponible es cero.
- **prestarLibro(String titulo):** Busca el libro por título y lo presta si está disponible.
- **devolverLibro(String titulo):** Busca el libro por título y lo devuelve.

## Instrucciones de uso

1. Crear un objeto de la clase `Biblioteca`.
2. Crear varios objetos de la clase `Libro` y agregarlos a la biblioteca.
3. Mostrar la lista de libros disponibles.
4. Prestar un libro y volver a mostrar la lista de libros disponibles.
5. Devolver un libro y mostrar nuevamente la lista de libros disponibles.
6. Buscar un libro por su título.
7. Buscar libros de un autor específico.
8. Eliminar un libro de la biblioteca y mostrar la lista actualizada de libros.
