package br.unicamp.inf335.app.inf335_proj;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProdutoBeanTest {
	
	ArrayList<ProdutoBean> produtos = new ArrayList<ProdutoBean>();

	ProdutoBean prod1 = new ProdutoBean("001", "galaxy", "celular", 1900.00, "novo");
	ProdutoBean prod2 = new ProdutoBean("002", "galaxy", "celular", 1899.99, "novo");
	ProdutoBean prod3 = new ProdutoBean("003", "galaxy", "celular", 2100.50, "novo");
	ProdutoBean prod4 = new ProdutoBean("004", "galaxy", "celular", 1200.00, "novo");
	ProdutoBean prod5 = new ProdutoBean("005", "galaxy", "celular", 1542.25, "novo");
	

	@Test
	@DisplayName("Testa o e valida o m�todo compareTo()")
	void test() {
		
		produtos.add(prod1);
		produtos.add(prod2);
		produtos.add(prod3);
		produtos.add(prod4);
		produtos.add(prod5);
		
		int lengh = produtos.size();
		int i =0 ;
		int acuml = 0;
		
		double sample[] = new double[lengh];

		
		for(i=0; i < lengh; i++)
			sample[i]= produtos.get(i).getValor();
		
		Collections.sort(produtos);
		
		for(i=0; i< lengh; i++) {
			if(sample[i]== produtos.get(i).getValor()){
				acuml = acuml + 1;
			}
			else {
				acuml = 0;
			}
		}
			
		assertTrue(acuml!=lengh);							
	}
	
	@Test
	@DisplayName("Testa o e valida os m�todos de get() e set()")
	void test1() {
		
		String novoCodigo ="002";
		String novaDecricao ="motorola";
		String novoEstado = "usado";
		String novoNome = "Celular";
		Double novoValor = 2000.00;
		
		prod1.setCodigo(novoCodigo);
		prod1.setDescricao(novaDecricao);
		prod1.setEstado(novoEstado);
		prod1.setNome(novoNome);
		prod1.setValor(novoValor);
		
		assertEquals(prod1.getCodigo(), novoCodigo);
		assertEquals(prod1.getDescricao(), novaDecricao);
		assertEquals(prod1.getEstado(), novoEstado);
		assertEquals(prod1.getNome(), novoNome);
		assertEquals(prod1.getValor(), novoValor);
		
	}
}

