//Faça um programa que:

//Peça um número ao usuário.
//Mostre a tabuada desse número de 1 até 10.
//Por exemplo, se o usuário digitar:

//5

//o programa deverá produzir:

//5 x 1 = 5
//5 x 2 = 10
//5 x 3 = 15
//...
//5 x 10 = 50

package simpleExercises.Lacos;
import java.util.Scanner;

public class Tabuada {
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int numeroEscolhido = teclado.nextInt();

        for(int i = 1; i<=10; i++){
            int tabuada = numeroEscolhido * i;

            System.out.println( numeroEscolhido + " x " + i + " = " + tabuada);
        }
    }
}
