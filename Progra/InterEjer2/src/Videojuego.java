public class Videojuego implements Prestable {
    public String titulo, genero, compañia;
    public boolean prestado;
    public int numhoras;

    public Videojuego(String titulo, int numhoras, boolean prestado, String genero, String compañia) {
        this.titulo = titulo;
        numhoras = 10;
        prestado = true;
        this.genero = genero;
        this.compañia = compañia;

    }

    @Override
    public boolean prestar() {
        prestado = true;
        return prestado;
    }

    @Override
    public boolean devolver() {
        prestado = false;
        return prestado;
    }

    @Override
    public void isEntregado() {
        System.out.println(prestado);
    }

}