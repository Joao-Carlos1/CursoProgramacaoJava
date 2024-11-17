package academy.devdojo.maratonajava.introducao.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        // byte, short, int e double 0
        // char '\u0000' ' '
        // boolean false
        // String null

        String[] nomes = new String[3];

        nomes[0] = "Goku";
        nomes[1] = "Luffy";
        nomes[2] = "Yugi";

        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);

        nomes[0] = "Goku";
        nomes[1] = "Luffy";
        nomes[2] = "Yugi";
        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i]);

        }
    }
}
