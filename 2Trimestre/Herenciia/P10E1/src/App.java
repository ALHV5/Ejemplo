package Herenciia.P10E1.src;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Libro libros[] = new Libro[3];
        sc.useLocale(Locale.ENGLISH);
        System.out.println("Que desea hacer: ");
        System.out.println("+++++++++++++++++++++++++");
        System.out.println("1. Añadir libro");
        System.out.println("2. Ver libros añadidos");
        System.out.println("3. SALIR");
        System.out.println("+++++++++++++++++++++++++");
        int opc = sc.nextInt();
        switch (opc) {
            case 1:
                for (int i = 0; i < libros.length; i++) {
                    System.out.println("Anota titulo: ");
                    String titulo = sc.nextLine();
                    System.out.println("Anota autor: ");
                    String autor = sc.nextLine();
                    System.out.println("Anota editorial: ");
                    String editorial = sc.nextLine();
                    System.out.println("Anota precio: ");
                    double precio = sc.nextDouble();
                    System.out.println("Elige: 1.Normal, 2.Texto");
                    int opcion = sc.nextInt();
                    if (opcion == 1)
                        libros[i] = new Libro(titulo, autor, editorial, precio);
                    else {
                        System.out.println("Anota curso: ");
                        sc.nextLine();
                        String curso = sc.nextLine();
                        System.out.println("Anota descuento");
                        double descuento = sc.nextDouble();
                        libros[i] = new Texto(titulo, autor, editorial, precio, curso, descuento);
                    }
                }

                for (int i = 0; i < libros.length; i++)
                    System.out.println(libros[i].toString());
                return;
            case 2:
                System.out.println(libros);
                return;
            case 3:
                System.out.println("Adios");
                break;

            default:
                System.out.println("ERROR");
                break;
        }

    }
}
