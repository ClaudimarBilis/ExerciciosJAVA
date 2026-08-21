//Crie um programa que tenha um número secreto definido no código.

//Por exemplo:
//Número secreto = 42

//O programa deve:
//Pedir um número ao usuário.
//Verificar se ele acertou.

//Se o número for menor que o secreto, informar:
//O número secreto é maior!

//Se for maior, informar:
//O número secreto é menor!
//Continuar pedindo números até o usuário acertar.

//Quando acertar:
//Parabéns! Você acertou!


package Fundamentos.Lacos;

import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[]args){
        int numeroSecreto = 49;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número para tentar acertar o numero secreto, conforme você chuta, vou te dando dicas!");

        int tentativa = teclado.nextInt();

        while(tentativa != numeroSecreto){
            if (tentativa > numeroSecreto){
                System.out.println("O número secreto é menor, tente novamente!");
            } else {
                System.out.println("O número secreto é maior, tente novamente!");
            }

            tentativa = teclado.nextInt();

        }

        System.out.println("Parabéns! Você acertou!");
    }
}
