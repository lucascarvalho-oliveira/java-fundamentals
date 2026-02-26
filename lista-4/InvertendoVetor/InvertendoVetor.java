package app;

public class Main {

    public static int[] inverterList(int[] inverter_lista){
        int inicio = 0;
        int fim = inverter_lista.length - 1;

        while(inicio < fim){
            int temporario = inverter_lista[inicio];
            inverter_lista[inicio] = inverter_lista[fim];
            inverter_lista[fim] = temporario;
            inicio ++;
            fim --;
        }
        return inverter_lista;
    }

    public static void main(String[] args){
        int[] inverter_lista = {10, 20, 30, 40, 50};

        int[] resultado = inverterList(inverter_lista);

        for(int numero : resultado){
            System.out.println(numero);
        }
    }
}
