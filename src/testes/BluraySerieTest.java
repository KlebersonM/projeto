package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Projeto.BluraySerie;

public class BluraySerieTest {

	/**
	 * Verifica se o construtor est� passando as informa��es para seus devidos lugares
	 */
	@Test
	public void testBluraySerie() {
		BluraySerie BS1 = new BluraySerie("GOT", 80.50,"VAI MORRER TODO MUNDO!", 50, "DEZOITO_ANOS", "SUSPENSE", 7 );
		BluraySerie BS2 = new BluraySerie("VIKINGS", 60.00 ,"As aventuras de ragnaldo e seus amigos", 50, "QUATORZE_ANOS", "ACAO", 4 );
		assertEquals("GOT", BS1.getNome());
		assertEquals(80.50, BS1.getValor(), 0.0001);
		assertEquals("As aventuras de ragnaldo e seus amigos", BS2.getDescricao());
		assertEquals(50, BS1.getDuracao());
		assertEquals("QUATORZE_ANOS", BS2.getClassificacao());
		assertEquals("SUSPENSE", BS1.getGenero());
		assertEquals(4, BS2.getTemporada());

	}

	/** 
	 * Testa se o toString � do formato
	 *"SERIE: " + this.getNome() + ", R$ " + this.getValor() + ", " + this.stringEmprestado() + ", " + this.getDuracao() + " min, " + this.getClassificao() + ", " + this.getGenero() + ", Temporada " + this.getTemporada()
	 */
	@Test
	public void testToString() {
		BluraySerie BS1 = new BluraySerie("GOT", 80.50,"VAI MORRER TODO MUNDO!", 50, "DEZOITO_ANOS", "SUSPENSE", 7 );
		BluraySerie BS2 = new BluraySerie("VIKINGS", 60.00 ,"As aventuras de ragnaldo e seus amigos", 50, "QUATORZE_ANOS", "ACAO", 4 );
		assertEquals("SERIE: GOT, R$ 80.5, Nao emprestado, 50 min, DEZOITO_ANOS, SUSPENSE, Temporada 7", BS1.toString());
		BS2.emprestou();
		assertEquals("SERIE: VIKINGS, R$ 60.0, Emprestado, 50 min, QUATORZE_ANOS, ACAO, Temporada 4",BS2.toString());
	}


	/**
	 * Verifica se 2 BluraySerie s�o iguais
	 * S�o iguais se @param NomeItem e @param temporada forem os mesmos
	 */
	@Test
	public void testEqualsObject() {
		BluraySerie BS1 = new BluraySerie("GOT", 80.50,"VAI MORRER TODO MUNDO!", 50, "DEZOITO_ANOS", "SUSPENSE", 1 );
		BluraySerie BS2 = new BluraySerie("GOT", 80.50,"VAI MORRER TODO MUNDO!", 50, "DEZOITO_ANOS", "SUSPENSE", 2 );
		BluraySerie BS3 = new BluraySerie("GOT", 80.50,"VAI MORRER TODO MUNDO!", 50, "DEZOITO_ANOS", "SUSPENSE", 1 );

		assertEquals(false, BS1.equals(BS2));
		assertEquals(true, BS1.equals(BS3));
		assertEquals(false,BS3.equals(BS2));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testErro(){
		BluraySerie BS1 = new BluraySerie("GOT", 80.50,"VAI MORRER TODO MUNDO!", 50, "DEZOITO_ANO", "SUSPENSE", 1 );
	}
}
