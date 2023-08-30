package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class NumerosÍmparesEPares {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String pi;
        System.out.println("Digite um número");
        int ip = ler.nextInt();
        if (ip % 2 == 0)
            pi = "par";
        else
            pi = "ìmpar";
        System.out.println("O seu número é "+pi);
    }
}
