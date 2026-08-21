//Peça dois números.
//Informe qual deles é maior.
//Caso sejam iguais, informe isso.

package Fundamentos.If_Else;
import java.util.Scanner;

public class MaiorNumero {
    public static void main (String[]args){

        Scanner teclado = new Scanner (System.in);

        System.out.println("Digite dois números para comparação: ");

        double primeiroNumero = teclado.nextDouble();
        double segundoNumero = teclado.nextDouble();

        if (primeiroNumero > segundoNumero){
            System.out.println("O número " + primeiroNumero + " é maior que o número " + segundoNumero);
        } else if (segundoNumero > primeiroNumero){
            System.out.println("O número " + segundoNumero + " é maior que o número " + primeiroNumero);
        } else {
            System.out.println("Os números são iguais!");
        }
    }
}
