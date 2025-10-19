package academy.devdojo.Fmodificadorestatico.domain;

public class Anime {
    private String anime;
    private static int[] episodios;

    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length ; i++){
            episodios[i] = i + 1;
        }
    }

    public Anime(String anime){
        this.anime = anime;
    }

    public Anime(){
        for(int num : Anime.episodios){
            System.out.print(num + " ");
        }
        System.out.println();

    }

    public int[] getEpisodios(){
        return episodios;
    }

    public String getAnime(){
        return this.anime;
    }

}