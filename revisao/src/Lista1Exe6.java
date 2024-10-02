import java.util.Scanner;

public class Lista1Exe6 {
    public static void main(String[] args) {

        //variaveis
        Scanner leia = new Scanner(System.in);

        double D, X1, Y1, X2, Y2;

        System.out.println("Digite o valor do X1: ");
        X1 = leia.nextDouble();
        System.out.println("Digite o valor do Y1: ");
        Y1 = leia.nextDouble();
        System.out.println("Digite o valor do X2: ");
        X2 = leia.nextDouble();
        System.out.println("Digite o valor do Y2: ");
        Y2 = leia.nextDouble();

        //processamento
        D = Math.sqrt(Math.pow((X2-X1),2.0)+Math.pow((Y2-Y1),2.0));

        //saida
        System.out.printf("O valor de D é %.2f\n", D);




    }
}
