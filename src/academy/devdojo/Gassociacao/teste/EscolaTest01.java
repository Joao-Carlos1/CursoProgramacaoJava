package academy.devdojo.Gassociacao.teste;

import academy.devdojo.Gassociacao.domain.Professor;
import academy.devdojo.Gassociacao.domain.Escola;

public class EscolaTest01 {
    public static void main(String[] args){
        Professor professor = new Professor("Joao");
        Professor professor2 = new Professor("Joao");
        Professor[] professores = {professor, professor2};
        Escola escola = new Escola("IFNMG", professores);

        escola.imprime();

    }
}
