package academy.resume;

import java.util.Scanner;

public class Ablublu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;

//        System.out.println("Diga seu nome");
//        name = sc.nextLine();
//
//        if (name.equals("João") || name.equals("Amanda") || name.equals("Carlos")) {
//            System.out.println("Acesso liberado, " + name);
//
//        } else {
//            System.out.println("Acesso negado");
//
//        }
        System.out.println("----------------------------------");
        int[][] test = new int[3][];

        test[0] = new int[]{1,2,3};
        test[1] = new int[]{1,2,3,4,5,6};
        test[2] = new int[]{1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < test.length; i++) {
            System.out.println("\n-----");
            for (int j = 0; j < test[i].length; j++) {
                System.out.print(test[i][j] + " ");
            }
        }
        for (int[] i : test) {
            System.out.println("\n------");
            for (int j : i) {
                System.out.print(+j);
            }
        }

    }
}

