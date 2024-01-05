package academy.devdojo.logica.arrays.unidimensionais;

public class Aula01IntroduçãoArrays {
    public static void main(String[] args) {
        double nota = 7.00;
        double nota2 = 8.0;
        double nota3 = 9.0;
        double nota4 = 10;
        double media = (nota + nota2 + nota3) / 3;
        System.out.println(media);
        double[] notas = new double[4];
        System.out.println("------------------------");
        notas[0] = 7.50;
        notas[1] = 8.0;
        notas[2] = 9.0;
        notas[3] = 10;
        System.out.println("Tamanho do array " + notas.length);
        for (int i = 0; i < notas.length ; i++) {
            System.out.println(notas[i]);
        }
        System.out.println("------------------------");
        System.out.println("      Média final      ");
        System.out.println("------------------------");
        System.out.println((notas[0] + notas[1] + notas[2] + notas[3]) /3 );
    }
}
