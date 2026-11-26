import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int[][] matriz = new int[4][4];
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int numero;
        do {
            System.out.println("""
                    Escoge qué hacer:\s
                    1. Rellenar toda la matriz de numeros
                    2. Suma de una fila
                    3. Suma de una columna
                    4. Sumar la diagonal principal
                    5. Sumar la diagonal inversa
                    6. La media de todos los valores de la matriz.
                    7. Salir""");
            System.out.println("Qué quieres hacer?");
            numero = sc.nextInt();

            switch (numero) { //ifelse para validar que se haya rellenado
                case 1 -> rellenarMatriz();
                case 2 -> sumarFila();
                case 3 -> sumarColumna();
                case 4 -> sumaDiagonal();
                case 5 -> sumaDiagonalInversa();
                case 6 -> mediaValores();
                case 7 -> System.out.println("Finalizando el programa...");
                default -> System.out.println("No has escogido un número válido");
            }

        } while (numero != 7);
    }

    public static void rellenarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Añade el número de la fila " + i + " y de la columna " + j);
                matriz[i][j] = sc.nextInt();
            }
        }
    }
    public static void sumarFila(){
        System.out.println("Qué fila quieres sumar?");
        int fila = sc.nextInt();
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[fila][i];
        }
        System.out.println(suma);
    }

    public static void sumarColumna(){
        System.out.println("Qué columna quieres sumar?");
        int columna = sc.nextInt();
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][columna];
        }
        System.out.println(suma);
    }

    public static void sumaDiagonal(){
        System.out.println("Suma de la diagonal");
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        System.out.println(suma);
    }

    public static void sumaDiagonalInversa(){
        System.out.println("Suma de la diagonal inversa");
        int suma = 0;
        for (int i = 0, j = 3; j >= 0; i++, j--) {
                suma = suma + matriz[i][j];
        }
        System.out.println(suma);
    }

    public static void mediaValores(){
        double suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma = suma + matriz[i][j];
            }
        }
        double media = suma / (matriz.length*matriz.length);
        System.out.println(media);
    }
}