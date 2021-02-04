package br.com.sistema.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.sistema.excecao.SistemaException;
import br.com.sistema.vo.Item;
import br.com.sistema.vo.Produto;

public class ProdutoDAO extends Conexao{ 

	public List<Produto> consultaTodosProdutos() throws SistemaException{

		String sql = "SELECT * FROM PRODUTO P INNER JOIN ITEM_PRODUTO I "
				+ "ON (P.CODIGOPRODUTO = I.CODIGOPRODUTO)"
				+ " ORDER BY P.NOME";
		
		PreparedStatement ps = null;
		try{
			//Pega uma conexão
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			
			//Executa a query
			ResultSet rs = ps.executeQuery();
			
			List<Produto> lista = new ArrayList<Produto>();
			
			//Popula os objetos Produto/Item com os dados retornados do ResultSet da query executada
			while(rs.next()){
				Produto produto = new Produto();
				produto.setCodigoProduto(rs.getInt("p.codigoproduto"));
				produto.setNome(rs.getString("p.nome"));
				produto.setDescricao(rs.getString("p.descricao"));
				produto.setCategoria(rs.getString("p.categoria"));
				produto.setAtributo1(rs.getString("p.atributo1"));
				produto.setAtributo2(rs.getString("p.atributo2"));
				produto.setAtributo3(rs.getString("p.atributo3"));
				produto.setAtributo4(rs.getString("p.atributo4"));
				
				produto.setItem(new Item()); 
				produto.getItem().setCodigoProduto(rs.getInt("i.codigoproduto"));
				produto.getItem().setCodigoItem(rs.getInt("i.codigoitem"));
				produto.getItem().setNome(rs.getString("i.nome"));
				produto.getItem().setDescricao(rs.getString("i.descricao"));
				produto.getItem().setCategoria(rs.getString("i.categoria"));
				produto.getItem().setAtributo1(rs.getString("i.atributo1"));
				produto.getItem().setAtributo2(rs.getString("i.atributo2"));
				produto.getItem().setAtributo3(rs.getString("i.atributo3"));
				produto.getItem().setAtributo4(rs.getString("i.atributo4"));
				
				lista.add(produto);
			}
			
			return lista;
			
		}catch(SQLException e){
			throw new SistemaException(e.getMessage());
		}finally{
			//Fecha a conexão
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				throw new SistemaException(e.getMessage());
			}
		}
	}
	
	
}