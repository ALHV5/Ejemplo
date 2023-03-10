import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Representacion teatro[] = new Representacion[10];
        int nR = 0;
        int opc = 0;
        int dia = 0, mes = 0;
        int entV = 0, entN = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Elige la mopcion: ");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    if (nR == teatro.length)
                        System.out.println("No se pueden hacer más representaciones");
                    else {
                        System.out.println("Escriba titulo");
                        String titulo = sc.nextLine();
                        do {
                            System.out.println("Escriba dia: ");
                            dia = sc.nextInt();
                            System.out.println("Escriba el mes: ");
                            mes = sc.nextInt();
                        } while (validarFecha(dia, mes) == false);

                        if (repetido(teatro, nR, dia, mes) == true)
                            System.out.println("No se puede dar de alta, fecha ocupada");
                        else
                            teatro[nR] = new Representacion(titulo, dia, mes);
                        nR++;
                    }
                    break;
                case 2:
                    burbuja(teatro, mes);
                    break;
                case 3:
                    for (int i = 0; i < teatro.length; i++) {
                        if (teatro[i].hayEntradas() == true)
                            System.out.println(teatro[i].toString());
                    }
                    break;
                case 4:
                    System.out.println("Anota codigo: ");
                    String codigo = sc.nextLine();
                    int pos = buscar(teatro, nR, codigo);
                    if (pos == -1)
                        System.out.println("Codigo no existe");
                    else {
                        Random r = new Random();
                        do {
                            entV = r.nextInt(3) + 1;
                            entN = r.nextInt(3) + 1;
                        } while ((entV + entN) > 5);
                        double importe = teatro[pos].comprar(entV, entN);
                        if (importe == 0)
                            System.out.println("No hay suficientes entradas");
                        else {
                            System.out.println("Elimporte a pagar es: " + importe);
                            System.out.println("Selecciona tus entradas");
                        }
                    }
                    sc.nextLine();// limpiar buffer
                    break;
                case 5:
                    System.out.println("Anota codigo: ");
                    codigo = sc.nextLine();
                    pos = buscar(teatro, nR, codigo);
                    if (pos == -1)
                        System.out.println("Codigo no existe");
                    else {
                    }

                    break;
                case 6:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }

        } while (opc != 6);
    }

    static boolean validarFecha(int dia, int mes) {
        int meses[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (mes < 1 || mes > 12) {
            return false;
        }
        if (dia < 1 || dia > meses[mes - 1]) {
            return false;
        }
        return true;
    }

    static boolean repetido(Representacion teatro[], int nR, int dia, int mes) {
        for (int i = 0; i < nR; i++) {
            if (teatro[i].getDia() == dia && teatro[i].getMes() == mes) {
                return true;
            }
        }
        return false;
    }

    public static void burbuja(Representacion v[], int TAM) {
        int i, j;
        Representacion aux;
        for (i = 0; i < v.length - 1; i++) {
            for (j = 0; j < v.length - i - 1; j++) {
                if (v[j].getMes() > v[j + 1].getMes()) {
                    if (v[j].getDia() > v[j + 1].getDia()) {
                        aux = v[j + 1];
                        v[j + 1] = v[j];
                        v[j] = aux;
                    }
                }
            }
        }
    }

    static int buscar(Representacion t[], int nR, String c) {
        for (int i = 0; i < nR; i++) {
            if (t[i].getCodigo().equalsIgnoreCase(c))
                return i;
        }
        return -1;
    }
}