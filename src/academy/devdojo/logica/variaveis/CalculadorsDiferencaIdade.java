package academy.devdojo.logica.variaveis;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculadorsDiferencaIdade {
    public static void main(String[] args) {
        float salario;
    Scanner ler  = new Scanner(System.in);
    System.out.println("Dígite seu sálario");
        salario = ler.nextFloat();
        System.out.println("Dígite a porcentagem");
        float porcentagem = ler.nextFloat();
        DecimalFormat formatador = new DecimalFormat("0.00");
        System.out.println("A porcentagem atual do seu sálario é " + formatador.format( salario/porcentagem));


    }
}