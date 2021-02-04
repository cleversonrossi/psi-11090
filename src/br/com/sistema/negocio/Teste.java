package br.com.sistema.negocio;

import br.com.sistema.excecao.SistemaException;

public class Teste {

	public static void main(String[] args) throws SistemaException {
		
		NegocioProduto negocioProduto = new NegocioProduto();
		negocioProduto.consultarProdutos(); 
		
	}

}
