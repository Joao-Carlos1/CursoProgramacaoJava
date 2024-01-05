package academy.devdojo.logica.estruturascondicionais.ifelse;

import java.util.Scanner;

public class Alistamento2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual seu sexo? -M -F");
        char sexo = ler.next().charAt(0);
        System.out.println("Qual a sua idade?");
        int idade = ler.nextInt();
        if ((sexo == 'M' || sexo == 'F') && idade < 18) {
            System.out.println("Não pode se alistar");
        } else if (sexo == 'M' && idade >= 18) {
            System.out.println("academy.devdojo.logica.estruturascondicionais.ifelse.Alistamento obrigatório");
        } else if (sexo == 'F' && idade >= 18) {
            System.out.println("Deseja se alistar?");
        }
    }
}
