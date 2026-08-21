//Faça um programa que:

//Peça um número ao usuário.
//Pergunte se deseja continuar (s/n).
//Enquanto responder s, peça outro número.
//Ao responder n, mostre:
//o maior número digitado;
//o menor número digitado.

package Fundamentos.Lacos;
import java.util.Scanner;

public class MaiorEMenorNumero {
    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;
        int quantidade = 0;
        double maior = 0;
        double menor = 0;

        while(continuar){
            System.out.println("Digite um número: ");
            double numero = teclado.nextDouble();

            if(quantidade == 0){
                maior = numero;
                menor = numero;
            }if (numero >= maior){
                maior = numero;
            }if(numero <= menor) {
                menor = numero;
            }

            quantidade++;

            System.out.println("Deseja continuar? (s/n)");
            char resposta = teclado.next().charAt(0);

            if(resposta == 'n'){
                continuar = false;
            }
        }
        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("O menor número digitado foi: " + menor);
    }
}
