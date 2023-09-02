package academy.devdojo.arrays.multidimensionais;

public class Aula03ExercicoMatrizQuadrada {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        matriz[0][0] = 2;
        matriz[0][1] = 4;
        matriz[0][2] = 6;
        matriz[0][3] = 8;
        matriz[1][0] = 10;
        matriz[1][1] = 12;
        matriz[1][2] = 14;
        matriz[1][3] = 16;
        matriz[2][0] = 18;
        matriz[2][1] = 20;
        matriz[2][2] = 22;
        matriz[2][3] = 24;
        matriz[3][0] = 26;
        matriz[3][1] = 28;
        matriz[3][2] = 30;
        matriz[3][3] = 32;

        int resultado = 1;

        for (int i = 0; i < matriz.length; i++) {
            resultado *= matriz[i][i];
        }

        System.out.println("O resultado da multiplicação dda diagonal é: " + resultado);
    }
}
