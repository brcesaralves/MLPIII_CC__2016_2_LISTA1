package br.com.exercicio2;

public class Carro {
	private String cor;
	private String modelo;
	private double velocidadeAtual;
	private double velocidadeMaxima;
	
	public void ligar(){
		System.out.println("Vrumm!!");
	}
	public void acelerar(double velocidade){
		this.velocidadeAtual = this.velocidadeAtual + velocidade;
		if(this.velocidadeAtual > this.velocidadeMaxima){
		System.out.println("Velocidade Maxima excedida");	
		}
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

}
