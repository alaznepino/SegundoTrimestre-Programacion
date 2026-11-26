//Escribe un programa en Java que gestione las notas de una clase. El programa debe pedir al usuario el
// numero de alumnos y el número de asignaturas. Posteriormente solicitara la nota de cada alumno en cada
// asignatura. El programa debe calcular la media de cada alumno, de cada asignatura y la nota mas alta
// y la nota más baja de todas.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static StringBuilder boletin = new StringBuilder();
    public static boolean error;
    static void main(String[] args) {
        try {
            pedirDatos();
            System.out.println(boletin);
        }catch (Exception e){
            System.out.println("Ha ocurrido un error");
        }
    }

    public static int nAlumnos(){
        int numero = 0;
        do {
            error = true;
            try {
                System.out.println("Cuántos alumnos hay?");
                numero = sc.nextInt();
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("Error: no has metido un tipo de dato correcto");
                sc.nextLine();
            }
        } while(error);
        return numero;
    }

    public static int nAsignaturas(){
        int numero = 0;
        do {
            error = true;
            try {
                System.out.println("Cuántos asignaturas hay?");
                numero = sc.nextInt();
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("Error: no has metido un tipo de dato correcto");
                sc.nextLine();
            }
        } while(error);
        return numero;
    }

    public static void pedirDatos(){
        int numAlumnos = nAlumnos();
        int numAsignaturas = nAsignaturas();
        int[][] notas = new int[numAlumnos][numAsignaturas];

        System.out.println("Vamos a rellenar la taula.");

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Dime la nota del alumno " + i + " de la asignatura " + j);
                notas[i][j] = sc.nextInt();
            }
        }
        try {
            mediaNotas(notas);
            mediaAsignatura(notas);
            notaAltaBaja(notas);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error");
        }
    }

    public static void mediaNotas(int[][] notas){
        for (int i = 0; i < notas.length; i++) {
            double suma = 0;
            double media = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
                media = suma / notas[i].length;
            }
            boletin.append("La media del alumno ").append(i).append(" es ").append(media).append("\n");
        }
    }

    public static void mediaAsignatura(int[][] notas){
        for (int i = 0; i < notas[0].length; i++) {
            double sumaFila = 0;
            double media = 0;
            for (int j = 0; j < notas.length; j++) {
                sumaFila += notas[j][i];
                media = sumaFila / notas.length;
            }
            boletin.append("La media de la asignatura ").append(i).append(" es ").append(media).append("\n");
        }
    }

    public static void notaAltaBaja(int[][] notas){
        int notaMayor = 0;
        int notaMenor = 11;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] > notaMayor){
                    notaMayor = notas[i][j];
                }
                if (notas[i][j] < notaMenor) {
                    notaMenor = notas[i][j];
                }
            }
        }
        boletin.append("La nota mayor es ").append(notaMayor).append(" y la nota menor es ").append(notaMenor);
    }


}