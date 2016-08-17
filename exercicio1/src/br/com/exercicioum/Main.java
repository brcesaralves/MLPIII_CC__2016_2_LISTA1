package br.com.exercicioum;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Fatura compra = new Fatura();
		System.out.println("Digite o numero da fatura");
		compra.setNumero(leitor.nextLine());
		System.out.println("Digite a descrição do produto");
		compra.setDescricao(leitor.nextLine());
		System.out.println("Quantidade de itens");
		compra.setQtdCompra(leitor.nextInt());
		System.out.println("Digite o Preco");
		compra.setPreco(leitor.nextDouble());
		
		System.out.println("         Fatura");
		System.out.println("Descricao: "+compra.getDescricao());
		System.out.println("Quantidade: "+compra.getQtdCompra());
		System.out.println("Preco: "+compra.getPreco());
		System.out.println("Total: "+ compra.getValorFatura(compra.getQtdCompra(), compra.getPreco()));
		
		leitor.close();
	}
}
