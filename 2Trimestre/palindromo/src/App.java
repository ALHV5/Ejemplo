import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String frase;
        char mod[];
        char car;
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la frase");
        frase = sc.nextLine();
        mod = new char[frase.length()];
        for (i = 0, j = 0; i < frase.length(); i++) {
            car = frase.charAt(i);
            if (car != ' ' && car != ',' && car != ';') {
                mod[j] = Character.toLowerCase(car);
                j++;
            }
        }

        boolean palindromo = true;

        for (int k = 0, l = j - 1; k <= l; k++, l--) {
            if (mod[k] != mod[l]) {
                palindromo = false;
                break;
            }
        }

        if (palindromo == true) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }

        System.out.println("La cadena modificada es " + Arrays.toString(mod));
    }
}
