//O método deve:

//Receber uma temperatura em Celsius.
//Converter para Fahrenheit.
//Retornar o resultado.

package Nivel_6_Metodos_Fundamentos.MetodosSimples;

public class ConversorTemperatura {
    public static void main(String[] args) {
        double resultado = celsiusParaFahrenheit(23);
        System.out.printf("A conversão de celsius para Fahrenheit: %.1f%n", resultado);
    }

    static double celsiusParaFahrenheit(double celsius){
        double resultado = (celsius * 9 / 5) + 32;
        return resultado;
    }
}
