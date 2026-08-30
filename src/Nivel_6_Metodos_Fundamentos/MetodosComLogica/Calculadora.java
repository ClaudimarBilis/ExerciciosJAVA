//O programa deve:

//Pedir ao usuário o primeiro número.
//Pedir o segundo número.
//Mostrar um menu de operações:
//1 → Soma
//2 → Subtração
//3 → Multiplicação
//4 → Divisão
//Criar métodos separados para cada operação.
//Utilizar o metodo correspondente à escolha do usuário.
//Mostrar o resultado.

package Nivel_6_Metodos_Fundamentos.MetodosComLogica;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1 = teclado.nextDouble();
        System.out.println("Digite o segundo número: ");
        double n2 = teclado.nextDouble();
        System.out.println("===== Menu de operações =====");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        char menu = teclado.next().charAt(0);

        double resultado = switch (menu) {
            case '1' -> somar(n1, n2);
            case '2' -> subtrair(n1, n2);
            case '3' -> multiplicar(n1, n2);
            case '4' -> dividir(n1, n2);
            default -> 0;
        };

        System.out.println(resultado);
        teclado.close();

    }

    static double somar(double n1, double n2){
        return n1 + n2;
    }

    static double subtrair(double n1, double n2){
        return n1 - n2;
    }

    static double multiplicar(double n1, double n2){
        return n1 * n2;
    }

    static double dividir(double n1, double n2){
        return n1 / n2;
    }
}
