package academy.devdojo.logica.estruturascondicionais.ifelse;

import java.util.Scanner;

public class TorneioDeNatação {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        String nome = ler.next();
        System.out.println("Digite sua idade");
        int idade = ler.nextInt();
        if (idade <= 10) {
            System.out.println(nome + " participará da categoria Infantil");
        }else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " participará da categoria Juvenil");
        }else if (idade >= 16 && idade <= 18) {
            System.out.println(nome + " participará da categoria Adolescente");
        }else
            System.out.println(nome + " participará da categoria Adulta");
        }
    }
