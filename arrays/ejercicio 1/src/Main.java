// Crear un array de 10 elementos para guardar en el valores de tipo real
//(float o double) que iremos introduciendo por teclado. Posteriormente
//visualizar el valor maximo y el mínimo.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] listaNumeros = new double[10];

        double numMayor = listaNumeros[0];
        double numMenor = listaNumeros[0];

        for (int x = 0; x < listaNumeros.length; x++) {
            System.out.println("Introduce el número " + x);
            listaNumeros[x] = sc.nextInt();
        }

        for (double listaNumero : listaNumeros) {
            if (listaNumero > numMayor) {
                numMayor = listaNumero;
            } else {
                numMenor = listaNumero;
            }
        }
        System.out.println("El numero mayor es: " + numMayor);
        System.out.println("El numero menor es: " + numMenor);
    }
}