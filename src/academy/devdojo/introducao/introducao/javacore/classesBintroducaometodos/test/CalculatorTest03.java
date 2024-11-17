package academy.devdojo.introducao.introducao.javacore.classesBintroducaometodos.test;

import academy.devdojo.introducao.introducao.javacore.classesBintroducaometodos.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args){

        Calculator calculator = new Calculator();

        calculator.divideDoisNumeros(20, 0);

        double mult = calculator.divideDoisNumeros02(0,0);
        System.out.println("-----------------\n" + mult);
    }
}
