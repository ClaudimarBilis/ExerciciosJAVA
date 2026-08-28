//O programa deve:

//Pedir ao usuário um valor em reais (R$).
//Pedir a cotação do dólar.
//Converter o valor de reais para dólares.
//Mostrar o resultado.

//O método deve:

//Receber o valor em reais.
//Receber a cotação do dólar.
//Calcular quantos dólares o valor representa.
//Retornar o resultado.

package Metodos.Fundamentos.MetodosComLogica;
import java.util.Scanner;

public class ConversorMoeda {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor em R$: ");
        double reais = teclado.nextDouble();
        System.out.println("Digite a cotação do dólar: ");
        double cotacao = teclado.nextDouble();

        double conversao = converterParaDolar(reais, cotacao);

        System.out.printf("Valor R$: %.2f%n", reais);
        System.out.printf("Cotação do dólar: %.2f%n", cotacao);
        System.out.printf("Valor em dólares: %.2f%n", conversao);

        teclado.close();
    }

    static double converterParaDolar (double reais, double cotacao){
        return reais / cotacao;
    }
}
