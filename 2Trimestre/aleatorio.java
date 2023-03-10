import java.util.Random;
import java.util.Scanner;

public class aleatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int t;
        int tabla[][];
        System.out.println("Introduce tamaño de la matriz");
        t = sc.nextInt();
        tabla = new int[t][t];

        for (int x = 0; x < t; x++) {
            for (int y = 0; y < t; y++) {
                tabla[x][y] = r.nextInt(10);
            }
        }

        for (int x = 0; x < t; x++) {
            for (int y = 0; y < t; y++) {
                System.out.print("\t" + tabla[x][y]);
            }
            System.out.println();
        }
    }
}
