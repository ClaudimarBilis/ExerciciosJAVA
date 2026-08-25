//O método deve:

//Receber um número inteiro.
//Verificar se ele está entre 10 e 100, incluindo 10 e 100.
//Retornar true se estiver dentro do intervalo.
//Retornar false caso contrário.

package Metodos.Fundamentos.MetodosComLogica;

public class VerificarIntervalo {
    public static void main(String[] args) {
        boolean resultado = estaNoIntervalo(9);
        System.out.println(resultado);
    }

    static boolean estaNoIntervalo(int numero){
        return numero >= 10 && numero <=100;
    }
}
