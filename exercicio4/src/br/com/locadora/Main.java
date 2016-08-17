package br.com.locadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Filme fita = new Filme();
		Autor autor = new Autor();
		
		System.out.println("Digite o Titulo do filme.");
		fita.setTipo(leitor.nextLine());
		System.out.println("Digite o categoria do filme");
		fita.setCategoria(leitor.nextLine());
		System.out.println("Digite o tipo da fita");
		fita.setTipo(leitor.nextLine());
		System.out.println("Digite o preco da fita.");
		fita.setPreco(leitor.nextDouble());
		leitor.nextLine();
		
		System.out.println("Digite o autor da filme.");
		autor.setNome(leitor.nextLine());
		fita.setAutor(autor);
		
		System.out.println("Valor da locacao: " + fita.alugar(fita.getPreco(), fita.getTipo()));
		
		leitor.close();
		
	}

}
