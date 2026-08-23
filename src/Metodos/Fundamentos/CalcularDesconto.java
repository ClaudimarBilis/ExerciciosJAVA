//O método deve:

//Receber o preço de um produto.
//Receber o percentual de desconto.
//Calcular o valor do desconto.
//Subtrair o desconto do preço.
//Retornar o preço final.

package Metodos.Fundamentos;

public class CalcularDesconto {
    public static void main(String[] args) {
        double precoFinal = calcularPrecoComDesconto(19.99, 20);
        System.out.printf("O valor total do produto com desconto é: R$%.2f%n", precoFinal);
    }

    static double calcularPrecoComDesconto (double preco, double percentualDesconto){
        double valorDesconto = preco * percentualDesconto / 100;
        double precoFinal = preco - valorDesconto;
        return precoFinal;
    }
}
