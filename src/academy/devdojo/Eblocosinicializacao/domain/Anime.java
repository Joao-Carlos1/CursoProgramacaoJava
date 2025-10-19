package academy.devdojo.Eblocosinicializacao.domain;

public class Anime {
    private String anime;
    private int[] episodios;

    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length ; i++){
            episodios[i] = i + 1;
        }
    }

    public  Anime(String anime){
        this.anime = anime;
    }

    public Anime(){
        for(int num : this.episodios){
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