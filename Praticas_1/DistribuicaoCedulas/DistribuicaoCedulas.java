package app;

import java.util.Scanner;

public class Main {

    public static int divisaodeNotas(int valor, int notas){
        return valor / notas;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero (múltiplo de 10).");
        int valor = sc.nextInt();

        int notas_50 = divisaodeNotas(valor, 50);
        valor %= 50;
        int notas_20 = divisaodeNotas(valor, 20);
        valor %= 20;
        int notas_10 = divisaodeNotas(valor, 10);

        System.out.println(notas_50 + " : de R$ 50");
        System.out.println(notas_20 + " : de R$ 20");
        System.out.println(notas_10 + " : de R$ 10");

        sc.close();
    }
}
