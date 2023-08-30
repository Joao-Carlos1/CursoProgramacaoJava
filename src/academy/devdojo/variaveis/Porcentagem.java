package academy.devdojo.variaveis;

import java.util.Scanner;

public class Porcentagem {
    public static void main(String[] args){
        int Idade;
        int Valor;
        Scanner ler = new Scanner(System.in);
        System.out.println("Diga sua idade");
        Idade = ler.nextInt();
        System.out.println("Diga a idade a ser somada");
        Valor = ler.nextInt();
        System.out.println("O total é" + (Idade+Valor) );
    }
}