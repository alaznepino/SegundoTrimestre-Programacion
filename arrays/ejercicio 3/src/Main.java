//Crea un array de caracteres que contenga las letras de
// la ’A’ a la ’Z’
//(mayusculas). Después, ve pidiendo posiciones del array por teclado ´
//y si la posicion es correcta, se a ´ nadir ˜ a el car ´ acter a una cadena que se ´
//mostrara al final, se dejar ´ a de insertar cuando se introduzca un -1. ´
//        Por ejemplo, si escribo los siguientes numeros ´
//        0 //Anadira la ’A’ ˜
//        5 //Anadira la ’F’ ˜
//        25 //Anadira la ’Z’ ˜
//        50 //Error, inserte otro numero ´
//        -1 //fin
//Cadena resultante: AFZ

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] abecedario ={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        StringBuilder cadena = new StringBuilder();

        System.out.println("Dime una posición");
        int posicion = sc.nextInt();

        while(posicion != -1){
            if(posicion > abecedario.length || posicion < 0){ // arrayindexoutofbounds
                System.out.println("Error, inserte otro número");
            } else{
                cadena.append(abecedario[posicion]);
            }
            System.out.println("Dime otra posición, si quieres terminar pon -1");
            posicion = sc.nextInt();
        }
        System.out.println("Cadena resultante: " + cadena);
    }
}