package logica;

import java.util.Scanner;

public class DistribuicaoCedulas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero (múltiplo de 10).");
        int numero = sc.nextInt();

        int notas_50 = numero / 50;
        int resto = numero % 50;

        int notas_20 = resto / 20;
        resto %= 20;

        int notas_10 = resto / 10;

        System.out.println(notas_50 + " : de R$ 50");
        System.out.println(notas_20 + " : de R$ 20");
        System.out.println(notas_10 + " : de R$ 10");

        sc.close();
    }
}
