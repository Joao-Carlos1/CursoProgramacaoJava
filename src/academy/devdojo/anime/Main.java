package academy.devdojo.anime;

public class Main {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon ball", 45, "Ação", "Shonen");

        System.out.println(anime.getNome());
        System.out.println(anime.getEpisodios());
        System.out.println(anime.getGenero());
        System.out.println(anime.getTipo());
    }
}
