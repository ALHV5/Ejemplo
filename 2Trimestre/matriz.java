import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        int tabla[][] = new int[4][3];
        int max, min;
        Scanner sc = new Scanner(System.in);

        for (int f = 0; f < 4; f++) {
            System.out.println("Fila " + f);
            for (int c = 0; c < 3; c++) {
                System.out.println("Anota elemento de la columna" + c + " :");
                tabla[f][c] = sc.nextInt();
            }
        }
        min = max = tabla[0][0];
        System.out.println("la tabla resultante es .........");

        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("\t" + tabla[f][c]);

                if (tabla[f][c] > max)
                    max = tabla[f][c];
                if (tabla[f][c] < min)
                    min = tabla[f][c];
            }
            System.out.println();
        }
        System.out.println("Valor más alto :" + max);
        System.out.println("Valor más bajo :" + min);
    }
}
