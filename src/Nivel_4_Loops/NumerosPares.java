//Faça um programa que mostre todos os números pares entre 1 e 100.
//Regras:

//Use: for, if, operador %;


package Nivel_4_Loops;

public class NumerosPares {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
