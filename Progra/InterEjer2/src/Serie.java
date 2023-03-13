public class Serie implements Prestable {
    private String titulo, genero;
    public boolean prestado;
    private int numtemp;

    public Serie(String titulo, int numtemp, boolean prestado, String genero) {
        this.titulo = titulo;
        numtemp = 3;
        prestado = false;
        this.genero = genero;

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
