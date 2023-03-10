package Herenciia.P10E1.src;

public class Texto extends Libro {
    private String curso;
    private double descuento;

    public Texto(String titulo, String autor, String editorial, double precio, String curso, double descuento) {
        super(titulo, autor, editorial, precio);
        this.curso = curso;
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Curso: " + curso + ", descuento: " + descuento + ", titulo: " + titulo + ", autor: " + autor
                + ", editorial: " + editorial + ", precio: " + precio;
    }
}
