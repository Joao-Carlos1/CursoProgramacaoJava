package academy.devdojo.seminario.domain;

public class Aluno {
    String nome;
    int idade;
    Seminario seminario;

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime(){
        System.out.println("Nome: " +this.nome);
        System.out.println("Idade: " +this.idade);
        if(seminario != null){
            System.out.println("Seminário: " +seminario.getTitulo());
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}
