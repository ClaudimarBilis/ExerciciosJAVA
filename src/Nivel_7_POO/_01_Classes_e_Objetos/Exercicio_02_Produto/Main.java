package Nivel_7_POO._01_Classes_e_Objetos.Exercicio_02_Produto;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto();

        p1.nome = "Monitor";
        p1.preco = 899.99;
        p1.quantidade = 10;

        p2.nome = "Teclado";
        p2.preco = 100.00;
        p2.quantidade = 23;

        p1.mostrarDados();
        System.out.println();
        p2.mostrarDados();
    }
}
