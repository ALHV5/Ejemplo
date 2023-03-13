import java.time.LocalTime;

public abstract class Grupo {
    protected int numPersonas;// protected: permite que lo vean las clases hijo
    protected int numRaciones;
    protected int numBebidas;
    protected static final double precioRacion = 15;// static final: valor para todas las clases por igual
    protected static final double precioBebida = 2;
    private int veces;
    private LocalTime hllegada;

    // Los metodos staticos son metodos que solo se usan en la misma clase que se
    // crean por eso si se necesita usar fuera de esta se escribe clase.metodo()
    public Grupo(int numPersonas) {
        this.numPersonas = numPersonas;
        hllegada = LocalTime.now();
    }

    public int getNumpersonas() {
        return numPersonas;
    }

    public int servicio(int raciones, int bebidas) {
        int nserv = 0;
        numRaciones = raciones + numRaciones;
        numBebidas = bebidas + numBebidas;
        return nserv;
    }

    public abstract double pagar();// Poli Morfismo : permite coger el metodo de las clases hijo, el metodo que se
                                   // quiere usar se tiene declara en el padre como abstracto, a su vez el padre
                                   // tiene que pasar a aser una clase abstracta
}
