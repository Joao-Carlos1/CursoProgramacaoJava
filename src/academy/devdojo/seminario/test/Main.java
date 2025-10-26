package academy.devdojo.seminario.test;

import academy.devdojo.seminario.domain.Aluno;
import academy.devdojo.seminario.domain.Local;
import academy.devdojo.seminario.domain.Professor;
import academy.devdojo.seminario.domain.Seminario;

public class Main {
    public static void main(String[] args) {

        Professor professor1 = new Professor("Joao", "Linguas");

        Aluno aluno1 = new Aluno("Joao", 12);
        Aluno aluno2 = new Aluno("Pedro", 14);
        Aluno[] alunos = {aluno1, aluno2};

        Seminario seminario1 = new Seminario("A natureza");
        Seminario[] seminarios = {seminario1};

        Local local = new Local("Rua Deraldino");
        aluno1.setSeminario(seminario1);
        aluno2.setSeminario(seminario1);
        seminario1.setLocal(local);
        seminario1.setAlunos(alunos);
        professor1.setSeminarios(seminarios);



        System.out.println("------------------------------");
        seminario1.imprime();
        System.out.println("------------------------------");
        System.out.println("Professor");
        professor1.imprime();
        System.out.println("------------------------------");
        aluno1.imprime();
        System.out.println("------------------------------");
        aluno2.imprime();

    }
}
