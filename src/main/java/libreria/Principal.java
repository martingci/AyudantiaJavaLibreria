package libreria;

public class Principal {
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.inicializar();
    }

    public void inicializar () {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro("9788490677836", "El camino de los reyes", "Brandon Sanderson" , "Fantasia", 3, true);
        Libro libro2 = new Libro("9788497930453", "El Tunel", "Ernesto Sabato" , "Existencialista", 1, true);
        Libro libro3 = new Libro("9780441013593", "Dune", "Frank Herbert" , "Ciencia Ficcion", 2, true);
        Libro libro4 = new Libro("9780451524935", "1984", "George Orwell" , "Ciencia Ficcion", 0, false);
        Libro libro5 = new Libro("9788498725195", "El Imperio Final", "Brandon Sanderson" , "Fantasia", 3, true);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        biblioteca.agregarLibro(libro5);
        biblioteca.mostrarLibrosDisponibles();
        System.out.println("\n\n");
        biblioteca.prestarLibro("El Tunel");
        biblioteca.mostrarLibrosDisponibles();
        System.out.println("\n\n");
        biblioteca.mostrarLibroPorTitulo("El Tunel");
        System.out.println("\n\n");
        biblioteca.mostrarLibrosPorAutor("Brandon Sanderson");
        System.out.println("\n\n");
        biblioteca.eliminarLibro("1984");
        biblioteca.mostrarLibrosDisponibles();
    }
}
