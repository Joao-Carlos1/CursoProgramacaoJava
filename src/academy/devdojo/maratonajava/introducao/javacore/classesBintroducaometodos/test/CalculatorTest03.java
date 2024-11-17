package academy.devdojo.maratonajava.introducao.javacore.classesBintroducaometodos.test;

import academy.devdojo.maratonajava.introducao.javacore.classesBintroducaometodos.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args){

        Calculator calculator = new Calculator();

        double mult = calculator.divideDoisNumeros(20, 2);
        System.out.println(mult);

    }
}
