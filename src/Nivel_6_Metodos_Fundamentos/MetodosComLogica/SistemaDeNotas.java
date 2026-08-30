//O programa deve:

//Pedir o nome do aluno.
//Pedir 3 notas.
//Utilizar um método para calcular a média.
//Utilizar outro método para verificar a situação do aluno.
//Mostrar o nome, as notas, a média e a situação.

package Nivel_6_Metodos_Fundamentos.MetodosComLogica;
import java.util.Scanner;

public class SistemaDeNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = teclado.nextLine();

        System.out.println("Digite a primeira nota: ");
        double nota1 = teclado.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = teclado.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = teclado.nextDouble();

        double media = calcularMedia(nota1, nota2, nota3);
        String situacao = verificarSituacao(media);

        System.out.println("Nome: " + nome);
        System.out.printf("Nota 1: %.2f%n", nota1);
        System.out.printf("Nota 2: %.2f%n", nota2);
        System.out.printf("Nota 3: %.2f%n", nota3);
        System.out.printf("Média: %.2f%n", media);
        System.out.println("Situação: " + situacao);

    }

    static double calcularMedia(double nota1, double nota2, double nota3){
        double media = (nota1 + nota2 + nota3) / 3;
        return media;
    }

    static String verificarSituacao(double media){
        String resultado = "";
        if(media >= 7){
            resultado = "Aprovado!";
        }else if(media >= 5){
            resultado = "Recuperação";
        }else {
            resultado = "Reprovado!";
        }

        return resultado;
    }
}
