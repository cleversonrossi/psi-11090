package br.com.sistema.negocio;

import java.util.List;

import br.com.sistema.dao.ProdutoDAO;
import br.com.sistema.excecao.SistemaException;
import br.com.sistema.vo.Produto;

public class NegocioProduto {
	
	public List<Produto> consultarProdutos() throws SistemaException{ 
		ProdutoDAO dao = new ProdutoDAO();
		
		//Recupera todos os produtos com seus itens
		return dao.consultaTodosProdutos();
	}
	
}