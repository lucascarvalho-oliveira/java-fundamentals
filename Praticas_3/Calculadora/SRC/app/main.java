package app;

import java.util.Scanner;
import service.Calculadora;
import service.CalculadoraSegGrau;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean finalizar = false;
        while(!finalizar){
            System.out.println("Escolha uma das duas opções:");
            System.out.println("1 - Calculadora.");
            System.out.println("2 - Calculadora segundo grau");
            System.out.println("3 - Finalizar programa");
            int menu = sc.nextInt();

            switch (menu){
                case 1:
                    Calculadora C = new Calculadora();

                    boolean finalizarCalculadora = false;
                    while(!finalizarCalculadora) {
                        System.out.println();
                        System.out.println("Informe o valor (A):");
                        C.valor_A = sc.nextDouble();
                        System.out.println("Informe o valor (B):");
                        C.valor_B = sc.nextDouble();

                        System.out.println();
                        System.out.println("O que voce deseja:");
                        System.out.println("1 - Somar | 2 - Subtrair | 3 - Multiplicar | 4 - Dividir | 5 - Voltar");
                        int menu_2 = sc.nextInt();

                        if(menu_2 == 1){
                            System.out.println();
                            System.out.println("A soma = " + C.soma());
                            continue;
                        }
                        if(menu_2 == 2){
                            System.out.println();
                            System.out.println("A subtração = " + C.subtrair());
                            continue;
                        }
                        if(menu_2 == 3){
                            System.out.println();
                            System.out.println("A multiplicação = " + C.multiplicar());
                            continue;
                        }
                        if(menu_2 == 4){
                            System.out.println();
                            System.out.println("A divisão = " + C.dividir());
                            continue;
                        }
                        if(menu_2 == 5){
                            finalizarCalculadora = true;
                        }
                    }
                    System.out.println();
                    break;

                case 2:
                    CalculadoraSegGrau C2 = new CalculadoraSegGrau();

                    System.out.println();
                    System.out.println("Informe o valor (A):");
                    C2.valor_A = sc.nextDouble();
                    System.out.println("Informe o valor (B):");
                    C2.valor_B = sc.nextDouble();
                    System.out.println("Informe o valor (C):");
                    C2.valor_C = sc.nextDouble();

                    double delta = C2.delta();

                    if(delta >= 0){
                        System.out.println();
                        System.out.println("delta = " + C2.delta());
                        System.out.println("XI = " + C2.XI());
                        System.out.println("XII = " + C2.XII());
                    }else{
                        System.out.println();
                        System.out.println("Delta = " + C2.delta());
                        System.out.println("Não existem raízes reais");
                    }

                    break;

                case 3:
                    finalizar = true;
            }
        }


        sc.close();
    }
}
