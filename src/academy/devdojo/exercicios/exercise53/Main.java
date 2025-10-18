package academy.devdojo.exercicios.exercise53;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Joao");
        System.out.println(funcionario.getNome());

        funcionario.salarios = new double[]{123.5, 123.4, 182, 1};
        double media = funcionario.mediaSalario();

        funcionario.dados();
        System.out.printf("\nA média salarial é: %.2f\n", media);
    }
}
