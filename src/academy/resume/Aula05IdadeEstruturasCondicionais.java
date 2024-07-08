package academy.resume;

import java.util.Scanner;

public class Aula05IdadeEstruturasCondicionais {
    public static void main(String[] args) {
        //Idade < 15 = Categoria infantil
        //Idade >= 15 && Idade <18 = categoria adolescente
        //Idade >= 18 = categoria adulto
        Scanner sc = new Scanner(System.in);
        int age;
        String Categoria;
        System.out.println("Diga sua idade");
        age = sc.nextInt();
        if (age < 15) {
            Categoria = "Categoria infantil";
        } else if (age >= 15 && age < 18) {
            Categoria = "Categoria Adolescente";
        } else {
            Categoria = "Categoria Adulto";
        }
        System.out.println(Categoria);
    }
}
