//Crie um programa que simule um caixa eletrônico simples.

//O sistema deve começar com um saldo, por exemplo:
//R$ 1.000,00

//O menu deverá ser:
//===== CAIXA ELETRÔNICO =====

//1 - Consultar saldo
//2 - Depositar
//3 - Sacar
//4 - Sair

//O programa deve:
//Permitir consultar o saldo.
//Permitir realizar depósitos.
//Permitir realizar saques.
//Impedir saques maiores que o saldo disponível.
//Informar quando uma opção for inválida.
//Continuar mostrando o menu até o usuário escolher 4.

package Nivel_5_Problemas_Praticos;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in);

        boolean menu = true;
        double saldo = 1000.0;
        double deposito = 0;
        double saque = 0;

        while(menu){

            System.out.println("===== CAIXA ELETRÔNICO =====");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");

            int escolhaMenu = teclado.nextInt();

            if(escolhaMenu <= 0 || escolhaMenu > 4){
                System.out.println("Número inválido!");
            }else{
                switch (escolhaMenu){
                    case 1 ->
                        System.out.println(saldo);
                    case 2 -> {
                        System.out.println("Digite o valor do depósito: ");
                        deposito = teclado.nextDouble();
                        if(deposito <= 0){
                            System.out.println("Erro!");
                        }else{
                            saldo = saldo + deposito;
                            System.out.println("Saldo atualizado: " + saldo);
                        }
                    }
                    case 3 -> {
                        System.out.println("Digite o valor do saque: ");
                        saque = teclado.nextDouble();
                        if(saque > saldo){
                            System.out.println("Saldo insuficiente!");
                        }else if (saque <= 0){
                            System.out.println("Erro!");
                        }else{
                            saldo = saldo - saque;
                        System.out.println("Você sacou: " + saque + " Saldo atualizado: " + saldo);
                        }
                    }
                    case 4 ->
                        menu = false;
                    default -> System.out.println("Erro!");
                }
            }
        }
    }
}
