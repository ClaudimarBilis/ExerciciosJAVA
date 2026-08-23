//O método deve:

//Receber a idade de uma pessoa.
//Verificar se a idade é 18 anos ou mais.
//Retornar true se puder votar.
//Retornar false caso contrário.

package Metodos;

public class VerificarIdade {
    public static void main(String[] args) {
        boolean resultado = podeVotar(18);
        System.out.println(resultado);
    }

    static boolean podeVotar(int idade){
        return idade >= 18;
    }
}
