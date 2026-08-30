//Peça a nota de um aluno.
//Se a nota for maior ou igual a 7, informe que foi aprovado.
//Caso contrário, reprovado.

package Nivel_2_Condicionais;
import java.util.Scanner;

public class AprovadoOuReprovado {
    public static void main (String[]args){
        Scanner teclado = new Scanner (System.in);

        System.out.println("Digite sua nota de 0.0 a 10.0: ");

        double nota = teclado.nextDouble();

        if (nota >= 7.0){
            System.out.println("Parabéns! Você foi aprovado!");
        } else {
            System.out.println("Que pena! Você foi reprovado!");
        }
    }
}
