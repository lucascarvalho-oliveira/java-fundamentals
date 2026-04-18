package service;

public class CalculadoraSegGrau {
    public double valor_A;
    public double valor_B;
    public double valor_C;

    public double delta(){
        return Math.pow(valor_B, 2) - 4 * valor_A * valor_C;
    }

    public double XI(){
        return (-valor_B + Math.sqrt(delta())) / (2 * valor_A);
    }

    public double XII(){
        return (-valor_B - Math.sqrt(delta())) / (2 * valor_A);
    }
}
