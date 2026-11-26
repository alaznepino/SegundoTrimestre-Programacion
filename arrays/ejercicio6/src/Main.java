import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] codigo = {10, 23, 30, 47, 55, 65, 135, 256, 526, 663};
        int[] unidades = new int[10];
        int producto = 0;


        do {
            System.out.println("Dime el código del producto (0 para terminar)");
            producto = sc.nextInt();
            boolean encontrado = false;
            for (int i = 0; i < codigo.length; i++) {
                if (producto != 0) {
                    if (codigo[i] == producto) {
                        System.out.println("Cuantas unidades se han vendido?");
                        int cantUnidades = sc.nextInt();
                        unidades[i] += cantUnidades;
                        encontrado = true;
                    }
                }
            }
            if (!encontrado && producto != 0) {
                System.out.println("No existe ese codigo");
            }
        } while (producto != 0);

        int aux;
        int aux2;
        for (int i = 0; i < unidades.length - 1; i++) {
            for (int j = i + 1; j < unidades.length; j++) {
                if (unidades[i] > unidades[j]) {
                    aux2 = codigo[j];
                    codigo[j] = codigo[i];
                    codigo[i] = aux2;

                    aux = unidades[j];
                    unidades[j] = unidades[i];
                    unidades[i] = aux;
                }
            }
        }

        for (int i = 0; i < codigo.length; i++) {
            System.out.println("Del código " + codigo[i] + " se han vendido: " + unidades[i]);
        }
    }
}