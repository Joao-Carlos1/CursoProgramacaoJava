package academy.devdojo.maratonajava.introducao.introducao;

public class Aula05EstruturasCondicionais01 {

    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebiba = idade >= 18;
        if (isAutorizadoComprarBebiba) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("Não Autorizado a comprar bebida alcólica");
        } // ! antes da variavel pode ser usado como operador de negação ou seja a mesma coisa que ultilizar == false
        if (!isAutorizadoComprarBebiba) {
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }

        boolean c = false;

        if (c == true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
        System.out.println("Fora do if");
    }
}