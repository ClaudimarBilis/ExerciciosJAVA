package Practical_Problems;
import java.util.Scanner;

public class JogoDeAdivinhacaoCompleto {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        boolean loop1 = true;
        int numeroSecreto = 576;

        while(loop1){

          int tentativas = 1;

          System.out.println("Digite seu palpite: ");
          int palpite = teclado.nextInt();

                while(palpite != numeroSecreto){

                  if(palpite < numeroSecreto){
                      System.out.println("Chutou baixo! Tente novamente!");
                    }else{
                      System.out.println("Chutou alto! Tente novamente!");
                    }

                  palpite = teclado.nextInt();
                  tentativas++;
                }

                System.out.println("Parabéns! Você acertou!");
                System.out.println("Tentativas: " + tentativas);

            System.out.println("Deseja jogar novamente? (s/n)");
            char resposta = teclado.next().charAt(0);

            if (resposta == 's'){
            }else{
                loop1 = false;
            }

        }

        System.out.println("Fim de jogo! Obrigado por jogar!");

    }
}
