package academy.devdojo.logica.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula02NúmerosImpares {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Qual será o valor a ser atingido?");
        int numero = read.nextInt();
        int i = 0;
        while (i <= numero) {
            if (i % 2 != 0) {
                System.out.println("i " + i);
            }
            i = i + 1;

        }
    }
}