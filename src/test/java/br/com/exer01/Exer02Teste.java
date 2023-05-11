package br.com.exer01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exer02Teste {

	@Test
	void validaSenhaIgualNome() {
		Exer02 exer02 = new Exer02("jose", "jose");
		assertEquals("Erro Senha Igual ao Nome !", exer02.verificaSenha());
	}

	@Test
	void validaSenhaDiferenteNome() {
		Exer02 exer02 = new Exer02("jose", "123pqr");
		assertEquals("Confirmado Senha Diferente de Nome", exer02.verificaSenha());
	}

}

