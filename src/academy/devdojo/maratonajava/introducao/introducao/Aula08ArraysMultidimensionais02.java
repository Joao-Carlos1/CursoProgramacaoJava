package academy.devdojo.maratonajava.introducao.introducao;

public class Aula08ArraysMultidimensionais02 {

    public static void main(String[] args) {

        int[][] numbers = new int[3][3];

        numbers[0] = new int[3];
        numbers[1] = new int[]{1, 2, 4};
        numbers[2] = new int[5];

        int[][] numbers2 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int[][] numbers3 = {{2, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int[][] soma = new int[3][3];


        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2[i].length; j++) {
                soma[i][j] = numbers2[i][j] + numbers3[i][j];
            }
        }
        for (int[] arraysB : soma) {
            System.out.println("\n-------");
            for (int num : arraysB) {
                System.out.println(num);
            }
        }
    }
}
