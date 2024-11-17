package academy.devdojo.introducao.introducao.javacore.classesAintroducaoclasses.test;
import academy.devdojo.introducao.introducao.javacore.classesAintroducaoclasses.domain.Estudante;


public class EstudanteTest {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();

            System.out.println("Diga seu nome");
            System.out.println("Nome: " + estudante.name + "\nIdade: " + estudante.age + "\nSexo: " + estudante.sexo);

    }
}

