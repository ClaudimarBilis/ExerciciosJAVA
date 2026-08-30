//O metodo somarEDobrar deve:

//Receber dois números.
//Somar os dois.
//Chamar o metodo dobrar() passando o resultado da soma.
//Retornar o resultado final.

package Nivel_6_Metodos_Fundamentos.MetodosSimples;

public class CalcularResultado {
    public static void main(String[] args) {
        int resultado = somarEDobrar(30, 10);
        System.out.println(resultado);
    }

    static int somarEDobrar (int numero1, int numero2){
        int soma = numero1 + numero2;
        return dobrar(soma);
    }

    static int dobrar(int numero){
        int resultado = numero * 2;
        return resultado;
    }
}
