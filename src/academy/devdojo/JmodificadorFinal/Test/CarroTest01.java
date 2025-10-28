package academy.devdojo.JmodificadorFinal.Test;

import academy.devdojo.JmodificadorFinal.Domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIM);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("j");
        System.out.println(carro.COMPRADOR);
    }
}
