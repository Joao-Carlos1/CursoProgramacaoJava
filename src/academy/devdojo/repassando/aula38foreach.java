package academy.devdojo.repassando;

public class aula38foreach {
    public static void main(String[] args){

        int[][] mesDia = new int[2][3];

        mesDia[0][0] = 30;
        mesDia[0][1] = 31;
        mesDia[0][2] = 32;

        mesDia[1][0] = 33;
        mesDia[1][1] = 34;
        mesDia[1][2] = 35;

        for (int [] i : mesDia){
            for (int j : i){
                System.out.println(j);
            }
        }
    }
}
