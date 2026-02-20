package logica;

import java.util.Scanner;

public class ConvertendoSegundos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("informe o segundos");
        int segundos = sc.nextInt();

        converterSegundo(segundos);

        sc.close();
    }

    public static void  converterSegundo(int segundos){
        int horas = segundos / 3600;
        int resto = segundos % 3600;
        int minutos = resto / 60;
        resto %= 60;

        System.out.println(horas + "h " + minutos + "min " + resto + "seg");
    }
}
