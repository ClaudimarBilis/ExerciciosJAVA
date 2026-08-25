//O método deve:

//Receber três números inteiros.
//Comparar os três números.
//Retornar o maior deles.

package Metodos.Fundamentos.MetodosComLogica;

public class MaiorDeTres {
    public static void main(String[] args) {
        int resultado = maiorDeTres(23, 23, 34);
        System.out.println("O número maior é: "+ resultado);
    }

    static int maiorDeTres(int n1, int n2, int n3) {

        if(n1 >= n2 && n1 >= n3){
            return n1;
        }else if(n2 >= n1 && n2 >= n3){
            return n2;
        }else{
            return n3;
        }
    }
}
