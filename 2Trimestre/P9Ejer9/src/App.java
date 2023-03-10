package P9Ejer9.src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opc, nAl = 0, pos = 0;
        Alum alumnos[] = new Alum[25];
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Matrivular alumno");
            System.out.println("2. Poner notas de una asignatura");
            System.out.println("3.");
            System.out.println("4.");
            System.out.println("5.");
            System.out.println("6. Notas de un alumno dado su DNI");
            System.out.println("7. Salir");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    if (nAl == alumnos.length)
                        System.out.println("No hay espacio para mas alumnos");
                    else {
                        System.out.println("Anota nombre");
                        String nombre = sc.nextLine();
                        System.out.println("Anota apellido");
                        String apellido = sc.nextLine();
                        System.out.println("Telefono");
                        String telef = sc.nextLine();
                        System.out.println("Anota DNI");
                        String dni = sc.nextLine();
                        new Alum(nombre, apellido, telef, dni);
                        nAl++;
                    }

                    break;
                case 2:
                    System.out.println("Asignatura d elaque euieres");
                    System.out.println("1.Programación");
                    System.out.println("2.BBDD");
                    System.out.println("3.Marcas");
                    System.out.println("4.Sistemas");
                    System.out.println("5.Entornos");
                    System.out.println("6.FOL");
                    int nasig = sc.nextInt();
                    if (nasig < 1 || nasig > 6) {
                        System.out.println("no existe esas asignatura");
                    } else {
                        for (int i = 0; i < nAl; i++) {
                            System.out.println("Introduce nota del alumno" + alumnos[i].getNombreCompleto());
                            double nota = sc.nextDouble();
                            alumnos[i].setNota(nasig - 1, nota);
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < nAl; i++) {
                        System.out.println("Informacion alumnos......");
                        System.out.println(alumnos[i].toString());
                    }
                case 5:
                    System.out.println("Calculo medias");
                    for (int i = 0; i < nAl; i++)
                        alumnos[i].calcMedia();
                    break;
                case 6:
                    System.out.println("Anota DNI a buscar");
                    String dni = sc.nextLine();
                    buscar(alumnos, dni, nAl);
                    pos = buscar(alumnos, dni, nAl);
                    if (pos == -1)
                        System.out.println("No existe el dni indicado");
                    else {
                        alumnos[pos].mostrarNotas();
                    }
                    break;
                case 7:
                    System.out.println("Fin del programa");
                    dni = sc.nextLine();
                    pos = buscar(alumnos, dni, nAl);
                    if (pos == -1)
                        System.out.println("no existe ningún alumno");
                    else
                        for (int i = pos; i < nAl - 1; i++)
                            alumnos[i] = alumnos[i + 1];
                    nAl--;
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        } while (opc != 7);
    }

    public static void burbuja1(Alum v[], int TAM) {
        int i, j;
        Alum aux;
        for (i = 0; i < v.length - 1; i++) {
            for (j = 0; j < v.length - i - 1; j++) {
                if (v[j + 1] < v[j]) {
                    aux = v[j + 1];
                    v[j + 1] = v[j];
                    v[j] = aux;
                }
            }
        }
    }

    public static void burbuja2(Alum v[], int TAM) {
        int i, j;
        Alum aux;
        for (i = 0; i < v.length - 1; i++) {
            for (j = 0; j < v.length - i - 1; j++) {
                if (v[j + 1] < v[j]) {
                    aux = v[j + 1];
                    v[j + 1] = v[j];
                    v[j] = aux;
                }
            }
        }
    }

    public static int buscar(Alum alumnos[], String dni, int nal) {
        for (int i = 0; i < nal; i++)
            ;
        {
            if (alumnos[i].getDni().equalsIgnoreCase(dni)) {
                return i;
            }
        }
        return -1;
    }
}
