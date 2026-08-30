package Nivel_7_POO._01_Classes_e_Objetos.Exercicio_05_Aluno;

public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double nota3;

    double calcularMedia(){
        double media = (nota1 + nota2 + nota3) / 3;
        return media;
    }

    String verificarSituacao(double media){
        if(media >= 7){
            return "Aprovado!";
        }else if(media >= 5){
            return "Recuperação!";
        }else{
            return "Reprovado";
        }
    }

    void relatorio(){
        System.out.println("===== ALUNO =====");
        System.out.println("Nome: " + nome);
        System.out.printf("Nota 1: %.2f%n", nota1);
        System.out.printf("Nota 2: %.2f%n", nota2);
        System.out.printf("Nota 3: %.2f%n", nota3);
        System.out.printf("Média: %.2f%n", calcularMedia());
        System.out.println("Situação: " + verificarSituacao(calcularMedia()));
        System.out.println();
    }
}
