package academy.devdojo.logica.estruturascondicionais.ifelse;

import java.util.Scanner;

/*
Receba uma idade como entrada
Se a idade for maior que 18 imprima "adulto"
senão imprima " não é adulto"
*/
public class VerificaIdade {
    public static void main(String[] args) {
        int idade;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade");
        ;
        idade = ler.nextInt();
        if (idade >= 18)
            System.out.println("Maior de idade");
        else
            System.out.println("Menor de idade");

    }
}
