package academy.devdojo.logica.arrays.multidimensionais;

import java.util.Scanner;

public class Aula02InicializandoArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] arrayMulti = new int[2][3];
//        arrayMulti[0][1] = 22;
//        arrayMulti[0][2] = 77;
//        arrayMulti[1][0] = 33;
//        arrayMulti[1][1] = 44;
//        arrayMulti[1][2] = 55;*/
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                System.out.println("Digite um valor para ser armazenado em " + "[" + i + "]" + "[" + j + "]");
                System.out.println("[" + i + "]" + "[" + j + "]" + " = " + arrayMulti[i][j]);
                arrayMulti[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                System.out.println("[" + i + "]" + "[" + j + "]" + " = " + arrayMulti[i][j]);

            }
        }
    }
}
