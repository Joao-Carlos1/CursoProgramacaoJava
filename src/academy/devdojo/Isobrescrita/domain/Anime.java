package academy.devdojo.Isobrescrita.domain;

public class Anime {
    private String anime;

    @Override
    public String toString(){
        return this.anime;
    }

    public Anime(String anime){
        this.anime = anime;
    }

    public String getAnime(){
        return this.anime;
    }

    public void setAnime(String anime){
        this.anime = anime;
    }
}
