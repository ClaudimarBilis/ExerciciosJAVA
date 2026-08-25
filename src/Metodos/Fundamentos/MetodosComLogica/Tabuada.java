//O método deve:

//Receber um número inteiro.
//Percorrer de 1 até 10.
//Calcular a multiplicação do número pelo contador.
//Mostrar a tabuada.

package Metodos.Fundamentos.MetodosComLogica;

public class Tabuada {
    public static void main(String[] args) {
        mostrarTabuada(8);
    }

    static void mostrarTabuada(int numero) {
        for (int i = 1; i <= 10; i++){
            int tabuada = numero * i;
            System.out.println(numero + " x " + i + " = " + tabuada);
        }
    }
}
