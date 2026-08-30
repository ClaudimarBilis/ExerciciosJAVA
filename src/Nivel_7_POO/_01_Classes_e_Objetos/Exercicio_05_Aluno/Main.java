package Nivel_7_POO._01_Classes_e_Objetos.Exercicio_05_Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.nome = "João";
        a1.nota1 = 7.8;
        a1.nota2 = 4.6;
        a1.nota3 = 8.2;

        a2.nome = "Davi";
        a2.nota1 = 7.8;
        a2.nota2 = 8.7;
        a2.nota3 = 8.6;

        a1.relatorio();
        a2.relatorio();
    }
}
