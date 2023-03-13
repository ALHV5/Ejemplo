import java.time.LocalDate;

public class Normal extends Grupo {

    public Normal(int numPersonas) {
        super(numPersonas);
    }

    public double pagar() {
        double precio = 0;
        precio = numBebidas * precioBebida + numRaciones * precioRacion;
        LocalDate hoy = LocalDate.now();

        if (hoy.getDayOfWeek().getValue() >= 0 && hoy.getDayOfWeek().getValue() <= 5)
            precio = precio * 0.9;
        // precio=preci-precio*0.1
        return precio;
    }

}
