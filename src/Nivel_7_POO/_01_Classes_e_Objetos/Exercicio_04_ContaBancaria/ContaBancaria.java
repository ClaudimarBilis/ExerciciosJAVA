package Nivel_7_POO._01_Classes_e_Objetos.Exercicio_04_ContaBancaria;

public class ContaBancaria {
    String titular;
    double saldo;

    void mostrarSaldo(){
        System.out.println("===== MOSTRAR SALDO =====");
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }

    void depositar(double valor){
        System.out.println("===== DEPÓSITO =====");
        if(valor > 0){
            System.out.printf("Saldo inicial: R$ %.2f%n", saldo);
            System.out.printf("Depósito: R$ %.2f%n", valor);
            saldo += valor;
            System.out.printf("Novo saldo: R$ %.2f%n", saldo);
        }else{
            System.out.println("Valor de depósito inválido!");
        }
    }

    void sacar(double valor){
        System.out.println("===== SAQUE =====");
        if(valor > 0 && valor <= saldo){
            System.out.printf("Saldo inicial: R$ %.2f%n", saldo);
            System.out.printf("Saque: R$ %.2f%n", valor);
            System.out.println("Saque realizado!");
            saldo -= valor;
            System.out.printf("Novo saldo: R$ %.2f%n", saldo);
        }else if(valor < 0){
            System.out.println("Valor inválido!");
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
}
