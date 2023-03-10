package ExpRegulares.src;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        // Creamos el patrón y especificamos que no distinguimos entre
        // mayúsculas y minúsculas.
        Pattern pattern = Pattern.compile("ejemplo", Pattern.CASE_INSENSITIVE);
        // Buscamos el patrón en la cadena, devuelve un objeto Matcher,
        // con información sobre la búsqueda.
        Matcher matcher = pattern.matcher("Este es un ejemplo");
        // find me indica si se ha encontrado el patrón en el String.
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Encontrado");
        } else {
            System.out.println("No encontrado");
        }
    }
}