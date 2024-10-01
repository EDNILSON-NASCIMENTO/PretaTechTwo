import java.util.Scanner;

public class MostraFaren {

    public static void main(String[] args) {

        //variaveis
        Scanner leia = new Scanner(System.in);
        String nomeTurista;
        double tempC;
        double tempF;

        //entradas
        System.out.println("Nome turista: ");
        nomeTurista = leia.nextLine();
        System.out.println("Temperatura em Celsius: ");
        tempC = leia.nextDouble();

        //processamento
        tempF = tempC * 1.8 + 32;

        //saida
        System.out.printf("Oi %s, a temperatura é faren é %.10f Fº", nomeTurista, tempF);

    }
}
