package academy.resume;

import java.util.Scanner;

public class EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salary, salaryAfterTaxes;
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga o seu sálario");
        salary = sc.nextDouble();

        if (salary >= 34.712) {
            salaryAfterTaxes = salary * 0.0970;
        } else if (salary > 34.713 && salary <= 68.507) {
            salaryAfterTaxes = salary * 0.3735;
        } else {
            salaryAfterTaxes = salary * 0.4950;
        }
        System.out.println("Você vai pagar " + salaryAfterTaxes + " em taxas");
    }
}
