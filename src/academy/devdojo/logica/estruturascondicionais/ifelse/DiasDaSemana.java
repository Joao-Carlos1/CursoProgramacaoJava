package academy.devdojo.logica.estruturascondicionais.ifelse;

import java.util.Scanner;

//Receba um número inteiro do usuário e imprima o dia da semana correspodente
//Sendo 1 segunda-feira e assim por diante
public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        System.out.println("Diga um número correspodente a um dia da semana ");
        int dia = ler.nextInt();
        if (dia == 1) {
            System.out.println("Segunda-feira");
        } else if (dia == 2) {
            System.out.println("Terça-feira");
        } else if (dia == 3) {
            System.out.println("Quarta-feira");
        } else if (dia == 4) {
            System.out.println("Quinta-feira");
        } else if (dia == 5) {
            System.out.println("Sexta-feira");
        } else if (dia == 6) {
            System.out.println("Sábado");
        } else if (dia == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Não é um dia da semana");

        }
    }
}
