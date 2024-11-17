package academy.resume;
import java.util.Scanner;
public class Ablublu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;

        System.out.println("Diga seu nome");
        name = sc.nextLine();

        if(name.equals("João") || name.equals("Amanda") || name.equals("Carlos") ){
            System.out.println("Acesso liberado, " + name);
            
        }else {
            System.out.println("Acesso negado");

        }

    }

}
