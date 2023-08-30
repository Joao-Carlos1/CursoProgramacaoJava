package academy.devdojo.estruturascondicionais.ifelse;

import javax.swing.*;
import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salario;
        System.out.println("Digite seu salário");
        salario = ler.nextDouble();
        if (salario <= 1903.98) {
            System.out.println("Isento");
        } else if (salario >= 1903.99 && salario <= 2826.65)
            System.out.println("Você vai pagar 7.5% que é " + (salario * 0.075));
          else if (salario >= 2826.66 && salario <= 3751.05)
            System.out.println("Você vai pagar 15% que é " + (salario * 0.15));
          else if (salario >=3751.06 && salario <= 4664.68)
            System.out.println("Você vai pagar 22.5 que é " + (salario * 0.225));
          else {
            System.out.println("Você vai pagar 27.5% que é " + (salario * 0.275));
        }
    }
}