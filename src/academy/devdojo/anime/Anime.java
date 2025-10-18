package academy.devdojo.anime;

public class Anime {
    private String nome;
    private int episodios;
    private String tipo;
    private String genero;

    public Anime(String nome, int episodios, String tipo) {
        this.nome = nome;
        this.episodios = episodios;
        this.tipo = tipo;
    }

    public Anime(String nome, int episodios, String tipo, String genero) {
        this.nome = nome;
        this.episodios = episodios;
        this.tipo = tipo;
        this.genero = genero;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setEpisodios(String episodios) {
        this.nome = episodios;
    }
    public int getEpisodios() {
        return this.episodios;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return this.tipo;
    }

    public void setGenero() {
        this.genero = genero;
    }
    public String getGenero() {
        return this.genero;
    }
}
