package academy.devdojo.logica.arrays.multidimensionais;

public class Ex2DiagonalPrincipal {
    public static void main(String[] args) {

//        Exercício 3 - Matriz Bidimensional e Elementos da Diagonal Principal
//        Usando um for-each, percorra uma matriz bidimensional de inteiros e
//        exiba apenas os elementos que estão na diagonal principal (onde o índice da linha é igual ao índice da coluna).
        int[][] matriz = new int[][]{{1, 2, 3}, {1, 5, 3}, {1, 7, 10}};
        int num = 0;

        for (int[] j : matriz) {
            System.out.println(j[num]);
            num++;
        }
    }
}

