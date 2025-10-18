package academy.devdojo.poo.javacore.test;

import academy.devdojo.poo.javacore.dominio.Estudante;

public class PessoaTest {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.idade = 12;
        estudante.nome = "João";
        estudante.sexo = 'M';

        System.out.println(estudante.nome + " " + estudante.idade + " " + estudante.sexo);
    }
}
