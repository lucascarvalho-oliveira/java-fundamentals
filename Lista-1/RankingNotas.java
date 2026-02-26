package app;

public class Main {

    public static double mediadoArray(double[] notas){
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }

    public static int acimadaMedia(double[] notas){
        double media = mediadoArray(notas);
        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) contador++;
        }
        return contador;
    }

    public static double maiorNota(double[] notas){
        double maior = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maior) maior = notas[i];
        }
        return maior;
    }

    public static void main(String[] args) {
        double[] notas = {7.5, 4.0, 9.2, 5.5, 8.0, 6.5, 3.2, 10.0, 7.0, 5.8};

        System.out.println("Media = " + mediadoArray(notas));
        System.out.println("Quantidade de alunos aprovados: " + acimadaMedia(notas));
        System.out.println("Maior nota = " + maiorNota(notas));
    }
}
