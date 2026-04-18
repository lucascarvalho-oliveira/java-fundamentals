package app;

import java.util.Scanner;

public class Main {

    public static boolean verificarDistinto(int[] numeros, int quantidade) {
        boolean distinto = false;
        for (int i = 0; i < quantidade; i++) {
            for (int j = i + 1; j < quantidade; j++) {

                if (numeros[i] == numeros[j]) {
                    distinto = true;
                    break;
                }
            }
        }
        return distinto;
    }

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

        boolean distinto = verificarDistinto(numeros, quantidade);

        if (!distinto) {
            System.out.println();
            System.out.println("A lista é distinta");
        } else{
            System.out.println();
            System.out.println("A lista não é distinta");
        }

        sc.close();
    }

}
