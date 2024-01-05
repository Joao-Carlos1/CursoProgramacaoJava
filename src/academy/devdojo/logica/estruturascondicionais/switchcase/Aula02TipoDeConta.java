package academy.devdojo.logica.estruturascondicionais.switchcase;

import java.util.Scanner;

/*
como gerente eu que gostaria que meus usuários pudesses
digitar o tipo da conta e o sistema imprima qual a porcentagem de juros
que aquela conta irá oferecer. Com o intuito de agilizar o acesso as informações
Os tipos das contas são
CONTA_POUPANÇA 0.05%
CONTA_CORRENTE 0.02%
CONTA_INVESTIMENTO 0.1%
 */
public class Aula02TipoDeConta {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o seu tipo de conta?");
        System.out.println("Conta poupança-Conta corrente-Conta investimento");
        String conta = ler.nextLine();
        switch (conta) {
            case "Conta poupança":
                System.out.println("Sua porcentagem de juros será de 0.05");
                break;
            case "Conta corrente":
                System.out.println("Sua porcentagem de juros será de 0.02");
                break;
            case "Conta investimento":
                System.out.println("Sua porcentagem de juros será de 0.01");
                break;
            default:
                System.out.println("Conta inexistente");
        }

    }
}
