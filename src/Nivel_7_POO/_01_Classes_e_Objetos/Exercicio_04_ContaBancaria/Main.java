package Nivel_7_POO._01_Classes_e_Objetos.Exercicio_04_ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        ContaBancaria c2 = new ContaBancaria();

        c1.titular = "Godofredo";
        c1.saldo = 1500;

        c2.titular = "Hernesto";
        c2.saldo = 1000;

        c1.mostrarSaldo();
        c1.depositar(1000);
        System.out.println();
        c1.sacar(1500);
        System.out.println();
        c1.mostrarSaldo();
        System.out.println();
        c2.mostrarSaldo();
        System.out.println();
        c2.depositar(100);
        System.out.println();
        c2.sacar(600);
        System.out.println();
        c2.mostrarSaldo();
    }
}
