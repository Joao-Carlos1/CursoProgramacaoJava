package academy.devdojo.seminario.domain;

public class Seminario {
    String titulo;
    Aluno[] alunos;
    Local local;


    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Seminario(String titulo, Aluno[] alunos){
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public void imprime(){
        System.out.println(this.titulo);
        if(alunos == null){
            return;
        }
        for(Aluno alunos : alunos){
            System.out.println("Nome: " + alunos.getNome());
            System.out.println("Idade: " + alunos.getIdade());
        }
        System.out.println(local.getLocal());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
