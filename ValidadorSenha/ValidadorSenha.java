package logica;

import java.util.Scanner;

public class ValidadorSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean senhaValida = false;
        String simbolos = ".*[!@#$^&*].*";

        while(!senhaValida){
            System.out.println("Digite a senha:");
            String senha = sc.nextLine();

            int tamanho = senha.length();

            if(tamanho >= 8 && senha.matches(simbolos)){
                System.out.println("Senha criada!");
                senhaValida = true;
            }else {
                System.out.println("Senha incorreta, no mínimo 8 caracteres, e no mínimo 1 simbolo.");
                continue;
            }
        }
        sc.close();
    }
}
