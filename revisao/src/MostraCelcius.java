import java.util.Scanner;

public class MostraCelcius{

    public static void main(String[] args){

        //variaveis
        Scanner leia = new Scanner(System.in);
        String nomeBrazuca;
        double tempF;
        double tempC;

        //entrada
        System.out.print("Digite o nome brazuca: ");
        nomeBrazuca = leia.nextLine().toUpperCase();
        System.out.print("Digite a temperatura em faren : ");
        tempF = leia.nextDouble();

        //processamento
        tempC =(( tempF - 32 ) * 5)/9;
        //saida
        System.out.printf("oi %s a temperatura em celciuis é %.2f Cº", nomeBrazuca, tempC);

    }

}
