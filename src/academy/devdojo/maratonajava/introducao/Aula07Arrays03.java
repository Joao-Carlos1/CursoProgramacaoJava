package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] number2 = {1, 2, 3, 4, 5};
        int[] number3 = new int[]{1, 2, 3, 4, 5};
        for (int j : number3) {
            System.out.println(j);

        }
        System.out.println("----------------------------------------------------------");
        for (int num : number2) {
            System.out.println(num);
        }

    }

}

