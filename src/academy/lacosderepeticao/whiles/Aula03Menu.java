package academy.lacosderepeticao.whiles;

/* Como usuário eu gostaria de  de ter um menu visual  que seja navegável através de números.
O menu deve ser exibido da seguinte forma

1. Calcular Imposto
2. Depositar Salário
3. Sair

O menu deve ficar disponível enquanto eu não digitar o número 3.
Dessa forma o sistema ficará em execução, evitando ter que ser reiniciado a cada operação.
*/

import java.util.Scanner;

public class Aula03Menu {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int opção = 0;
        while (opção != 3) {
            System.out.println("Calcular Imposto");
            System.out.println("Depositar Salario");
            System.out.println("Sair");
            opção = read.nextInt();
        }

    }
}