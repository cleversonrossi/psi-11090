package br.com.sistema.vo;

public class Produto { 
		
	private Item item = new Item();
	
	private Integer codigoProduto;
	private String nome;
	private String descricao;
	private String categoria;
	private String atributo1;
	private String atributo2;
	private String atributo3;
	private String atributo4;

	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Integer getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(Integer codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getAtributo1() {
		return atributo1;
	}
	public void setAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}
	public String getAtributo2() {
		return atributo2;
	}
	public void setAtributo2(String atributo2) {
		this.atributo2 = atributo2;
	}
	public String getAtributo3() {
		return atributo3;
	}
	public void setAtributo3(String atributo3) {
		this.atributo3 = atributo3;
	}
	public String getAtributo4() {
		return atributo4;
	}
	public void setAtributo4(String atributo4) {
		this.atributo4 = atributo4;
	}
	
}