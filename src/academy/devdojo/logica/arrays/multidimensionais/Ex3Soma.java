package academy.devdojo.logica.arrays.multidimensionais;

public class Ex3Soma {
    public static void main(String[] args) {
//        Soma dos Elementos de um Array
//        Escreva um programa que utiliza um laço for-each para percorrer um array de números inteiros
//        e calcular a soma de todos os elementos. Exiba o resultado no final.

        int[][] num = new int[2][2];

        num[0][0] = 1;
        num[0][1] = 1;
        num[1][0] = 1;
        num[1][1] = 1;
        int soma = 0;

//        for (int i = 0; i < num.length; i++) {
//            for (int b = 0; b < num[i].length; b++) {
//                soma += num[i][b];
//            }
//        }
//        System.out.println(soma);
        for (int[] i : num) {
            for (int B : i) {
                soma += B;
            }
        }
        System.out.println(soma);

        System.out.println("-------------------------------");

        int[][][] test = new int[1][4][5];


        test[0][0][0] = 1;
        test[0][0][1] = 2;
        test[0][0][2] = 3;
        test[0][0][3] = 4;
        test[0][0][4] = 5;
        test[0][1][0] = 6;
        test[0][1][1] = 7;
        test[0][1][2] = 8;
        test[0][1][3] = 9;
        test[0][1][4] = 10;
        test[0][2][0] = 11;
        test[0][2][1] = 12;
        test[0][2][2] = 13;
        test[0][2][3] = 14;
        test[0][2][4] = 15;
        test[0][3][0] = 16;
        test[0][3][1] = 17;
        test[0][3][2] = 18;
        test[0][3][3] = 19;
        test[0][3][4] = 20;

        for (int[][] i : test) {
            for (int[] j : i) {
                for (int k : j) {
                    System.out.println(k);

                }
            }
        }


    }
}
