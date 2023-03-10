import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int njuga;
        System.out.print("Escriba el numero de jugadores(max.10): ");
        njuga = sc.nextInt();
        if (njuga <= 10 && njuga > 0) {
            for (int a = 1; a != njuga + 1; a++) {
                System.out.println("-----------------------");
                System.out.println("Carton del jugador " + a);
                Craton.crearcarton(njuga);

            }
        } else {
            System.out.println("Error en la elección");
        }
    }
}
