package Herenciia.P10E4.P10E3.src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Cuentas cuenta[] = new Cuentas[10];
        Cuentas nifextr[] = new Cuentas[2];
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("1) Dar de alta cuenta");
            System.out.println("2) Dar de baja");
            System.out.println("3)");
            System.out.println("4) Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Escribe NIF del propietario: ");
                    String nif = sc.next();
                    System.out.println("Escribe el tipo de cuenta");
                    String tipo = sc.next();

                    break;
            }
        } while (opc != 4);
    }
}
