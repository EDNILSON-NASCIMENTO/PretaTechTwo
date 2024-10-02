import java.util.Scanner;

public class ListaExe8 {
    public static void main(String[] args) {

        //variaveis
        Scanner leia = new Scanner(System.in);
        double custoConsumidor;
        double custoFabrica;
        double percentagemDistribuidor;
        double impostos;

        //entradas
        System.out.println("Digite o custo de fabrica: ");
        custoFabrica = leia.nextDouble();

        //processamentos
        percentagemDistribuidor = custoFabrica * 0.28;
        impostos = custoFabrica * 0.45;
        custoConsumidor = custoFabrica + percentagemDistribuidor + impostos;

        //saida
        System.out.println("O custo ao consumidor: R$ " + custoConsumidor);



    }
}
