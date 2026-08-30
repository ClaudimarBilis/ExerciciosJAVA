//Criar uma classe Pessoa que represente uma pessoa.

//A classe deverá possuir:
//nome
//idade

//E um método:
//apresentar()

//Esse método deverá exibir os dados da pessoa.

package Nivel_7_POO._01_Classes_e_Objetos.Exercicio_01_Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.nome = "Teste dos Santos";
        pessoa1.idade = 33;

        pessoa2.nome = "Jesuíno das Dores";
        pessoa2.idade = 45;

        pessoa1.apresentar();
        pessoa2.apresentar();
    }
}
