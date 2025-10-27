package academy.devdojo.seminario.domain;

public class Professor {
    String nome;
    String especialidade;
    Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this(nome, especialidade);
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("especialidade: " + this.especialidade);
        if(seminarios == null){
            return;
        }
        for(Seminario seminarios : seminarios){
            System.out.println("Seminário: " + seminarios.getTitulo());
            for(Aluno aluno : seminarios.getAlunos()){
                System.out.print("Aluno: " + aluno.getNome());
        }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
