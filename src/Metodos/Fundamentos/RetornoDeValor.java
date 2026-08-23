package Metodos.Fundamentos;

public class RetornoDeValor {
    public static void main (String[]args){
        int resultado = dobrar(45);
        System.out.println(resultado);
    }

    static int dobrar(int numero){
        int dobrarValor = numero * 2;
        return dobrarValor;
    }
}
