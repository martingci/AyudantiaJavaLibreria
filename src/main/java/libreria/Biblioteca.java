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

    public boolean agregarLibro (String isbn, String titulo, String autor, String genero, int cantidad, boolean disponible) {
        if (libroUnico(isbn)) {
           Libro libro = new Libro(isbn, titulo, autor, genero, cantidad, disponible);
           this.libros.add(libro);
           return true;
        } else {
            buscarLibro(isbn).devolver();
            return false;
        }
    }

    public Libro buscarLibro (String isbn) {
        for (Libro libro : this.libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public void MostrarLibrosDisponibles () {
        for (Libro libro : this.libros) {
            if (libro.isDisponible()) {
                libro.mostrarInfo();
            }
        }
    }





}
