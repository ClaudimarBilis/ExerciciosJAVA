//O método deve:

//Receber dois números inteiros.
//Comparar os dois números.
//Retornar o maior número.

package Nivel_6_Metodos_Fundamentos.MetodosSimples;

public class MaiorNumero {
    public static void main(String[] args) {
        int resultado = maiorNumero(56, 57);
        System.out.println("O maior número é: " + resultado );
    }

    static int maiorNumero(int numero1, int numero2){

        if(numero1 > numero2){
            return numero1;
        }else{
            return numero2;
        }
    }
}
