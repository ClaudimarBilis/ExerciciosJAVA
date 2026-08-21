//Faça um programa que:

//Peça números ao usuário.
//Pergunte se deseja continuar (s/n).
//Enquanto responder s, continue recebendo números.
//Ao responder n, mostre:
//quantos números pares foram digitados;
//quantos números ímpares foram digitados.

package Fundamentos.Lacos;
import java.util.Scanner;

public class ContagemDeParesEImpares {
    public static void main (String[]args){

        Scanner teclado = new Scanner (System.in);

        boolean continuar = true;

        int pares = 0;
        int impares = 0;


        while(continuar){

            System.out.println("Digite um número: ");
            int numero = teclado.nextInt();

            if(numero % 2 == 0){
                pares++;
            }else{
                impares++;
            }

            System.out.println("Deseja continuar? (s/n)");
            char resposta = teclado.next().charAt(0);

            if(resposta == 'n'){
                continuar = false;
            }
        }

        System.out.println("A quantidade de números pares digitados foi: " + pares);
        System.out.println("A quantidade de números ímpares digitados foi: " + impares);
    }
}
