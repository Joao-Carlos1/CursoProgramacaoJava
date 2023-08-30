package academy.devdojo.arrays.unidimensionais;

import java.util.Scanner;

public class Aula03Exercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v1 = new int[9];
        int[] v2 = new int[9];
        int[] vr = new int[9];
        String resultadoArray = "";
        for (int i = 0; i < v1.length; i++) {
            System.out.println("Vetor 1:");
            v1[i] = sc.nextInt();
            System.out.println("Vetor 2:");
            v2[i] = sc.nextInt();
            vr[i] = v1[i] * v2[i];
            resultadoArray = resultadoArray + v1[i] + "*" + v2[i] +" = "+ vr[i]+ " | ";
        }
        System.out.println(resultadoArray);
    }
}

