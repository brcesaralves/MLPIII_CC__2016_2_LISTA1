package br.com.locadora;

public class Filme {
	private String tipo;
	private String titulo;
	private String categoria;
	private double preco;
	private Autor autor;
	
	public double alugar(double preco,String tipo){
		if(this.tipo.equals("lancamento")){
			this.preco = (preco*0.2)+this.preco;
		}
		else{
			if(this.tipo.equals("infantil")){
				this.preco = this.preco - (this.preco*0.4);
			}
		}
		return preco;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
	
}
