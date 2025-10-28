package academy.devdojo.JmodificadorFinal.Domain;

public class Comprador {
    private String nome;

    public String toString(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}