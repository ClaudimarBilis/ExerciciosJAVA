package Nivel_7_POO._01_Classes_e_Objetos.Exercicio_02_Produto;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    void mostrarDados() {
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f%n", preco);
        System.out.println("Quantidade: " + quantidade);
    }
}
