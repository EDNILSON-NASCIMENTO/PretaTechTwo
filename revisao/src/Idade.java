import java.util.Scanner;

public class Idade {

        public static void main(String[] args){
            //variaveis
            Scanner leia = new Scanner(System.in);
            String nomePessoa;
            int anoNascimento;
            int idade;

            //entradas
            System.out.println("Digite o nome da pessoa: ");
            nomePessoa = leia.nextLine();
            System.out.println("Digite o ano de nascimento da pessoa: ");
            anoNascimento = leia.nextInt();

            //processamento
            idade = 2024 - anoNascimento;

            //saida
            System.out.printf("Oi %s sua idade aproximada da é %d anos!\n", nomePessoa, idade);
            System.out.println("Oi "+nomePessoa+" sua idade é "+idade+" anos!");
            leia.close();

        }

}
