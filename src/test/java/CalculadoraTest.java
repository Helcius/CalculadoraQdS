import org.example.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

    public Calculadora calculadora = new Calculadora();

    @Test
    public void divisaoValidaTest(){
        double resultado = calculadora.divisao(10, 2);
        assertEquals(5.00, resultado);

    }
    @Test
    public void divisaoPorZeroTest(){
        ArithmeticException excecao = assertThrows(ArithmeticException.class, () -> calculadora.divisao(10, 0));
        assertEquals("Divisão por zero não é permitida.",excecao.getMessage());
    }
}
