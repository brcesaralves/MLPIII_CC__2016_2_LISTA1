package br.com.exercicioum;

public class Fatura {
	private String numero;
	private String descricao;
	private int qtdCompra;
	private double preco;
	
	public double getValorFatura(int quantidade, double preco){
		double total = quantidade * preco;
			if(total <= 0){
				return 0;
			}
			if(preco <= 0){
				return 0.0;
			}
		return total;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQtdCompra() {
		return qtdCompra;
	}
	public void setQtdCompra(int qtdCompra) {
		this.qtdCompra = qtdCompra;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
