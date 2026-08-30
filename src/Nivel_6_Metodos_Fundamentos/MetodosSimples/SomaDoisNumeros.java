//Esse método deve:

//Receber dois números inteiros.
//Somar os dois números.
//Retornar o resultado.

package Nivel_6_Metodos_Fundamentos.MetodosSimples;

public class SomaDoisNumeros {
    public static void main(String[] args) {
        int resultado = somar (30, 34);
        System.out.println(resultado);
    }

    static int somar(int numero1, int numero2){
        int resultado = numero1 + numero2;
        return resultado;
    }
}
