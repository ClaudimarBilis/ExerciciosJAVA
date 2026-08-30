//O método deve:

//Receber um número inteiro limite.
//Percorrer os números de 1 até limite.
//Contar quantos números pares existem.
//Retornar a quantidade encontrada.

package Nivel_6_Metodos_Fundamentos.MetodosComLogica;

public class ContarPares {
    public static void main(String[] args) {
        int resultado = contarPares(100);
        System.out.println(resultado);
    }

    static int contarPares(int limite){
        int contador = 0;

        for(int numero=1; numero<=limite; numero++){
            if(numero % 2 == 0){
                contador++;
            }
        }
        return contador;
    }
}
