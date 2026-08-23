//Esse método deve:

//Receber um número inteiro.
//Verificar se o número é positivo.
//Retornar true se for positivo.
//Retornar false caso contrário.

package Metodos.Fundamentos;

public class VerificarPositivo {
    public static void main(String[] args) {
        boolean resultado = ehPositivo(100);
        System.out.println(resultado);
    }

    static boolean ehPositivo (int numero){
        return numero > 0;
    }

}
