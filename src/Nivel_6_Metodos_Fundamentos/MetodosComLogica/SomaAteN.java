//O método deve:

//Receber um número inteiro N.
//Somar todos os números de 1 até N.
//Retornar o resultado.

package Nivel_6_Metodos_Fundamentos.MetodosComLogica;

public class SomaAteN {
    public static void main(String[] args) {
        int resultado = somarAteN(10);
        System.out.println(resultado);
    }

    static int somarAteN(int numero){
        int resultado = 0;

        for(int i=1; i<= numero; i++)
            resultado += i;

        return resultado;
    }
}
