package Herenciia.Ejer_Gimnasio.src;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        int opc = 0;
        String nombre, apellido, telef, tipo, cod;
        Socios soci[] = new Socios[20];
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1)Dar de alta a socios");
            System.out.println("5)Salir...............");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Indique cuantos quiere dar de alta maximo 10");
                    opc = sc.nextInt();
                    if (opc < 10)
                        for (; opc != 0; opc--) {
                            System.out.println("Escribe el nombre: ");
                            nombre = sc.next();
                            System.out.println("Ahora el apellido");
                            apellido = sc.next();
                            System.out.println("El telefono");
                            telef = sc.next();
                            System.out.println("Tipo 'Preferente/Normal'");
                            tipo = sc.next();
                            if (tipo == "Normal") {
                                if (Socios.getCantisoci() < 10) {
                                    soci[opc] = new Socios(null, null, null, null);
                                } else {
                                    System.out.println("NO HAY ESPACIO");
                                }
                            } else {
                                if (Preferentes.getCantivip() < 10) {
                                    soci[opc] = new Preferentes(tipo, nombre, apellido, telef);
                                }
                            }

                        }
                    else
                        System.out.println("Error");
                    break;
                case 2:
                    System.out.println("Seleccione un socio");
                    opc = sc.nextInt();
                    soci[opc].entrarGimnasio();
                    if (soci[opc].entrarGimnasio() == true) {
                        System.out.println("EL USUARIO A ENTRADO EN EL GIMNASIO");
                    } else {
                        System.out.println("EL USUARIO NO SE ENCUENTRA EN EL GIMNASIO");
                    }
                    break;
                case 3:
                    System.out.println("ESCRIBA CODIGO DE USUARIO: ");
                    cod = sc.nextLine();
                    for (int i = 0; i < 20; i++) {
                        if (soci[i].getCodigo().equalsIgnoreCase(cod))
                            ;
                    }
                    break;

                case 5:
                    System.out.println("DESCONECTANDO");
                    break;
            }
        } while (opc != 5);
    }

    public static void Patron() {
        Pattern pattern = Pattern.compile("^[NP]|-|([1-9]|10)+$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("N-1");
    }
}
