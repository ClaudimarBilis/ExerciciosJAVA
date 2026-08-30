package Nivel_7_POO._01_Classes_e_Objetos.Exercicio_03_Carro;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.marca = "Chevrolet";
        c1.modelo = "Corsa";
        c1.ano = 2004;
        c1.velocidade = 0;

        c2.marca = "Fiat";
        c2.modelo = "Palio";
        c2.ano = 2009;
        c2.velocidade = 14;

        c1.acelerar();
        c1.mostrarDados();
        c1.acelerar();
        c1.mostrarDados();
        System.out.println();
        c2.acelerar();
        c2.mostrarDados();
        c2.acelerar();
        c2.mostrarDados();

    }
}
