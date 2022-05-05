package br.unicamp.inf335.app.inf335_proj;

import static org.junit.jupiter.api.Assertions.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnuncioBeanTest {
	
	


	@Test
	@DisplayName("Testa se o c�lculo do an�ncio retorna um valor v�lido")
	void test() throws MalformedURLException {
		
		ProdutoBean prod1 = new ProdutoBean("001", "galaxy", "celular", 1900.00, "novo");		
		ArrayList<URL> imagens = new ArrayList<URL>();		
		URL img1 = new URL("https://www.samsung.com/br/");		
		imagens.add(0,img1);
		
		AnuncioBean anuncio = new AnuncioBean(prod1, imagens, 0.50);
		double valorComDesconto = anuncio.getValor();
		
		assertTrue((prod1.getValor()*anuncio.getDesconto())==valorComDesconto);
	}
}
