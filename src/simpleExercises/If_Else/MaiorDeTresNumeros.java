//Peça três números ao usuário.
//Descubra qual é o maior.
//Mostre o maior número.

package simpleExercises.If_Else;
import java.util.Scanner;

public class MaiorDeTresNumeros {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite três números: ");

        double primeiroNumero = teclado.nextDouble();
        double segundoNumero = teclado.nextDouble();
        double terceiroNumero = teclado.nextDouble();

        if (primeiroNumero >= segundoNumero && primeiroNumero >= terceiroNumero){
            System.out.println("O maior número é: "+ primeiroNumero);
        } else if (segundoNumero >= primeiroNumero && segundoNumero >= terceiroNumero){
            System.out.println("O maior número é: "+ segundoNumero);
        }else{
            System.out.println("O maior número é: "+ terceiroNumero);
        }
    }
}
