public class Tenedor extends Grupo {
    public Tenedor(int numPersonas, String codigo) {
        super(numPersonas);
    }

    private String codigo;

    public double pagar() {
        double precio = 0;
        try {
            double descuento = Double.parseDouble(codigo.substring(2));
        } catch (NumberFormatException e) {
            System.out.println("El codigo es incorrecto, no se aplican descuentos");
            precio = precioBebida * numBebidas + precioRacion * numRaciones + (precioRacion * numRaciones / 100);
        }
        precio = precioBebida * numBebidas;
        return precio;
    }

}