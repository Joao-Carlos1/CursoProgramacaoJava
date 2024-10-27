package academy.resume;

import java.util.Scanner;

public class fori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary;

        System.out.println("Diga seu salário");
        salary = sc.nextDouble();

        if (salary <= 34712) {
            salary *= 0.097;
        } else if (salary > 34712 && salary <= 68507) {
            salary *= 0.3735;
        } else {
            salary *= 0.4950;
        }
        System.out.printf("Seu imposto por cima de seu salário será: %.3f ", salary);
    }
}
