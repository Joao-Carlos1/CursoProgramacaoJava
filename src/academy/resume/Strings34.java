package academy.resume;

import java.util.Scanner;

public class Strings34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[10];
        names[0] = " 1 João";
        names[1] = " 2 João";
        names[2] = " 3 João";
        names[3] = " 4 João";
        names[4] = " 5 João";
        names[5] = " 6 João";
        names[6] = " 7 João";
        names[7] = " 8 João";
        names[8] = " 9 João";
        names[9] = " 10 João";

        for (int i = 0; i < names.length; i++) {
            System.out.println("Nome =" + names[i]);
        }
    }
}