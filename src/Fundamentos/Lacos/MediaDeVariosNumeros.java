//Faça um programa que:
//Peça um número ao usuário.
//Pergunte se ele deseja continuar.
//Enquanto responder s, peça outro número.
//Quando responder n, calcule a média.
//Mostre a média final.

//Exemplo:
//Digite um número:
//10

//Deseja continuar? (s/n)
//s

//Digite um número:
//20

//Deseja continuar? (s/n)
//s

//Digite um número:
//30

//Deseja continuar? (s/n)
//n

//Média: 20.0

package Fundamentos.Lacos;

import java.util.Scanner;

public class MediaDeVariosNumeros {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double soma = 0;
        int quantidade = 0;
        boolean continuar = true;

        while (continuar){

            System.out.println("Digite um número: ");
            double numero = teclado.nextDouble();

            soma += numero;
            quantidade++;

            System.out.println("Deseja continuar? (s/n)");
            char resposta = teclado.next().charAt(0);

            if (resposta == 's'){}
            else{
                continuar = false;
            }

        }
        System.out.println("A média dos números é: " + soma / quantidade);
    }
}
