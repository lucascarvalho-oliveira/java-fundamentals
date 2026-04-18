package app;

import java.util.Scanner;

public class Main {
    public static int[] deslocar(int[] numeros, int indice, int novoValor){
        int tamanho = 5;

        for(int i = tamanho; i > indice; i--){
            numeros[i] = numeros[i - 1];
            numeros[indice - 1] = novoValor;
            tamanho++;
        }
        return numeros;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Adicione 5 numeros a lista");
        for(int i = 0; i < 5; i++){
            numeros[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Qual o novo valor ?");
        int novoValor = sc.nextInt();

        System.out.println();
        System.out.println("Qual a pocisão que deseja colocar");
        int indice = sc.nextInt();

        int[] novoNumero = deslocar(numeros, indice, novoValor);

        System.out.println();
        for(int numero: novoNumero){
            if(numero > 0) System.out.println(numero + " ");
        }
        sc.close();
    }
}
