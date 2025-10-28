package academy.devdojo.JmodificadorFinal.Domain;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIM = 250;
    public final Comprador COMPRADOR = new Comprador();

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(String nome){
        return this.nome;
    }
}
