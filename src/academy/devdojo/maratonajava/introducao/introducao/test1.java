package academy.devdojo.maratonajava.introducao.introducao;

public class test1 {
    public static void main(String[] args) {


        int[][] casa = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
        int[][] casa2 = new int[2][2];

        casa2[0] = new int[]{1, 2};
        casa2[1] = new int[]{1, 2};

        for (int[] arrays : casa2) {
            for (int num : arrays) {
                System.out.println(num);
            }
        }
        for (int i = 0; i < casa2.length; i++) {
            System.out.println("\n------");
            for (int j = 0; j < casa2[i].length; j++) {
                System.out.println(casa2[i][j]);
            }
        }
    }
}
