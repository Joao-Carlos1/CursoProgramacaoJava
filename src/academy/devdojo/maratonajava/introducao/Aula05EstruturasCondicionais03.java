package maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se sálario > 5000
        double salario = 4000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo.";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter.";

        //(condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        if (salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);

    }
}
