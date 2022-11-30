package com.generation.pruebasUnitarias;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;
@DisplayName("Clase de prueba de calculadora")
public class CalculadoraTest {
	Calculadora calc=new Calculadora(true);
	
	@Test
	@DisplayName("Metodo si la suma es correcta")
	void pruebaSuma() {
		// TODO Auto-generated method stub
		//Calculadora calc=new Calculadora(true);
		calc.suma(2, 2);
		assertEquals(4, calc.suma(2, 2),"Debería ser 4");

	}
	
	@Test
	@DisplayName("Probar si la calculadora esta encendida")
	void pruebaIsOn() {
		//Calculadora calc=new Calculadora(false);
		assertTrue(calc.isOn());
	}
	
	@Test
	@DisplayName("Probar si la division es correcta")
	void pruebaDiv() {
		//Calculadora calc=new Calculadora(false);
		assertEquals(2.5, calc.division(5, 2));
	}
}
