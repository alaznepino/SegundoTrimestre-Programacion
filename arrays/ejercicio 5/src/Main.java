import java.util.Scanner;

//Realiza un programa que cuente el número de veces que aparece cada
//una de las letras de un texto introducido por el teclado y a continuación
//visualice el resultado
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder resultado = new StringBuilder();
        char[] abecedario = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        // int[] contador = new int[];
        System.out.println("Proporciona un texto");
        String texto = sc.nextLine().toLowerCase();

        for (int i = 0; i < abecedario.length; i++) {
            int contador = 0;
            for (int j = 0; j < texto.length(); j++) {
                if (abecedario[i] == texto.charAt(j)) {
                    contador = contador + 1; //guardar los datos en otro array
                }
            }
            if (contador != 0) {
                resultado.append("Letra ").append(abecedario[i]).append(" aparece ").append(contador).append(" veces.\n");

            }
        }
        System.out.println(resultado);
    }
}