package logica;

public class RankingNotas {
    public static void main(String[] args) {
        double[] notas = {7.5, 4.0, 9.2, 5.5, 8.0, 6.5, 3.2, 10.0, 7.0, 5.8};

        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;

        int contador
 = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) contador++;
        }

        double maior = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maior) maior = notas[i];
        }

        System.out.println("Media = " + media);
        System.out.println("Quantidade de alunos aprovados: " + contador);
        System.out.println("Maior nota = " + maior);
    }
}
