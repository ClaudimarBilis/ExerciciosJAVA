//Crie um programa que tenha uma senha definida no código, por exemplo:

//1234

//O programa deve:

//Pedir a senha ao usuário.
//Verificar se está correta.
//Enquanto estiver errada, pedir novamente.
//Quando acertar, mostrar:
//Senha correta!
//Acesso permitido.
//Regras

//Use:

//Scanner
//while
//if/else

//Não use for.

package simpleExercises.Lacos;

import java.util.Scanner;

public class Senha {
    public static void main(String[]args){

            int senha = 1234;

            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite sua senha: ");

            int senhaDigitada = teclado.nextInt();

        while(true){

            if(senhaDigitada == senha){
                System.out.println("Senha correta! Acesso permitido!");
                break;
            } else {
                System.out.println("Senha incorreta! Digite novamente sua senha: ");

                senhaDigitada = teclado.nextInt();
            }
        }
    }
}
