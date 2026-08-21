//Peça dois números.
//Mostre:
//soma
//subtração
//multiplicação
//divisão

package Fundamentos.Variaveis_e_Scanner;
import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[]args){

        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite dois números: ");

        double primeiroNumero = teclado.nextDouble();
        double segundoNumero = teclado.nextDouble();

        double soma = primeiroNumero + segundoNumero;
        double subtracao = primeiroNumero - segundoNumero;
        double multiplicacao = primeiroNumero * segundoNumero;
        double divisao = primeiroNumero / segundoNumero;

        System.out.println("Você digitou primeiro: " + primeiroNumero + " depois " + segundoNumero);
        System.out.println("A soma dos dois números é: " + soma);
        System.out.println("A subtração dos dois números é: " + subtracao);
        System.out.println("A multiplicação dos dois números é: " + multiplicacao);
        System.out.println("A divisão dos dois números é: " + divisao);
    }
}
