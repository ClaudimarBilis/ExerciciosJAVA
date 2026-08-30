//O programa deverá:

//Pedir o preço de 3 produtos.
//Calcular o subtotal.
//Pedir um percentual de desconto.
//Calcular o valor do desconto.
//Calcular o preço final.
//Pedir quanto o cliente pagou.
//Calcular o troco.
//Mostrar um resumo da compra.

package Nivel_6_Metodos_Fundamentos.MetodosComLogica;
import java.util.Scanner;

public class MiniCaixa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o preço de 3 produtos:");
        double preco1 = teclado.nextDouble();
        double preco2 = teclado.nextDouble();
        double preco3 = teclado.nextDouble();
        double subtotal = calcularSubtotal(preco1, preco2, preco3);
        System.out.println();
        System.out.println("Qual o percentual (%) de desconto?");
        double percentual = teclado.nextDouble();
        double valorDesconto = calcularValorDesconto(subtotal, percentual);
        double valorFinal = calcularPrecoFinal(subtotal, valorDesconto);
        System.out.println();
        System.out.println("Quanto o cliente pagou?");
        double valorPagamento = teclado.nextDouble();
        double troco = calcularTroco(valorFinal, valorPagamento);
        System.out.println();
        System.out.println("===== RESUMO DA COMPRA =====");
        System.out.printf("Produto 1: R$ %.2f%n", preco1);
        System.out.printf("Produto 2: R$ %.2f%n", preco2);
        System.out.printf("Produto 3: R$ %.2f%n", preco3);
        System.out.printf("Subtotal: R$ %.2f%n", subtotal);
        System.out.println("Desconto: %" + percentual);
        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Total: R$ %.2f%n", valorFinal);
        System.out.printf("Valor pago: R$ %.2f%n", valorPagamento);
        System.out.printf("Troco: R$ %.2f%n", troco);

    }

    static double calcularSubtotal(double preco1, double preco2, double preco3){
        double subtotal = preco1 + preco2 + preco3;
        return subtotal;
    }

    static double calcularValorDesconto(double subtotal, double percentualDesconto){
        double desconto = (subtotal * percentualDesconto) / 100;
        return desconto;
    }

    static double calcularPrecoFinal (double subtotal, double valorDesconto){
        double precoFinal = subtotal - valorDesconto;
        return precoFinal;
    }

    static double calcularTroco (double precoFinal, double valorPagamento){
        double troco = valorPagamento - precoFinal;
        return troco;
    }
}
