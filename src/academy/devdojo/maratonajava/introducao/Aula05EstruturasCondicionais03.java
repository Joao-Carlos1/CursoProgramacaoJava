package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se sálario > 5000
        Scanner sc = new Scanner(System.in);
        double salario;
        System.out.println("Diga seu salario");
        salario = sc.nextDouble();
        String mensagemDoar = "Eu vou doar 500 pro DevDojo.";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter.";

        //(condicao) ? verdadeiro : falso
        // String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        String resultado;
        if (salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);

    }
}
