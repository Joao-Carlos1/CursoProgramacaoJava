package academy.devdojo.logica.estruturascondicionais.ifelse;

import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual sua idade ?");
        int idade = leitor.nextInt();
        System.out.println("Qual seu sexo (M;F) ?");
        char sexo = leitor.next().charAt(0);

        if((sexo == 'M' || sexo == 'F') && idade<18) {
            System.out.println("Alistamento não permitido!");

        } else if(sexo == 'M' && idade>=18) {
            System.out.println("Alistamento obrigatório");
        } else if(sexo == 'F' && idade>=18) {
            System.out.println("Deseja se alistar? (SIM;NÃO)");
            String resposta = leitor.next();
            if(resposta.equalsIgnoreCase("Sim")){
                System.out.println("Alistamento concluído com sucesso.");
            }else if(resposta.equalsIgnoreCase("Não")){
                System.out.println("Processo finalizado, alistamento não realizado.");
            }
        }
    }
}