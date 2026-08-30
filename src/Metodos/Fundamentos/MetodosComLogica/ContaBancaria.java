package Metodos.Fundamentos.MetodosComLogica;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double saldo = 1000;

        System.out.println("Saldo: " + consultarSaldo(saldo));
        System.out.println();
        System.out.println("Digite o valor para depositar: ");
        saldo = depositar(saldo, teclado.nextDouble());
        System.out.println("Depositando...");
        System.out.println("Saldo atualizado: " + consultarSaldo(saldo));
        System.out.println();
        System.out.println("Digite o valor para saque: ");
        saldo = sacar(saldo, teclado.nextDouble());
        System.out.println("Sacando...");
        System.out.println();
        System.out.println("Saldo atualizado: " + consultarSaldo(saldo));
    }

    static double consultarSaldo(double saldo){
        return saldo;
    }

    static double depositar(double saldo, double valor){
        if(valor > 0){
           saldo += valor;
        }
        return saldo;
    }

    static double sacar(double saldo, double valor){
        if(valor <= saldo){
            saldo -= valor;
        }
        return saldo;
    }
}
