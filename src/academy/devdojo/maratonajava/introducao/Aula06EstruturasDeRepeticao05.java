package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorCarro = sc.nextInt();
        for (int i = (int) valorCarro; i >= 1; i--) {
            double valorParcela = valorCarro / i;
            if (valorParcela < 1000)
                continue;
            System.out.println("PARCELA: " + i + " VALOR: " + valorParcela);
        }
    }
}
