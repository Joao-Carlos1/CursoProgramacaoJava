package academy.devdojo.maratonajava.introducao.javacore.classesBintroducaometodos.domain;

public class Calculator {

    public void somaDosNumeros() {
        System.out.println(10 + 10);
    }

    public void subtracaoDosNumeros() {
        System.out.println(10 - 9);
    }

    public void multiplicacaoDosNumeros(int num1, float num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        return num1/num2;
    }

}
