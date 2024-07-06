package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais {
    //1, 2, 3, 4, 5 meses
    //31, 28, 31, 30
    public static void main(String[] args) {
        int[][] days = new int[3][];

        days[0] = new int[1];
        days[1] = new int[3];
        days[2] = new int[6];

        days[0][0]= 21;
        days[1][2]= 21;

        for (int[] days1 : days){
            for( int day2 : days1){
                System.out.println(day2);
            }

        }


    }

}




