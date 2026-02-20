package logica;

import java.util.Scanner;

public class VerificandoDistintos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros serão comparados");
        int quantidade = sc.nextInt();

        int[] numeros = new int[quantidade];

        System.out.println();
        System.out.println("Informe os numeros");
        for (int i = 0; i < quantidade; i++) {
            numeros[i] = sc.nextInt();
        }

        verificarDistinto(numeros, quantidade);

        sc.close();
    }

    public static void verificarDistinto(int[] numeros, int quantidade) {
        boolean distinto = false;
        for (int i = 0; i < quantidade; i++) {
            for (int j = i + 1; j < quantidade; j++) {

                if (numeros[i] == numeros[j]) {
                    distinto = true;
                    break;
                }
            }
        }

        if (distinto) {
            System.out.println();
            System.out.println("A lista é distinta");
        } else{
            System.out.println();
            System.out.println("A lista não é distinta");
        }
    }
}
