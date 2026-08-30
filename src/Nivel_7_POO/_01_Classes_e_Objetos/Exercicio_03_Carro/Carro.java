package Nivel_7_POO._01_Classes_e_Objetos.Exercicio_03_Carro;

public class Carro {
    String marca;
    String modelo;
    int ano;
    double velocidade;

    void mostrarDados(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidade + " km/h");
    }

    void acelerar(){
        velocidade += 10;
    }
}
