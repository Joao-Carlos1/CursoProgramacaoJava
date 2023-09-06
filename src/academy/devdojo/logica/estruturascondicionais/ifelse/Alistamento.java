package academy.devdojo.logica.estruturascondicionais.ifelse;

import java.util.Scanner;

public class Alistamento {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Diga sua gênero");
        String gênero = ler.next();
        System.out.println("Qual o seu idade");
        int idade = ler.nextInt();
        if (gênero.equalsIgnoreCase("masculino") && idade >= 18) {
            System.out.println("Alistamento obrigatório");
        } else if (gênero.equalsIgnoreCase("masculino") || gênero.equalsIgnoreCase("feminino") && idade <= 18) {
            System.out.println("Alistamento não permitido");
        } else if (gênero.equalsIgnoreCase("feminino") && idade >= 18) {
            System.out.println("Deseja se alistar?");
        }
    }
}
