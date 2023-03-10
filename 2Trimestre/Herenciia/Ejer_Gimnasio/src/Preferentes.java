package Herenciia.Ejer_Gimnasio.src;

public class Preferentes extends Socios {

    static int cantivip;

    public Preferentes(String tipo, String nombre, String apellido, String telef) {
        super(tipo, nombre, apellido, telef);
        cantivip++;
    }

    public static int getCantivip() {
        return cantivip;
    }
}
