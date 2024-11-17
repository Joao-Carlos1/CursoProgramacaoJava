package academy.devdojo.introducao.introducao.javacore.classesBintroducaometodos.domain;


public class ImpressoraEstudante {
    public void imprime(Estudante estudante) {
        System.out.println("Nome: " + estudante.name + "\nIdade: " + estudante.age + "\nSexo: " + estudante.sexo);
    }
}
