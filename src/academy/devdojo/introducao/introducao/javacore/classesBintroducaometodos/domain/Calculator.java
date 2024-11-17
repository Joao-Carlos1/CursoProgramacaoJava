package academy.devdojo.introducao.introducao.javacore.classesBintroducaometodos.domain;

import java.util.Scanner;

public class Calculator {
    Scanner sc = new Scanner(System.in);

    public void somaDosNumeros() {
        System.out.println(10 + 10);
    }

    public void subtracaoDosNumeros() {
        System.out.println(10 - 9);
    }

    public void multiplicacaoDosNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public void divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não é possível dividir por zero");
            return;
        }
        System.out.println(num1 / num2);
    }

    public double divideDoisNumeros02(double num1, double num2) {
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public void alteraDoisNumeros(double num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);

    }
}







