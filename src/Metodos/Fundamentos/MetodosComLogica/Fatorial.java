//O método deve:

//Receber um número inteiro.
//Calcular o fatorial desse número.
//Retornar o resultado.

package Metodos.Fundamentos.MetodosComLogica;

public class Fatorial {
    public static void main(String[] args) {
        long resultado = calcularFatorial(10);
        System.out.println(resultado);
    }

    static long calcularFatorial(int numero){
        long resultado = 1;

        for(int i=1; i<=numero; i++)
            resultado *= i;

        return resultado;
    }
}
