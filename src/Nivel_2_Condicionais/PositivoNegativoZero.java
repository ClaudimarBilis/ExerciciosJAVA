//Peça um número ao usuário.
//Informe se ele é:
//positivo
//negativo
//zero

package Nivel_2_Condicionais;
import java.util.Scanner;

public class PositivoNegativoZero {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");

        double numero = teclado.nextDouble();

        if (numero == 0){
            System.out.println("O número é zero!");
        } else if (numero > 0){
            System.out.println("O número " + numero + " é positivo!");
        } else {
            System.out.println("O número " + numero + " é negativo!");
        }
    }
}
