import java.util.Vector;

public class App {
    public static void main(String[] args) throws Exception {
        Vector<String> cadenas = new Vector<String>();
        int tam = cadenas.size();
        System.out.println("Actualmente hay : " + tam + " elementos");
        cadenas.add("Hola");
        cadenas.add("Otra más");
        System.out.println(cadenas);
        System.out.println("Actualmente hay : " + cadenas.size() + " elementos");
    }
}
