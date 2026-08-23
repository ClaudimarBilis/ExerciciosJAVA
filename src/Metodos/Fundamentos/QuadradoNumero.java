//O método deve:

//Receber um número inteiro.
//Calcular o quadrado desse número.
//Retornar o resultado.

package Metodos.Fundamentos;

public class QuadradoNumero {
    public static void main(String[] args) {
        int resultado = numeroAoQuadrado(98);
        System.out.println("O resultado do número ao quadrado é: " + resultado);
    }

    static int numeroAoQuadrado(int numero){
        return numero * numero;
    }
}
