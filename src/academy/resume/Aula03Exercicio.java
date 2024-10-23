package academy.resume;

import java.util.Scanner;

public class Aula03Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary;
        String name, adress, date;

        System.out.println("Diga seu nome");
        name = sc.nextLine();
        System.out.println("Diga seu endereço");
        adress = sc.nextLine();
        System.out.println("Diga a data de hoje");
        date = sc.nextLine();
        System.out.println("Diga seu Sálario");
        salary = sc.nextDouble();
        System.out.println("Eu " + name + ", morando no endereço " + adress + ", confirmo que recebi o sálario de " + salary + ", na data " + date);
    }

}
