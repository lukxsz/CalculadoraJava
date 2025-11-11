
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        System.out.println("      ------Calculadora------");
        do {
            System.out.println("Qual operação deseja realizar dessa vez? \n" +
                    " Lista de Operações: \n" +
                    " (1) Adição \n" +
                    " (2) Subtração \n" +
                    " (3) Multiplicação \n" +
                    " (4) Divisão \n" +
                    " (5) Tabuada \n"+
                    " (0) Sair");
            escolha = scanner.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("Adição");
                        Operacao adicao = new Operacao();
                        adicao.Adicao();
                    break;
                case 2:
                    System.out.println("Subtração");
                    Operacao subtracao = new Operacao();
                    subtracao.Subtracao();
                    break;
                case 3:
                    System.out.println("Multiplicação");
                    Operacao multiplicacao = new Operacao();
                    multiplicacao.Multiplicacao();
                    break;
                case 4:
                    System.out.println("Divisão");
                    Operacao divisao = new Operacao();
                    divisao.Divisao();
                    break;
                case 5:
                    System.out.println("Tabuada");
                    Operacao tabuada = new Operacao();
                    tabuada.Tabuada();
                    break;
                case 0:
                    System.out.println("Espero que tenha gostado \n Obrigado por usar :) \n    Encerrando...");
                    break;
            }
        }while (escolha != 0);
}   }