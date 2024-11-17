package academy.devdojo.introducao.introducao.javacore.classesBintroducaometodos.test;

import academy.devdojo.introducao.introducao.javacore.classesBintroducaometodos.domain.Estudante;
import academy.devdojo.introducao.introducao.javacore.classesBintroducaometodos.domain.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        estudante01.name = "José";
        estudante01.age = 12;
        estudante01.sexo = 'M';

        estudante02.name = "Maria";
        estudante02.age = 13;
        estudante02.sexo = 'F';
        System.out.println("----------------------------");
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

    }
}
