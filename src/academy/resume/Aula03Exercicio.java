package academy.resume;

import java.util.Scanner;

public class Aula03Exercicio {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         String[] name = new String[4];

         name[0] = "João0";
         name[1] = "João1";
         name[2] = "João2";
         name[3] = "João3";

         for(int i = 0; i < name.length; i++){
             System.out.println(name[i]);
         }
    }

}
