package br.com.exercicio2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Carro car = new Carro();
		
		System.out.println("Cor do carro: ");
		car.setCor(leitor.nextLine());
		System.out.println("Modelo do carro: ");
		car.setModelo(leitor.nextLine());
		car.setVelocidadeMaxima(59);
		car.ligar();
		car.setVelocidadeAtual(30);
		car.acelerar(30);
		
		leitor.close();
	}
	
	
}
