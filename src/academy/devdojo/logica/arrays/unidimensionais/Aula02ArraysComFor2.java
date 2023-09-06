package academy.devdojo.logica.arrays.unidimensionais;

import java.util.Scanner;

public class Aula02ArraysComFor2 {
    public static void main(String[] args) {
        double media = 0;
        double[] notas = new double[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i < notas.length ; i++) {
            System.out.println("Digite a nota " + (i+1));
            notas[i] = sc.nextDouble();
            media = media + notas[i];
        }
        media = media / notas.length;
        System.out.println("A media total do aluno é " + media);
}

}
