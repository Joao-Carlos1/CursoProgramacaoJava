package academy.devdojo.arrays.unidimensionais;

import java.util.Scanner;

public class Aula03Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v1 = {1,2,3,4,5,6,7,8,9};
        int[] v2 = {1,2,3,4,5,6,7,8,9};
        int[] vr = new int[9];
        for (int i = 0; i < v1.length; i++) {
            vr[i] = v1[i] * v2[i];
            System.out.println(v1[i] + " * " + v2[i] + " = " + vr[i]);
        }
    }
}

