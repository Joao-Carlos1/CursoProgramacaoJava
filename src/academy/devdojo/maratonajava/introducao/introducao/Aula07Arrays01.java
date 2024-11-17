package academy.devdojo.maratonajava.introducao.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args){
        //Arrays é sempre um tipo refference
        //Somente tipos de refference podem iniciar como tipo nulo, não primitivos.
        //O índice sempre começa do zero.
        int [] idades = new int[3];
        idades[0] = 21;
        idades[1] = 30;
        idades[2] = 19;

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

    }
}
