//Peça um número de 1 a 7 e mostre o dia correspondente.
//teste
package simpleExercises.Switch;
import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 7 que corresponderá a um dia da semana: ");

        int dia = teclado.nextInt();

        String nomeDia = switch (dia){
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sábado";
            default -> "Dia inválido!";
        };

        System.out.println(nomeDia);
    }
}
