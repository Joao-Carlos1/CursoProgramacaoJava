package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class NomeDoUsuarioNull {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome2 = ler.next();
        if (nome2.equals("") || nome2.equalsIgnoreCase("admin") || nome2 .equalsIgnoreCase("administrador")) {
            System.out.println(nome2+ " não está disponivel");
        }else
            System.out.println(nome2+ " foi cadastrado");

    }
}
