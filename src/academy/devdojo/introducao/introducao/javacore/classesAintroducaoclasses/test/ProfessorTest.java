package academy.devdojo.introducao.introducao.javacore.classesAintroducaoclasses.test;

import academy.devdojo.introducao.introducao.javacore.classesAintroducaoclasses.domain.Professor;

public class ProfessorTest {
    public static void main(String [] args){

        Professor professor = new Professor();

        professor.age = 20;
        professor.name = "Guilherme";
        professor.gender = 'M';
        System.out.println("Nome: " + professor.name + "\n" + "Idade: " + professor.age + "\n" + "Gênero: " + professor.gender);
    }
}
