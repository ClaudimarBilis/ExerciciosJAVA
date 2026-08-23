//Esse método deve:

//Receber um número inteiro.
//Verificar se o número é par.
//Retornar true se for par.
//Retornar false se for ímpar.

package Metodos.Fundamentos;

public class VerificarPar {
    public static void main(String[] args) {
        boolean resultado = ehPar(10);
        System.out.println(resultado);
    }

    static boolean ehPar (int numero){
        return numero % 2 == 0;
    }
}
