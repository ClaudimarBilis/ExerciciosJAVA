package Practical_Problems;
import java.util.Scanner;

public class CaixaDeSupermercado {
    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in);

        boolean compras = true;

        int quantidadeProdutos = 0;
        double valorTotal = 0;

        while(compras){

            System.out.println("===== CAIXA DE SUPERMERCADO =====");
            System.out.println();
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Ver total");
            System.out.println("3 - Finalizar compra");

            int menu = teclado.nextInt();

            switch(menu){
                case 1 -> {
                    System.out.println("Digite o preço do produto: ");
                    double preco = teclado.nextDouble();

                    if (preco <= 0) {
                        System.out.println("Preço inválido!");
                    } else {
                        valorTotal = preco + valorTotal;
                        quantidadeProdutos++;
                    }
                }

                case 2 -> System.out.println("Valor total: " + valorTotal);

                case 3 -> compras = false;

                default -> System.out.println("Número inválido!");
            }
        }

        System.out.println("Compra finalizada!");
        System.out.println("Quantidade de produtos: " + quantidadeProdutos);
        System.out.println("Valor total: " + valorTotal);
    }
}
