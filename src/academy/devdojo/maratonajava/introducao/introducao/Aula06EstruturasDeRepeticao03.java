package academy.devdojo.maratonajava.introducao.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // Imprima os primeiros números de um dado valor. Por exemplo, 50.
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
            //breaks ficam apenas dentro de switch ou loops

        }
    }
}
