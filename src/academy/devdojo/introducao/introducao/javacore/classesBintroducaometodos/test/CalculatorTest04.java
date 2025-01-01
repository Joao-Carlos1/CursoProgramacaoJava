package academy.devdojo.introducao.introducao.javacore.classesBintroducaometodos.test;

import academy.devdojo.introducao.introducao.javacore.classesBintroducaometodos.domain.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        double a = 100.2;
        int b = 2;
        calculator.alteraDoisNumeros(a , b);
        System.out.println("Dentro do calculadoratest");
        System.out.println(a + " " + b);
    }
}
