package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

// idade <15 categoria infantil
// idade >= 15 && idade < 18 categoria juvenil
// idade >=18 categoria adulto
public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Diga sua idade");

        int idade = sc.nextInt();
        String categoria;

        if (idade < 15) {
            categoria = "Categoria infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria juvenil";
        } else {
            categoria = "Categoria adulta";
        }
        System.out.println(categoria);
    }
}
