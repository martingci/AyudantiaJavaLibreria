package libreria;

public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private String isbn;
    private int cantidad;
    private boolean disponible;

    public Libro (String isbn, String titulo, String autor, String genero, int cantidad, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.isbn = isbn;
        this.cantidad = cantidad;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void prestar() {
        this.cantidad--;
    }

    public void devolver() {
        this.cantidad++;
    }

    public void mostrarInfo () {
        System.out.print("ISBN: " + this.isbn);
        System.out.print("| Titulo: " + this.titulo);
        System.out.print("| Autor: " + this.autor);
        System.out.print("| Genero: " + this.genero);
        System.out.print("| Cantidad Disponible: " + this.cantidad);
        System.out.print("| Disponible: " + this.disponible);
    }



}