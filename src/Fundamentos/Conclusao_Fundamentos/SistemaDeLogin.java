package Fundamentos.Conclusao_Fundamentos;
import java.util.Scanner;

public class SistemaDeLogin {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      int tentativas = 1;
      String usuario = "admin";
      String senha = "1234";

      while(tentativas <= 3){

        System.out.println("===== SISTEMA DE LOGIN =====");

        System.out.println("Usuário: ");
        String usuarioTentativa = teclado.nextLine();

        System.out.println("Senha: ");
        String senhaTentativa = teclado.nextLine();

            if (usuarioTentativa.equals(usuario) && senhaTentativa.equals(senha)){
               System.out.println("Bem-vindo ao sistema!");
               break;

            }else{

              if (tentativas == 3){
                System.out.println("Tentativas excedidas! Usuário bloqueado!");
                break;
              }else{
              System.out.println("Usuário ou senha errados! Tente novamente.");
              tentativas++;
          }
        }
      }
    }
  }
