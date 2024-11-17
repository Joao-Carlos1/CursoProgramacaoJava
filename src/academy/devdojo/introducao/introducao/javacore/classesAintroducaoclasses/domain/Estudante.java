package academy.devdojo.introducao.introducao.javacore.classesAintroducaoclasses.domain;
import java.util.Scanner;

public class Estudante {
    Scanner sc = new Scanner(System.in);
    public String name = sc.nextLine();
    public int age = sc.nextInt();
    public char sexo = sc.next().charAt(0);
}
