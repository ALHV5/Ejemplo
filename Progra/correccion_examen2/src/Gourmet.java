public class Gourmet extends Grupo {
    private static int totalGourmet = 0;

    public Gourmet(int numPersonas) {
        super(numPersonas);
    }

    public double pagar() {
        double precio = 0;
        if (numBebidas > numPersonas)
            numBebidas -= numPersonas;
        precio = numBebidas * precioBebida + numRaciones * precioRacion;
        totalGourmet += numPersonas;
        return precio;
    }

    public static int getTotalGourmet() {
        return totalGourmet;
    }

}
