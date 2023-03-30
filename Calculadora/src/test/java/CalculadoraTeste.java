import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Calculadora.Calculadora;

public class CalculadoraTeste {
	
	
	private Calculadora calc;
	
	@BeforeEach
	public void inicializar() {
		this.calc = new Calculadora();
	}
	
	@Test
	void testeSomar() {
		
		calc = new Calculadora();
		
		int a = 3;
		int b = 3;
		int resultado = calc.somar(a, b);
		
		assertEquals(a+b, resultado);
		
	}
	
	@Test
	void testeSubstrair() {
		
		Calculadora calc = new Calculadora();
		
		int a = 3;
		int b = 3;
		int resultado = calc.subtrair(a, b);
		
		assertEquals(a-b, resultado);
		
	}
	
	@Test
	void testeMultiplicar() {
		
		Calculadora calc = new Calculadora();
		
		int a = 3;
		int b = 3;
		int resultado = calc.multiplicar(a, b);
		
		assertEquals(a*b, resultado);
		
	}
	
	@Test
	void testeDividir() {
		
		Calculadora calc = new Calculadora();
		
		int a = 3;
		int b = 3;
		int resultado = calc.dividir(a, b);
		
		assertEquals(a/b, resultado);
		
	}
	
}
