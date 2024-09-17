package org.example;

public class Calculadora {
    // Método para soma
    public double soma(double num1, double num2) {
        return num1 + num2;
    }

    // Método para subtração
    public double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    // Método para multiplicação
    public double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    // Método para divisão, com tratamento de divisão por zero
    public double divisao(double num1, double num2) {
            if (num2 == 0) {
                throw new ArithmeticException("Divisão por zero não é permitida.");
            }
            return num1 / num2;
    }

    // Método para exponenciação
    public double exponencial(double base, double expoente) {
            // Se a base for negativa e o expoente não for inteiro, gera um erro
            if (base < 0 && expoente % 1 != 0) {
                throw new ArithmeticException("Expoente fracionário com base negativa não é permitido.");
            }
            return Math.pow(base, expoente);
    }

    // Método para calcular o fatorial de um número
    public long fatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Fatorial não é definido para números negativos.");
        }
        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

}
