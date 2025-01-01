package academy.devdojo.maratonajava.introducao.javacore.classesAintroducaoclasses.test;
import java.util.Scanner;
import academy.devdojo.maratonajava.introducao.javacore.classesAintroducaoclasses.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println("Diga o nome do carro:");
        car1.name = sc.nextLine();
        System.out.println("Diga o modelo do carro:");
        car1.model = sc.nextLine();
        System.out.println("Diga o ano do carro:");
        car1.year = sc.nextInt();
        sc.nextLine();

        System.out.println("Diga o nome do segundo carro:");
        car2.name = sc.nextLine();
        System.out.println("Diga o modelo do segundo carro:");
        car2.model = sc.nextLine();
        System.out.println("Diga o ano do segundo carro:");
        car2.year = sc.nextInt();
        sc.nextLine();

        System.out.println("Nome do carro: " + car1.name + " | Modelo do carro: " + car1.model + " | Ano do carro: " + car1.year);
        System.out.println("Nome do segundo carro: " + car2.name + " | Modelo do segundo carro: " + car2.model + " | Ano do segundo carro: " + car2.year);


    }
}
