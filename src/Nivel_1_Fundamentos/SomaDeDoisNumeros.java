//Peça dois números inteiros.
//Mostre a soma deles.

package Nivel_1_Fundamentos;
import java.util.Scanner;

public class SomaDeDoisNumeros {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite dois números, inteiros, para serem somados: ");
        int primeiroNumero = teclado.nextInt();
        int segundoNumero = teclado.nextInt();

        System.out.println("Primeiro você digitou o número: " + primeiroNumero);
        System.out.println("Depois você digitou o número: " + segundoNumero);
        System.out.println("A soma dos dois números é: " + (primeiroNumero + segundoNumero));
    }
}
