package academy.devdojo.logica.arrays.multidimensionais;

public class Ex1Contagem {
    public static void main(String[] args) {
//        Contagem de Palavras em uma Lista
//        Crie um programa que percorra, com um for-each,uma lista de strings (palavras)
//        e conte quantas palavras possuem mais de 5 caracteres. Mostre o total ao final.

        String[][] nomes = new String[2][2];

        nomes[0][0] = "Maria";
        nomes[0][1] = "João";
        nomes[1][0] = "Carlos";
        nomes[1][1] = "Rafaella";
        int total = 0;

        for (String[] I : nomes) {
            for (String J : I) {
                if (J.length() > 5){
                    total += 1;
                }
            }
        }
        System.out.println(total);
    }
}
