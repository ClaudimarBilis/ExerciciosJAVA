//Peça três notas.
//Calcule e mostre a média.

package Nivel_1_Fundamentos;
import java.util.Scanner;

public class Media {
    public static void main (String[]args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua 1ª, 2ª e 3ª nota da disciplina: ");

        double primeiraNota = teclado.nextDouble();
        double segundaNota = teclado.nextDouble();
        double terceiraNota = teclado.nextDouble();

        double media = (primeiraNota + segundaNota + terceiraNota) / 3;

        System.out.println("A média das suas notas é: " + media);
    }
}
