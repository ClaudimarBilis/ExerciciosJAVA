
//Peça o nome do usuário.
//Exiba uma mensagem de boas-vindas contendo o nome.

package Nivel_1_Fundamentos;
import java.util.Scanner;

public class OlaUsuario {
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
            System.out.println("Digite seu nome: ");

            String nome = teclado.nextLine();

            System.out.println("Olá! " + nome + " muito bem vindo(a)!");
    }
}
