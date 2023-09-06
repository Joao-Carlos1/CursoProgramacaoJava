package academy.devdojo.logica.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula04ExercicioLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario1 = "usuario1";
        String senha1 = "senha1";
        System.out.println("Digite seu usuario");
        String usuario = sc.next();
        System.out.println("Digite sua senha");
        String senha = sc.next();
        while (true) {
            if (usuario.equals(usuario1) && senha.equals(senha1)) {
                System.out.println("Login relizado com sucesso");
                break;
            }
            System.out.println("Nome de usuário ou senha incorretos");
            System.out.println("Digite seu usuario");
            usuario = sc.next();
            System.out.println("Digite sua senha");
            senha = sc.next();

        }
        System.out.println("Sistema terminado");
    }
}
