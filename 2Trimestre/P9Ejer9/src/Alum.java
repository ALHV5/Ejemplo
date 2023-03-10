package P9Ejer9.src;

import java.util.Arrays;

public class Alum {

    private String nombre, apellido, telef, dni;
    private double notas[];
    private double media;
    private static final String asignaturas[] = { "program", "bbdd", "mar", "sist", "ent", "fol" };

    public Alum(String nombre, String apellido, String telef, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telef = telef;
        this.dni = dni;
        this.notas = new double[6];
        Arrays.fill(this.notas, -1);
    }

    public void setNota(int pos, double nota) {
        notas[pos] = nota;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public double calcMedia() {
        media = 0;
        int nnotas = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] != -1)
                media = media + notas[i];
            nnotas++;
        }
        media = media / nnotas;
        return media;
    }

    @Override
    public String toString() {
        return "ALumno [nombre=" + nombre + ",apellido " + apellido + ", telf " + telef + ", Dni" + dni
                + ", notas" + notas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public void mostrarNotas() {
        System.out.println("Notas del alumno");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(asignaturas[i] + ":");
            if (notas[i] != -1)
                System.out.println(notas[i]);
            else
                System.out.println("Sin calificar");
        }
    }
}
