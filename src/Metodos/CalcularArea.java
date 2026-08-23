//O método deve:

//Receber a largura do retângulo.
//Receber a altura do retângulo.
//Calcular a área.
//Retornar o resultado.

package Metodos;

public class CalcularArea {
    public static void main(String[] args) {
        double resultado = calcularArea(30.34, 40.12);
        System.out.printf("A área total aproximada é: %.2f%n", resultado);
    }

    static double calcularArea (double largura, double altura){
        double resultado = largura * altura;
        return resultado;
    }
}
