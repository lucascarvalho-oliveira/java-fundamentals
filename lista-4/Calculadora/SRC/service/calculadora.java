package service;

public class Calculadora {
    public double valor_A;
    public double valor_B;

    public double soma(){
        return valor_A + valor_B;
    }

    public double subtrair(){
        return valor_A - valor_B;
    }

    public double multiplicar(){
        return valor_A * valor_B;
    }

    public double dividir(){
        return valor_A / valor_B;
    }
}
