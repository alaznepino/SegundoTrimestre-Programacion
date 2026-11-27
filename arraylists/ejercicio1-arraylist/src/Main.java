// 1. Crea un arraylist para guardar valores de tipo real (Float o Double)
//que iremos introduciendo por teclado hasta finalizar (mientras quiera continuar). Posteriormente muestra un menu para que el usuario ´
//pueda realizar las siguientes operaciones:
//a) Visualizar el valor maximo y el m ´ ´ınimo.
//b) Solicitar un numero y buscarlo. Muestra un mensaje indicando ´
//si lo has encontrado o no.
//c) Solicitar un numero, buscarlo y borrarlo. Sino se encuentra mues- ´
//tra un mensaje de error.
//d) Convertir el arrayList en un array.
//e) Si no esta vac´ıo, mostrar el numero de elementos que contiene. ´
//f) Insertar un nuevo elemento por el final.
//g) Insertar un nuevo elemento en la posicion que te indique el ´
//usuario.
//h) Borrar un elemento de una posicion concreta. ´
//i) Calcular la suma y la media aritmetica de los valores contenidos. ´
//j) Finalizar.

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            menu();
        } catch (Exception e) {
            System.out.println("Error: algo ha sucedido mal");
        }
    }

    public static void menu() {
        char letra = 0;
        do {
            try {
                System.out.println("a) Visualizar el valor maximo y el mínimo.\n" +
                        "b) Solicitar un numero y buscarlo. Muestra un mensaje indicando ´\n" +
                        "si lo has encontrado o no.\n" +
                        "c) Solicitar un numero, buscarlo y borrarlo. Sino se encuentra muestra un mensaje de error.\n" +
                        "d) Convertir el arrayList en un array.\n" +
                        "e) Si no esta vac´ıo, mostrar el numero de elementos que contiene. ´\n" +
                        "f) Insertar un nuevo elemento por el final.\n" +
                        "g) Insertar un nuevo elemento en la posición que te indique el usuario.\n" +
                        "h) Borrar un elemento de una posición concreta.\n" +
                        "i) Calcular la suma y la media aritmética de los valores contenidos.\n" +
                        "j) Finalizar. \n" +
                        "Escoge una letra: ");

                letra = sc.nextLine().charAt(0);

                switch (letra) {
                    case 'a' -> valorMaxMin();
                    case 'b' -> System.out.println("Dos");
                    case 'c' -> System.out.println("Tres");
                    case 'd' -> System.out.println("Cuatro");
                    case 'e' -> System.out.println("Cinco");
                    case 'f' -> System.out.println("Seis");
                    case 'g' -> System.out.println("Siete");
                    case 'h' -> System.out.println("Ocho");
                    case 'i' -> System.out.println("Nueve");
                    case 'j' -> System.out.println("Finalizando el proyecto...");
                }
            } catch (Exception e) {
                System.out.println("Ha sucedido un error");
            }
        } while (letra != 'j');
    }

    public static void valorMaxMin(){

    }
}
