import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//Desarrolla un programa que solicite al usuario un mes en letra y
// que compruebe que es correcto.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] meses ={"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        System.out.println("Dime un mes");
        String tecleaMes = sc.nextLine().toLowerCase(Locale.ROOT);

        boolean existeMes = Arrays.asList(meses).contains(tecleaMes);

        System.out.println(existeMes); //un if para escribir si es correcto o no
    }
}