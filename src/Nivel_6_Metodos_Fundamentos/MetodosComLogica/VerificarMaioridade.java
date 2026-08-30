//O método deve:

//Receber uma idade.
//Retornar true se a idade for 18 ou maior.
//Retornar false se for menor que 18.

package Nivel_6_Metodos_Fundamentos.MetodosComLogica;

public class VerificarMaioridade {
    public static void main(String[] args) {
        boolean resultado = ehMaiorIdade(17);
        System.out.println(resultado);
    }

    static boolean ehMaiorIdade(int idade) {
        return idade >= 18;
    }
}
