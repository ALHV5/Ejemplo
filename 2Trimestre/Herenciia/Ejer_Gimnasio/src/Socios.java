package Herenciia.Ejer_Gimnasio.src;

public class Socios {
    protected int cuota;
    static int cantisoci;
    protected String codigo, tipo, nombre, apellido, telef;
    public boolean enter;

    public Socios(String tipo, String nombre, String apellido, String telef) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telef = telef;
        this.enter = false;
        cantisoci++;

    }

    public boolean entrarGimnasio() {
        if (enter = false)
            enter = true;
        return enter;
    }

    public static int getCantisoci() {
        return cantisoci;
    }

    public String getCodigo() {
        return codigo;
    }

}
