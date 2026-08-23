//Regras
//Não coloque os cálculos diretamente no main.
//Cada operação deve ser feita pelo seu respectivo método.
//Use return.
//Formate a divisão com %.2f.

package Metodos;

public class SistemaCalculadora {
    public static void main(String[] args) {
        double soma = somar(13, 7);
        double subtracao = subtrair(13, 7);
        double multiplicacao = multiplicar(13, 7);
        double divisao = dividir(13, 7);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.printf("Divisão: %.2f%n", divisao);
    }

    static double somar (double a, double b){
        double soma = a + b;
        return  soma;
    }

    static double subtrair (double a, double b){
        double subtracao = a - b;
        return subtracao;
    }

    static double multiplicar (double a, double b){
        double multiplicacao = a * b;
        return multiplicacao;
    }

    static double dividir (double a, double b){
        double divisao = a / b;
        return divisao;
    }
}
