package libreria;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public boolean libroUnico (String isbn) {
        for (Libro libro : this.libros) {
            if (libro.getIsbn().equals(isbn)) {
                return false;
            }
        }
        return true;
    }

    public boolean agregarLibro (Libro libro) {
        if (libroUnico(libro.getIsbn())) {
           this.libros.add(libro);
           return true;
        } else {
            buscarLibroPorIsbn(libro.getIsbn()).devolver();
            return false;
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : this.libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public Libro buscarLibroPorTitulo (String titulo) {
        for (Libro libro : this.libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public void mostrarLibrosDisponibles () {
        for (Libro libro : this.libros) {
            if (libro.isDisponible()) {
                libro.mostrarInfo();
            }
        }
    }

    public boolean mostrarLibroPorTitulo (String titulo) {
        for (Libro libro : this.libros) {
            if (libro.getTitulo().equals(titulo)) {
                libro.mostrarInfo();
                return true;
            }
        }
        return false;
    }

    public boolean mostrarLibrosPorAutor (String autor) {
        for (Libro libro : this.libros) {
            if (libro.getAutor().equals(autor)) {
                libro.mostrarInfo();
            }
        }
        return false;
    }

    public boolean eliminarLibro (String titulo) {
        Libro libro = this.buscarLibroPorIsbn(titulo);
        if (libro != null && !libro.isDisponible())  {
            this.libros.remove(libro);
            return true;
        }
        return false;
    }

    public boolean prestarLibro (String titulo) {
        Libro libro = this.buscarLibroPorTitulo(titulo);
        if (libro != null && libro.isDisponible())  {
            libro.prestar();
            return true;
        }
        return false;
    }

    public boolean devolverLibro (String titulo) {
        Libro libro = this.buscarLibroPorTitulo(titulo);
        if (libro != null)  {
            libro.devolver();
            return true;
        }
        return false;
    }
}
