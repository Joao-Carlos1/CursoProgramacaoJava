package academy.devdojo.maratonajava.introducao.introducao;

import java.util.Scanner;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga a idade da pessoa 1");
        int age1 = sc.nextInt();
        System.out.println("Diga a idade da pesssoa 2");
        int age2 = sc.nextInt();
        System.out.println("O resultado final das duas idades é igual a " + (age2 + age2));
        //int, double, float, char, byte, short, long, boolean

        int idade = 10;
        double salario = 2000.1;
        long numeroGrande = 100000000;
        float numeroMeddio = 2500.1F;
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char A = 'B';
    }

}
