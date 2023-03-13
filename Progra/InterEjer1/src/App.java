import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Pila mipila = new Pila();
        Cola micola = new Cola();
        int opc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Anota operacion: 1Insertar\n2Sacar\n3ostrar");
        opc = sc.nextInt();
        sc.nextLine();
        switch (opc) {
            case 1:
                System.out.println("Anota cadena:");
                String cad = sc.nextLine();
        }
        mipila.aniadir("Estoy");
        mipila.aniadir("probando");
        mipila.aniadir("mi pila");
        System.out.println(mipila.toString());
        micola.aniadir("Estoy");
        micola.aniadir("probando");
        micola.aniadir("la cola");
        System.out.println(micola.toString());

    }
}
