import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

import javax.tools.Diagnostic;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Grupo mesas[] = new Grupo[4];
        int opc, raciones, bebidas, tipo = 0, pos = 0, mesa = 0, mesasOcupadas;
        String tipos[] = { "normal", "gourmet", "tenedor" };
        double impote;

        LinkedList<Grupo> cola = new LinkedList<Grupo>();
        do {
            System.out.println("Anota opcion:");
            System.out.println("1.Llegar/2.Servir/3.Pagar/4.Juntar/5");
            opc = leerInt();
            switch (opc) {
                case 1:
                    Grupo g;
                    int numPersonas = (int) (Math.random() * 5) + 1;
                    do {
                        System.out.println("Anota tipo: 1.Normal/2.Gourmet/3.Tenedor");
                        tipo = leerInt();
                    } while (tipo < 1 || tipo > 3);
                    if (tipo == 1)
                        g = new Normal(numPersonas);
                    if (tipo == 2) {
                        String codigo;
                        do {
                            System.out.println("Anota codigo");
                            codigo = sc.nextLine();
                        } while (validarCodigo(codigo) == false);
                        g = new Tenedor(numPersonas, codigo);
                    }
                    if (tipo == 3)
                        g = new Gourmet(numPersonas);
                    if (mesasOcupadas == mesas.length)
                        cola.add(g);
                    else {
                        pos = buscarHueco == mesas.length;
                        if (pos == 1)
                            System.out.println("Avise a Sistemas");
                        mesas[pos] = g;
                        mesasOcupadas++;
                    }

                    break;
                case 2:
                    do {
                        System.out.println("Anota mesa:");
                        mesa = leerInt();
                    } while (mesa < 0 || mesa > mesas.length);
                    if (mesas[mesa] == null) {
                        System.out.println("Esa mesa está vacia");
                    } else {
                        do {
                            System.out.println("Anota numero raciones");
                            raciones = leerInt();
                        } while (raciones <= 0 || raciones > mesas[mesa].getNumpersonas());
                        do {
                            System.out.println("Anota numero bebidas");
                            bebidas = leerInt();
                        } while (bebidas <= 0 || bebidas > mesas[mesa].getNumpersonas());
                        mesas[mesa].servicio(raciones, bebidas);
                    }
                    break;
                case 3:
                    do {
                        System.out.println("Anota mesa: ");
                        mesa = leerInt();
                    } while (mesa < 0 || mesa > mesas.length);
                    if (mesas[mesa] == null)
                        System.out.println("Esa mesa esta vacia");
                    else {
                        double importe = mesas[mesa].pagar();
                        int ind = buscarIndice(mesas[mesa], tipos);
                        Importes[ind][mesa] += importe;
                        if (cola.impEmpty()) {
                            mesas[mesa] = null;
                            mesasOcupadas++;
                        } else {
                            mesas[mesa] = cola.remove(0);
                        }
                    }
                    break;
                case 5:
                    System.out.println("El número total de clientes gourmet es:" + Gourmet.getTotalGourmet());
                    break;
                case 6:
                    System.out.println("Fin");
                    break;
                default:
                    System.out.println("ERROR");
            }
        } while (opc != 6);
    }

    public static int leerInt() {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        try {
            num = sc.nextInt();
        } catch (InputMismatchException e) {
            sc.nextLine();
        }
        return num;
    }

    public static boolean validarCodigo(String codigo) {
        return false;
    }

    public static int buscarHueco(Grupo mesas[]) {
        for (int i = 0; i < mesas.length; i++)
            if (mesas[i] == null)
                return i;
        return 0;
    }

    public static int buscarIndice(Grupo g, String tipos[]) {

    }

}
