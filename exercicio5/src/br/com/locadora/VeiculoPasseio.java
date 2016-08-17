package br.com.locadora;

public class VeiculoPasseio extends Veiculo{
	private boolean arCondicionado;
	private int portas;
	
	public boolean isArCondicionado() {
		return arCondicionado;
	}
	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	
}
