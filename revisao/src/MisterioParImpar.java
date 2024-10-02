import java.util.Scanner;

public class MisterioParImpar {
    public static void main(String[] args) {

        //variavel
        Scanner leia = new Scanner(System.in);
        int numeroDigitado;

        //entrada
        System.out.print("Digite um numero: ");
        numeroDigitado = leia.nextInt();

        //processamento
        if (numeroDigitado < 0) {
            System.out.println("numero negativo, não é par nem impar!!!");
        }
        else if (numeroDigitado==0){
            System.out.println("Zero é neutro");
        }
        else if ((numeroDigitado%2)==0){
            System.out.println("O numero é Par");
        }
        else {
            System.out.println("O numero é Impar");
        }



        System.out.print("Fim do programa");

    }
}
