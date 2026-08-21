//Faça um programa que:

//Peça um número N.
//Some todos os números de 1 até N.
//Mostre o resultado.

package simpleExercises.Lacos;

import java.util.Scanner;

public class SomaDeUmAteN {
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int numero = teclado.nextInt();
        int soma = 0;

        for(int i=1;i<=numero;i++) {
            soma += i;
        }

        System.out.println("Total: " + soma);
    }
}
