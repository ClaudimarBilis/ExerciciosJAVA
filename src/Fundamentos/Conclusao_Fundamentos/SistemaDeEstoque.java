/*Sistema de estoque

Agora vamos para um problema mais próximo de um pequeno sistema comercial.
Crie um programa que controle um produto em estoque.
O sistema deve começar com:

Produto: Teclado
Quantidade: 10

E apresentar o menu:

===== SISTEMA DE ESTOQUE =====

1 - Consultar estoque
2 - Adicionar produtos
3 - Remover produtos
4 - Sair

O programa deve:

Consultar a quantidade atual em estoque.
Adicionar produtos ao estoque.
Remover produtos do estoque.
Impedir a remoção de uma quantidade maior que a disponível.
Não permitir adicionar ou remover 0 ou valores negativos.
Continuar mostrando o menu até escolher 4.
Informar opções inválidas.
Exemplo

===== SISTEMA DE ESTOQUE =====

1 - Consultar estoque
2 - Adicionar produtos
3 - Remover produtos
4 - Sair


Escolha: 1

Produto: Teclado
Quantidade em estoque: 10

Depois:

Escolha: 2

Quantidade para adicionar: 5
Estoque atualizado: 15

E:

Escolha: 3

Quantidade para remover: 4
Estoque atualizado: 11*/

package Fundamentos.Conclusao_Fundamentos;
import java.util.Scanner;

public class SistemaDeEstoque {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      boolean loop = true;
      String produto = "teclado";
      int quantidade = 10;

      while(loop){

        System.out.println();
        System.out.println("===== SISTEMA DE ESTOQUE =====");
        System.out.println("1 - Consultar estoque");
        System.out.println("2 - Adicionar produtos");
        System.out.println("3 - Remover produtos");
        System.out.println("4 - Sair");

        int menu = teclado.nextInt();

        switch(menu){
          case 1 ->{
            System.out.println("Produto: " + produto);
            System.out.println("Quantidade: " + quantidade);
            }

          case 2 -> {
            System.out.println("Quantidade para adicionar: ");
            int quantidadeAdicionar = teclado.nextInt();
            if(quantidadeAdicionar <= 0){
              System.out.println("Número inválido!");
            } else {
            quantidade = quantidade + quantidadeAdicionar;
            System.out.println("Estoque atualizado: " + quantidade);}
            }

          case 3 -> {
            System.out.println("Quantidade para remover: ");
            int quantidadeRemover = teclado.nextInt();
            if(quantidadeRemover <= 0){
              System.out.println("Número inválido!");
            } else if (quantidadeRemover > quantidade){
              System.out.println("Estoque insuficiente!");
            } else {
            quantidade = quantidade - quantidadeRemover;
            System.out.println("Estoque atualizado: " + quantidade);}
            }

          case 4 -> {
            System.out.println("Obrigado por usar nosso sistema! Até mais!");
            loop = false;
            }
          default -> System.out.println("Escolha inválida!");  
      }
    }
  }
}
