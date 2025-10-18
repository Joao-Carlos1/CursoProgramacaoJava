package academy.devdojo.exercicios.exercise53;

public class Funcionario {
    private String nome;
    private int idade;
    public double[] salarios;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }


    public void dados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }
    }


    public double mediaSalario() {
        double total = 0;
        if (salarios == null){
            return 0;
        }
            for (double salario : this.salarios) {
                total += salario;
            }
        return total / salarios.length;
    }
}
