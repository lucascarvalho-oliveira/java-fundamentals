package app;

import java.util.Scanner;

public class Main {

    public static int converterSegundo(int segundosTotais, int segundos){
        return segundosTotais / segundos;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("informe o segundos");
        int segundosTotais = sc.nextInt();

        int horas = converterSegundo(segundosTotais, 3600);
        segundosTotais %= 3600;
        int minutos = converterSegundo(segundosTotais, 60);
        segundosTotais %= 60;

        System.out.println(horas + "h " + minutos + "min " + segundosTotais + "seg");

        sc.close();
    }
}
