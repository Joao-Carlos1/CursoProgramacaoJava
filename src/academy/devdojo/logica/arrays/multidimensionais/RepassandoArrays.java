package academy.devdojo.logica.arrays.multidimensionais;

public class RepassandoArrays {
    public static void main(String[] args) {

//        int[][] idade = new int[2][2];
//        idade[0][0] = 2;
//        idade[0][1] = 2;
//        idade[1][0] = 2;
//        idade[1][1] = 2;
        String[][] idade2 = new String[3][3];
        idade2[0][0] = "ablu1";
        idade2[0][1] = "ablu2";
        idade2[0][2] = "ablu3";
        idade2[1][0] = "ablu4";
        idade2[1][1] = "ablu5";
        idade2[1][2] = "ablu6";
        idade2[2][0] = "ablu7";
        idade2[2][1] = "ablu8";
        idade2[2][2] = "ablu9";

        int[][] numeros = {{1, 2, 3},{1, 2, 3}};
        int[][] numeros2 = new int[][]{{1, 2, 3},{1, 2, 3}};

//        for (int i = 0; i < idade2.length; i++) {
//            for (int j = 0; j < idade2[i].length; j++) {
//                System.out.println(idade2[i].length);
//                System.out.println(idade2[i][j]);
//            }
//        }
//        System.out.println("---------------------------");
//        for (String[] i : idade2) {
//            for (String B : i) {
//                System.out.println(B);
//                System.out.println("Tamanho da linha " + i.length);
//            }
        for (String [] i : idade2){
            for (String B : i ){
                System.out.println(B);
            }
        }
    }
}
