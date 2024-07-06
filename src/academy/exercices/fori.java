package academy.exercices;

public class fori {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        System.out.println("----------------------------------------------------------");

        for (int i = 0; i <= 20; i += 2) {

            System.out.println(i);

        }
        System.out.println("----------------------------------------------------------");
        int soma = 0;
        for (int i = 0; i <= 100; i++) {
            soma += i;

        }System.out.println(soma);
    }
}
