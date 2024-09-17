import org.example.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

    public Calculadora calculadora = new Calculadora();

    @Test
    public void testDivisaoValida(){
        double resultado = calculadora.divisao(10, 2);
        assertEquals(5.00, resultado);

    }
    @Test
    public void testDivisaoPorZero(){
        ArithmeticException excecao = assertThrows(ArithmeticException.class, () -> calculadora.divisao(10, 0));
        assertEquals("Divisão por zero não é permitida.",excecao.getMessage());
    }

    // Testes do método de exponenciação

        // Testes de exponenciação para base positiva.

    @Test
    public void testBasePositivaExpoentePositivo() {
        assertEquals(8.0, calculadora.exponencial(2, 3), 0.0001);
    }

    @Test
    public void testBasePositivaEExpoenteZero() {
        assertEquals(1.0, calculadora.exponencial(5, 0), 0.0001);
    }

        // Testes de exponenciação para base negativa.

    @Test
    public void testBaseNegativaEExpoentePar() {
        assertEquals(16.0, calculadora.exponencial(-2, 4), 0.0001);
    }

    @Test
    public void testBaseNegativaEExpoenteImpar() {
        assertEquals(-8.0, calculadora.exponencial(-2, 3), 0.0001);
    }

    @Test
    public void testBaseNegativaEExpoenteFracionario() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calculadora.exponencial(-2, 0.5);
        });
        assertEquals("Expoente fracionário com base negativa não é permitido.", exception.getMessage());
    }

        // Testes de exponenciação com base zero.

    @Test
    public void testBaseZeroEExpoentePositivo() {
        assertEquals(0.0, calculadora.exponencial(0, 5), 0.0001);
        }

    @Test
    public void testBaseZeroEExpoenteZero() {
        assertEquals(1.0, calculadora.exponencial(0, 0), 0.0001);
    }

    @Test
    public void testSoma(){
        double resultado = calculadora.soma(10, 2);
        assertEquals(12, resultado);

    }
    @Test
    public void testSubtracao(){
        double resultado = calculadora.subtracao(10, 2);
        assertEquals(8, resultado);

    }
    @Test
    public void testMultiplicacao(){
        double resultado = calculadora.multiplicacao(10, 2);
        assertEquals(20, resultado);

    }

    @Test
    public void testFatorialPositivo() {
        long resultado = calculadora.fatorial(5);
        assertEquals(120, resultado);
    }

    @Test
    public void testFatorialZero() {
        long resultado = calculadora.fatorial(0);
        assertEquals(1, resultado);
    }

    @Test
    public void testFatorialNegativo(){
        IllegalArgumentException excecao = assertThrows(IllegalArgumentException.class, () -> calculadora.fatorial(-2));
        assertEquals("Fatorial não é definido para números negativos.",excecao.getMessage());
    }

}
