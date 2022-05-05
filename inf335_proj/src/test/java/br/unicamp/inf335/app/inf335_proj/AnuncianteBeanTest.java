package br.unicamp.inf335.app.inf335_proj;

import static org.junit.jupiter.api.Assertions.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnuncianteBeanTest {

	@Test
	@DisplayName ("Testa os m�todos do anunciante")
	void test() throws MalformedURLException {
		
		ProdutoBean prod1 = new ProdutoBean("001", "galaxy", "celular", 1900.00, "novo");
		ProdutoBean prod2 = new ProdutoBean("002", "galaxy", "celular", 1800.00, "novo");
		
		ArrayList<URL> imagens = new ArrayList<URL>();		
		URL img1 = new URL("https://www.samsung.com/br/");		
		imagens.add(0,img1);

		ArrayList<AnuncioBean> anuncios = new ArrayList<AnuncioBean>();
		AnuncioBean oferta1 = new AnuncioBean(prod1, imagens, 0.50);
		anuncios.add(oferta1);
		AnuncioBean oferta2 = new AnuncioBean(prod2, imagens, 0.8);
		anuncios.add(oferta2);	
		
		
		
		AnuncianteBean anunciante = new AnuncianteBean("Pedro", "47777752406", anuncios);
		
		
	
		double mediaValores = anunciante.valorMedioAnuncios();
		double mediaCalculada;
		double aculm =0 ;
		
		
		for(int i=0; i< anuncios.size(); i=i+1)			
			aculm = aculm + anuncios.get(i).getValor();
		 
		mediaCalculada = aculm/(anuncios.size());
				
		
		assertTrue(mediaCalculada == mediaValores);
	}
}
