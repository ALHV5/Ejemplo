import java.util.Arrays;

public class Representacion {
    private String codigo, titulo;
    private int dia, mes;
    private int entradasV, entradasN;
    private static double totalRecaudado;
    private static final double precioVip = 20, precioNormal = 14;
    private int reservas[][] = new int[7][4];

    public Representacion(String titulo, int dia, int mes) {
        this.titulo = titulo;
        this.dia = dia;
        this.mes = mes;
        this.codigo = titulo.substring(0, 3) + "-";
        if (mes < 10)
            this.codigo += "0" + mes;
        else
            this.codigo += "" + mes;
        if (dia < 10)
            this.codigo += "0" + dia;
        else
            this.codigo += " " + dia;
        this.entradasN = 25;
        this.entradasV = 15;
        this.reservas = new int[8][5];
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public boolean hayEntradas() {
        if (entradasV + entradasN > 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Representacion [codigo=" + codigo + ", titulo=" + titulo + ", dia=" + dia + ", mes=" + mes
                + ", entradasV=" + entradasV + ", entradasN=" + entradasN + ", reservas=" + Arrays.toString(reservas)
                + "]";
    }

    public String getCodigo() {
        return codigo;
    }

    public double comprar(int V, int N) {
        double precio;
        if (V > entradasV || N > entradasN) {
            return 0;
        }
        precio = V * precioVip + N * precioNormal;
        entradasV -= V;// Simplificado
        entradasN = entradasN - N;// Sin simplificar
        totalRecaudado += precio;
        return precio;
    }

    public void seleccionarEnt(int V, int N) {
        for (int i = 0; i < V; i++) {

            for (int f = 0; f < 7; f++) {
                for (int c = 0; c < 4; c++) {

                }
            }
        }
    }
}
