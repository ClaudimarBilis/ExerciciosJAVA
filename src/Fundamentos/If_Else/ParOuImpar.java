//Peça um número inteiro.
//Informe se ele é par ou ímpar.

package Fundamentos.If_Else;
import java.util.Scanner;

public class ParOuImpar {
    public static void main (String[]args){

        Scanner teclado = new Scanner (System.in);

        System.out.println("Digite um número para saber se ele é par ou ímpar: ");

        int numero = teclado.nextInt();
        int resto = numero % 2;

        if (resto == 0){
            System.out.println("O número: " + numero + " é par!");
        } else {
            System.out.println("O número: " + numero + " é ímpar!");
        }

    }
}
