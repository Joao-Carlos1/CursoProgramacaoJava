package academy.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula05DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String response;
        do {
            System.out.println("Usuario 1: Diga um numero");
            int u1 = sc.nextInt();
            System.out.println("Usuario 2: Diga um número");
            int u2 = sc.nextInt();
            if (u1 == u2) {
                System.out.println("Números iguais!");
            } else if (u1 != u2) {
                System.out.println("Números diferentes!");
            }
            System.out.println("-----------------------------------");
            System.out.println("Deseja continuar?");
            System.out.println("Sim / Não");
            response = sc.next();
        } while (response.equalsIgnoreCase("Sim"));
        System.out.println("Programa encerrado");
    }
}