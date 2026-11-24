//Crea un array para almacenar numeros enteros generados aleatoria- ´
//mente. El número de números a generar, lo solicitaremos como dato ´
//de entrada. Muestra por pantalla el valor de cada posicion y la suma ´
//de todos los valores.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int suma = 0;
        Scanner sc = new Scanner(System.in);
        int cantidadNum = sc.nextInt();
        int[] listaNumeros = new int[cantidadNum];


        for (int x = 0; x < listaNumeros.length; x++) {
            System.out.println("Introduce el número " + x);
            listaNumeros[x] = (int) Math.random();
            System.out.println(listaNumeros[x]);
            suma = suma + listaNumeros[x];
        }

        System.out.println("La suma es: " + suma);
    }
}