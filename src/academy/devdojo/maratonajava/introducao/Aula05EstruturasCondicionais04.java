package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        //€ 0	      € 34,712	  9.70%
        //€ 34,713    € 68,507    37.35 %
        //€ 68,508     ------     49.50 %
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        double impostoTotal = 0;

        if (salario <= 34712) {
            impostoTotal = salario * 0.0970;
        } else if (salario >= 34713 && salario <= 68507) {
            impostoTotal = salario * 0.3735;
        } else {
            impostoTotal = salario * 0.4950;
        }
        System.out.println(impostoTotal);

    }
}

