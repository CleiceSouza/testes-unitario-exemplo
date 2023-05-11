package br.com.exer01;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

class Exer01Teste {
	
	@Test
	void groupAssertions() {
		Double[] numbers = {0.0, 3.7, -2.8,3.0,4.0};
		assertAll("Grupo de Afirmações",
				() -> assertEquals(true, new Exer01(numbers[1]).notaValida()),
				() -> assertEquals(false, new Exer01(numbers[2]).notaValida())
				);
	}

	@Test
	void notaValida1() {
		Exer01 exer01 = new Exer01(5.2);
		assertEquals(true, exer01.notaValida());
	}
	
	@Test
	void notaValida2() {
		Exer01 exer01 = new Exer01(-1.5);
		assertEquals(false, exer01.notaValida());
	}
	
	@Test
	void notaValida3() {
		Exer01 exer01 = new Exer01(11.8);
		assertEquals(false, exer01.notaValida());
	}

}
