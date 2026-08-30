//Menu de operações

//Pedir dois números.

//Mostrar:

//1 - Somar
//2 - Subtrair
//3 - Multiplicar
//4 - Dividir

//Executar a operação escolhida.
//Tratar opção inválida.

package Nivel_3_Switch;
import java.util.Scanner;

public class MenuDeOperacoes {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite dois números: ");

        double primeiroNumero = teclado.nextDouble();
        double segundoNumero = teclado.nextDouble();

        System.out.println("Menu: ");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Divisão");
        System.out.println("Digite sua opção: ");

        int escolhaMenu = teclado.nextInt();

        if (escolhaMenu <= 0 || escolhaMenu > 4){
            System.out.println("Número inválido!");
        } else if (escolhaMenu == 4 && segundoNumero == 0) {
            System.out.println("Erro!");
        } else {
            double resultado = switch (escolhaMenu) {
                case 1 -> primeiroNumero + segundoNumero;
                case 2 -> primeiroNumero - segundoNumero;
                case 3 -> primeiroNumero * segundoNumero;
                case 4 -> primeiroNumero / segundoNumero;
                default -> 0;
            };
                System.out.println(resultado);
            }
        }
    }
