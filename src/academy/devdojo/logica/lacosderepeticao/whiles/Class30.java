package academy.devdojo.logica.lacosderepeticao.whiles;

import java.util.Scanner;

public class Class30 {
    public static void main(String[] args) {
        Scanner recebimento = new Scanner(System.in);
        String login = "Admin";
        String senha = "Admin";


        System.out.println("Digite seu login");
        String loginUsuario = recebimento.next();


        System.out.println("Digite sua senha");
        String senhaUsuario = recebimento.next();


        while (loginUsuario != login && senhaUsuario != senha)


            if (loginUsuario.equalsIgnoreCase(login) && senhaUsuario.equalsIgnoreCase(senha)) {
                System.out.println("Login Feito com  Sucesso");
                break;

            } else {
                System.out.println("Login Fracassou");

                System.out.println("Digite seu login");
                loginUsuario = recebimento.next();
                System.out.println("Digite sua senha");
                senhaUsuario = recebimento.next();


            }


    }
}