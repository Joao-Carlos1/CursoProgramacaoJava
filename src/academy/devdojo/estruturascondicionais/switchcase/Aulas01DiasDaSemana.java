package academy.devdojo.estruturascondicionais.switchcase;

import java.util.Scanner;
//break não pode ser usado em if-else
public class Aulas01DiasDaSemana {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Diga um número equivalente a um dia da semana, sendo segunda o número 1");
        int dia = ler.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Não corresponde a nenhum dia da semana");
                break;
        }
        System.out.println("Fim do programa");
    }
}

