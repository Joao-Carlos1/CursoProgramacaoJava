package academy.devdojo.introducao.introducao.javacore.classesAintroducaoclasses.test;

import java.util.Scanner;

import academy.devdojo.introducao.introducao.javacore.classesAintroducaoclasses.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Diga seu nome");
        pessoa.nome = input.nextLine();
        System.out.println("Diga sua idade");
        pessoa.idade = input.nextInt();
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
    }
}
