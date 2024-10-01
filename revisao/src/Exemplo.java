import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) {


        Scanner leia = new Scanner(System.in);
        int a;
        int b;

        System.out.println("Digite um numero: ");
        a = leia.nextInt();
        System.out.println("Digite um numero: ");
        b = leia.nextInt();
        System.out.printf("Soma = %d", (a + b));

    }
}
