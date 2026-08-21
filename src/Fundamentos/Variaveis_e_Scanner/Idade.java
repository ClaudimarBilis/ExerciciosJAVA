//Peça o ano de nascimento.
//Calcule aproximadamente a idade da pessoa.

package Fundamentos.Variaveis_e_Scanner;
import java.util.Scanner;

public class Idade {
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Primeiro digite o ano atual, depois seu ano de nascimento: ");

        int anoAtual = teclado.nextInt();
        int anoDeNascimento = teclado.nextInt();

        int idade =  anoAtual - anoDeNascimento;

        System.out.println("Seu ano de nascimento é: " + anoDeNascimento + " e a sua idade aproximada é: " + idade + " anos.");
    }
}
