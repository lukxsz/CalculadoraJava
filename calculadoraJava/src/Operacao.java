import java.util.Objects;
import java.util.Scanner;
public class Operacao {
    Scanner scanner = new Scanner(System.in);
    int[] numeros = new int[10];
    int ponteiro;
    String escolha;
    int calculo;

    public void Adicao(){
        calculo = 0;
        while (!Objects.equals(escolha, "nao") & !Objects.equals(escolha, "não")){
            if (ponteiro > 1 & ponteiro < 9){
                System.out.println(calculo+"+");
                numeros[ponteiro] = scanner.nextInt();
                System.out.println("O resultado da sua soma é: "
                       +calculo+" + "+numeros[ponteiro]+" = "+(calculo+= numeros[ponteiro])+"!");
                ponteiro++;
                System.out.println("Deseja continuar esta soma?");
                escolha = scanner.next();
            }
            if (ponteiro == 1){
                System.out.println(calculo+"+");
                numeros[ponteiro] = scanner.nextInt();
                calculo+= numeros[ponteiro]; System.out.println("O resultado da sua soma é: "
                        +numeros[ponteiro-1]+" + "+numeros[ponteiro]+" = "+calculo+"!");
                ponteiro++;
                System.out.println("Deseja continuar esta soma?");
                escolha = scanner.next();
            }
            if (ponteiro < 1){
                System.out.println("Digite o numero a ser somado: ");
                numeros[ponteiro] = scanner.nextInt();
                calculo= numeros[ponteiro];
                ponteiro++;
            }
        }
    }
    public void Subtracao(){
        calculo = 0;
        while (!Objects.equals(escolha, "nao") & !Objects.equals(escolha, "não")){
            if (ponteiro == 9) {
                System.out.println("Limite de calculos atingidos...");
                escolha = "nao";
            }
            if (ponteiro > 1 & ponteiro < 9){
                System.out.println(calculo+" -");
                numeros[ponteiro] = scanner.nextInt();
                System.out.println("O resultado da sua subtração é: "
                        +calculo+" - "+numeros[ponteiro]+" = "+(calculo-= numeros[ponteiro])+"!");
                ponteiro++;
                System.out.println("Deseja continuar esta subtração?");
                escolha = scanner.next();
            }
            if (ponteiro == 1){
                System.out.println(calculo+" -");
                numeros[ponteiro] = scanner.nextInt();
                calculo-= numeros[ponteiro]; System.out.println("O resultado da sua subtração é: "
                        +numeros[ponteiro-1]+" - "+numeros[ponteiro]+" = "+calculo+"!");
                ponteiro++;
                System.out.println("Deseja continuar esta subtração?");
                escolha = scanner.next();
            }
            if (ponteiro < 1){
                System.out.println("Digite o numero a ser subtraido: ");
                numeros[ponteiro] = scanner.nextInt();
                calculo= numeros[ponteiro];
                ponteiro++;
            }
        }
    }
    public void Multiplicacao(){
       calculo = 1;
        while (!Objects.equals(escolha, "nao") & !Objects.equals(escolha, "não")){
            if (ponteiro == 9) {
                System.out.println("Limite de calculos atingidos...");
                escolha = "nao";
            }
            if (ponteiro > 1 & ponteiro < 9){
                System.out.println(calculo+" x");
                numeros[ponteiro] = scanner.nextInt();
                System.out.println("O resultado da sua multiplicação é: "
                        +calculo+" x "+numeros[ponteiro]+" = "+(calculo*= numeros[ponteiro])+"!");
                ponteiro++;
                System.out.println("Deseja continuar esta multiplição?");
                escolha = scanner.next();
            }
            if (ponteiro == 1){
                System.out.println(calculo+" x");
                numeros[ponteiro] = scanner.nextInt();
                calculo*= numeros[ponteiro]; System.out.println("O resultado da sua multiplicação é: "
                        +numeros[ponteiro-1]+" x "+numeros[ponteiro]+" = "+calculo+"!");
                ponteiro++;
                System.out.println("Deseja continuar esta multiplicação?");
                escolha = scanner.next();
            }
            if (ponteiro < 1){
                System.out.println("Digite o numero a ser multiplicado: ");
                numeros[ponteiro] = scanner.nextInt();
                calculo= numeros[ponteiro];
                ponteiro++;
            }
        }

    }
    public void Divisao(){
        calculo = 1;
        while (!Objects.equals(escolha, "nao") & !Objects.equals(escolha, "não")){
            if (ponteiro == 9) {
                System.out.println("Limite de calculos atingidos...");
                escolha = "nao";
            }
            if (ponteiro > 1 & ponteiro < 9){
                System.out.println(calculo+" /");
                numeros[ponteiro] = scanner.nextInt();
                try{
                    System.out.println("O resultado da sua divisão é: "
                            +calculo+" x "+numeros[ponteiro]+" = "+(calculo/= numeros[ponteiro])+"!");

                }catch (ArithmeticException e){
                    System.err.println("Erro: Divisão por zero.");
                }
                ponteiro++;
                System.out.println("Deseja continuar esta divisão?");
                escolha = scanner.next();
            }
            if (ponteiro == 1){
                System.out.println(calculo+" /");
                numeros[ponteiro] = scanner.nextInt();
                calculo/= numeros[ponteiro]; System.out.println("O resultado da sua divisão é: "
                        +numeros[ponteiro-1]+" / "+numeros[ponteiro]+" = "+calculo+"!");
                ponteiro++;
                System.out.println("Deseja continuar esta divisão?");
                escolha = scanner.next();
            }
            if (ponteiro < 1){
                System.out.println("Digite o numero a ser dividido: ");
                numeros[ponteiro] = scanner.nextInt();
                calculo= numeros[ponteiro];
                ponteiro++;
            }
        }
    }

    public void Tabuada(){
        System.out.println("Qual tabuada você deseja?");
        calculo = scanner.nextInt();
        System.out.println("Tabuada do "+calculo);
        for (int i = 1; i < 11; i++) {
            System.out.println(calculo+" x "+i+" = "+calculo*i);
        }
    }

}
