package br.com.locadora.model.test;

import br.com.locadora.model.Filme;
import junit.framework.TestCase;

public class TestFilme extends TestCase{
	
	Filme filme = new Filme();
	
	public void testAlugar(){
		
		Filme filme = new Filme();
		filme.setPreco(10.0);
		
		String tipo = "infantil";
		
		assertEquals(filme.alugar(10.0, tipo), 6.0);
				
	}
	
}
