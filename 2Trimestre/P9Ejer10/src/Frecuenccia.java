import java.util.Scanner;

public class Frecuenccia {
    public static void main(String[] args) throws Exception {
        int numm[] = new int[10];
        int num = 10;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Escriba un numero del 0 al 9, ponga numreo negativo para terminar.");
            num = sc.nextInt();
            if (num < 10 && num > -1) {
                numm[num] = numm[num] + 1;
            }
        } while (num < 0);
        for (int i = 0; i < num; i++) {
            System.out.println("El numero" + i + "aparece" + numm[i]);
        }
    }
}
