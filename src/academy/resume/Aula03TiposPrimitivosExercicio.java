package academy.resume;

import java.util.Locale;
import java.util.Scanner;

public class Aula03TiposPrimitivosExercicio {
    /*
      Prática
      Crie váriaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
      Eu <nome>, morando no endereço <endereço>
      confirmo que recebi o sálario de <sálario>, na data <data>

    */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String address, name, date;
        double salary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga seu nome");
        name = sc.nextLine();
        System.out.println("Diga seu endereço");
        address = sc.nextLine();
        System.out.println("Diga o valor do seu sálario");
        salary = sc.nextDouble();
        System.out.println("Diga a data de hoje");
        date = sc.next();
        System.out.println("Eu " + name + ", morando no endereço " + address + ", confirmo que recebi o sálario de " + salary + ", na data: " + date);


    }
}
