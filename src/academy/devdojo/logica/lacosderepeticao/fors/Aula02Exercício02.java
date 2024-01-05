package academy.devdojo.logica.lacosderepeticao.fors;

import java.util.Scanner;

public class Aula02Exercício02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga um número");
        int i = sc.nextInt();
        for (; i <= 10; i++) {
            System.out.println("Tabuada de 1 a 10 do número "+i);
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));;

            }
            while (i == i);
        }
    }
}