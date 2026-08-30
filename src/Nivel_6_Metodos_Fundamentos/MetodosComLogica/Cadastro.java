package Nivel_6_Metodos_Fundamentos.MetodosComLogica;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();
        System.out.println("Digite seu salário: ");
        double salario = teclado.nextDouble();

        boolean nomeValido = validarNome(nome);
        boolean idadeValida = validarIdade(idade);
        boolean salarioValido = validarSalario(salario);

        System.out.println("Nome válido: " + nomeValido);
        System.out.println("Idade válida: " + idadeValida);
        System.out.println("Salário válido: " + salarioValido);
    }

    static boolean validarNome(String nome){
        return !nome.isEmpty();
    }

    static boolean validarIdade(int idade){
        return (idade >= 0 && idade <= 120);
    }

    static boolean validarSalario(double salario){
        return (salario > 0);
    }
}
