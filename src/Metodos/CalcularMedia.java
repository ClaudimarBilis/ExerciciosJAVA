//O método deve:

//Receber três números double.
//Somar as três notas.
//Dividir a soma por 3.
//Retornar a média.

package Metodos;

public class CalcularMedia {
    public static void main(String[] args) {
        double resultado = media(45, 233, 12);
        System.out.printf("Media: %.2f%n", resultado);
    }

    static double media(double nota1, double nota2, double nota3){
        double resultado = (nota1 + nota2 + nota3) / 3;
        return resultado;
    }
}
