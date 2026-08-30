//Peça um número de 1 a 12 e mostre o mês correspondente.

//1 → Janeiro
//2 → Fevereiro
//3 → Março
//4 → Abril
//5 → Maio
//6 → Junho
//7 → Julho
//8 → Agosto
//9 → Setembro
//10 → Outubro
//11 → Novembro
//12 → Dezembro

//Qualquer número fora de 1 a 12 deve resultar em:

//Mês inválido!


package Nivel_3_Switch;
import java.util.Scanner;

public class MesDoAno {
    public static void main (String[]args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha um número de 1 a 12 para representar um mês: ");

        int mes = teclado.nextInt();

        if (mes < 1 || mes > 12){
            System.out.println("Mês inválido!");
        }else{
            String resultado = switch (mes){
                case 1 -> "Janeiro";
                case 2 -> "Fevereiro";
                case 3 -> "Março";
                case 4 -> "Abril";
                case 5 -> "Maio";
                case 6 -> "Junho";
                case 7 -> "Julho";
                case 8 -> "Agosto";
                case 9 -> "Setembro";
                case 10 -> "Outubro";
                case 11 -> "Novembro";
                case 12 -> "Dezembro";
                default -> "Mês inválido";
            };

            System.out.println(resultado);
        }
    }
}
