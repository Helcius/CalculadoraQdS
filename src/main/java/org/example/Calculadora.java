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
        try {
            if (num2 == 0) {
                throw new ArithmeticException("Divisão por zero não é permitida.");
            }
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return Double.NaN; // Retorna "Não é um número" caso ocorra divisão por zero
        }
    }

    // Método para exponenciação
    public double exponencial(double base, double expoente) {
        try {
            // Se a base for negativa e o expoente não for inteiro, gera um erro
            if (base < 0 && expoente % 1 != 0) {
                throw new ArithmeticException("Expoente fracionário com base negativa não é permitido.");
            }
            return Math.pow(base, expoente);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return Double.NaN; // Retorna "Não é um número" para situações inválidas
        }
    }

}
