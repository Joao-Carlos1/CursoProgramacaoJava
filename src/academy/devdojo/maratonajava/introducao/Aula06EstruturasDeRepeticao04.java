package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstruturasDeRepeticao04 {
    // Dado um valor de um carro, descubra quantas vezes ele pode ser parcelado
    // Condição é que o valor da parcela >= 1000
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorCarro = sc.nextInt();
        for (int i = 1; i <= valorCarro; i++) {
            double valorParcela = valorCarro / i;
            if (valorParcela <1000) {
                break;
            }
            System.out.println("Parcela " + i + " por RS " + valorParcela);
        }
    }
}
