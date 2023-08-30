package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class PorcentagemSalarial {
    public static void main(String[] args) {
        int salario = 4500;
        int salario2;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digíte seu sálario");
        salario2 = ler.nextInt();
        if (salario2>salario) {
            System.out.println("30% do seu sálario é igual a "+salario2*0.3);
        }
        else {
            System.out.println("15% do seu sálario é igual a " + salario2 * 0.15);
        }

    }
}
