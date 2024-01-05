package academy.devdojo.logica.estruturascondicionais.ifelse;

import java.util.Scanner;

public class ValorDeCarros {
    public static void main(String[] args) {
        double valor;
        Scanner preco = new Scanner(System.in);
        System.out.println("Digite o valor do carro que deseja comprar");
        valor = preco.nextDouble();
        if (valor >= 10.000)
            System.out.println("Dentro do orçamento");
        else
            System.out.println("Está fora do orçamento");

    }
}
