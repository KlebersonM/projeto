package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Projeto.Bluray;

public class BlurayTest {


	/**
	 * Verifica se o construtor est� passando as informa��es para seus devidos lugares
	 */
	@Test
	public void testBluray() {
	Bluray B1 = new Bluray("Valente", 29.50, 100, "LIVRE");
	Bluray B2 = new Bluray("Matanza- Ao vivo", 89.70, 70, "DEZOITO_ANOS");
	
	assertEquals("Matanza- Ao vivo", B2.getNome());
	assertEquals(89.70, B2.getValor(), 0.00001);
	assertEquals(100, B1.getDuracao());
	assertEquals("LIVRE", B1.getClassificacao());
	
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testErro(){
		
		Bluray B1 = new Bluray("Valente", 29.50, 100, "LIVRR");
	}
}
