package academy.devdojo.Hheranca.test;

import academy.devdojo.Hheranca.domain.Endereco;
import academy.devdojo.Hheranca.domain.Funcionario;
import academy.devdojo.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 2");
        endereco.setCep("012345");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joao");
        pessoa.setCpf("100.00.000");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("-------------------------------------");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Oda");
        funcionario.setCpf("111111111");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(200000.0);

        funcionario.imprime();
    }
}
