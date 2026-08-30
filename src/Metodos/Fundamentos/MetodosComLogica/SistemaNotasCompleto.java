//O programa deve:
//Pedir o nome do aluno.
//Pedir três notas.
//Calcular a média.
//Verificar a situação.
//Informar se o aluno foi aprovado.
//Mostrar um relatório final.

package Metodos.Fundamentos.MetodosComLogica;
import java.util.Scanner;

public class SistemaNotasCompleto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("Digite suas 3 notas: ");
        double primeiraNota = teclado.nextDouble();
        double segundaNota = teclado.nextDouble();
        double terceiraNota = teclado.nextDouble();
        double media = calcularMedia(primeiraNota, segundaNota, terceiraNota);
        String situacao = verificarSituacao(media);
        boolean aprovacao = estaAprovado(media);

        System.out.println("===== RELATÓRIO =====");
        System.out.println("Aluno: " + nome);
        System.out.printf("Nota 1: %.2f%n", primeiraNota);
        System.out.printf("nota 2: %.2f%n", segundaNota);
        System.out.printf("Nota 3: %.2f%n", terceiraNota);
        System.out.printf("Média: %.2f%n", media);
        System.out.println("Situação: " + situacao);
        System.out.println("Está aprovado? " + aprovacao);
    }

    static double calcularMedia(double primeiraNota, double segundaNota, double terceiraNota){
        double media = (primeiraNota + segundaNota + terceiraNota) / 3;
        return media;
    }

    static String verificarSituacao(double media){
        if(media >= 7){
            return "Aprovado";
        }else if(media >= 5){
            return "Recuperação!";
        }else{
            return "Reprovado!";
        }
    }

    static boolean estaAprovado(double media){
        return media >= 7;
    }
}
