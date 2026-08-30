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
}
