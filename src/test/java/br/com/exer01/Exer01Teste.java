package br.com.exer01;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class Exer01Teste {

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
