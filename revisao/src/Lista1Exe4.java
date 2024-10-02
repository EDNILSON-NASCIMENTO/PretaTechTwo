import java.util.Scanner;

public class Lista1Exe4 {
    public static void main(String[] args) {

        //variaveis
        Scanner leia = new Scanner(System.in);
        int A;
        int B;
        int C;
        double D, R, S;

        //entradas
        System.out.print("Digite o valor de A : ");
        A = leia.nextInt();
        System.out.print("Digite o valor de B : ");
        B = leia.nextInt();
        System.out.print("Digite o valor de C : ");
        C = leia.nextInt();

        //processamento
        R = (A+B)*(A+B);
        S = (B+C)*(B+C);
        D = (R+S)/2;

        //saida
        System.out.printf("O valor de D é = %.2f\n ", D);

    }
}
