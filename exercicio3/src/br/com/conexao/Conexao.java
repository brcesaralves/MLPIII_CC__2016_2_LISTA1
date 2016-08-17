package br.com.conexao;

public class Conexao {
	private static Conexao unicaInstancia;
	
	private Conexao (){
		
	}
	public static Conexao getInstancia(){
		if(unicaInstancia == null){
			System.out.println("nao");
			unicaInstancia = new Conexao();
			System.out.println("ok");
		}else
			System.out.println("Não instanciado");
		return unicaInstancia;
	}

}
