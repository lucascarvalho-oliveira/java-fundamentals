package app;

import java.util.Scanner;

public class Main {

    public static boolean validandoSenha(Scanner sc) {
        boolean senhaValida = false;
        String simbolos = ".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*";
        while (!senhaValida) {
            System.out.println();
            System.out.println("Digite a senha:");
            String senha = sc.nextLine();

            int tamanho = senha.length();

            if (tamanho >= 8 && senha.matches(simbolos)) {
                senhaValida = true;
            } else {
                System.out.println("Senha incorreta, no mínimo 8 caracteres, e no mínimo 1 simbolo.");
            }
        }
        return senhaValida;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean senhaValida = validandoSenha(sc);

        if (senhaValida) {
            System.out.println("Senha criado com sucesso!");
        }

        sc.close();
    }
}
