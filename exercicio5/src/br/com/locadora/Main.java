package br.com.locadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		VeiculoPasseio sandero =  new VeiculoPasseio();
		VeiculoCarga f5000 = new VeiculoCarga();
		Pessoa proprietario = new Pessoa();
		
		int test=0;
		
		Scanner leitor = new Scanner(System.in);
		
		int opcao;
		
		System.out.println("Digite o tipo de veiculo para locação");
		System.out.println("1 - Veiculo de Passeio");
		System.out.println("2 - Veiculo de Carga");
		opcao = leitor.nextInt();
		leitor.nextLine();
		
		switch (opcao) {
			case 1:
				System.out.println("Digite a placa do veiculo: ");
				sandero.setPlaca(leitor.nextLine());
				System.out.println("Digite a marca do veiculo: ");
				sandero.setMarca(leitor.nextLine());
				System.out.println("Digite o modelo do veiculo: ");
				sandero.setModelo(leitor.nextLine());
				System.out.println("Digite o ano do veiculo: ");
				sandero.setAno(leitor.nextInt());
				leitor.nextLine();
				System.out.println("Digite o KM inicial do veiculo: ");
				sandero.setKmInicial(leitor.nextDouble());
				System.out.println("Digite o KM final do veiculo: ");
				sandero.setKmFinal(leitor.nextDouble());
				System.out.println("Digite o valor do KM rodado: ");
				sandero.setValorKmRodado(leitor.nextDouble());
				leitor.nextLine();
				System.out.println("Digite o chassi do veiculo:");
				sandero.setChassi(leitor.nextLine());
										
				System.out.println("Digite o nome do proprietario:");
				proprietario.setNome(leitor.nextLine());
				System.out.println("Digite o CPF do proprietario:");
				proprietario.setCpf(leitor.nextLine());
				System.out.println("Digite a CNH do proprietario:");
				proprietario.setCnh(leitor.nextLine());
				sandero.setProprietario(proprietario);
				
				System.out.println("Quantas portas possui o veiculo: ");
				sandero.setPortas(leitor.nextInt());
				
				System.out.println("O veiculo possui Ar-Condicionado:");
				System.out.println("1 - sim");
				System.out.println("2 - não");
				
				if(leitor.nextInt() == 1){
					sandero.setArCondicionado(true);
				} else if(leitor.nextInt() == 2){
					sandero.setArCondicionado(false);
				}
				
				System.out.println("VEICULO: " + sandero.getModelo() + " - " + sandero.getPlaca());
				System.out.println("PROPRIETARIO: " + sandero.getProprietario().getNome());
				System.out.println("TOTAL: " + sandero.calculaValorLocacao());
				break;
				
			case 2:
				System.out.println("Digite a placa do veiculo: ");
				f5000.setPlaca(leitor.nextLine());
				System.out.println("Digite a marca do veiculo: ");
				f5000.setMarca(leitor.nextLine());
				System.out.println("Digite o modelo do veiculo: ");
				f5000.setModelo(leitor.nextLine());
				System.out.println("Digite o ano do veiculo: ");
				f5000.setAno(leitor.nextInt());
				leitor.nextLine();
				System.out.println("Digite o KM inicial do veiculo: ");
				f5000.setKmInicial(leitor.nextDouble());
				System.out.println("Digite o KM final do veiculo: ");
				f5000.setKmFinal(leitor.nextDouble());
				System.out.println("Digite o valor do KM rodado: ");
				f5000.setValorKmRodado(leitor.nextDouble());
				leitor.nextLine();
				System.out.println("Digite o chassi do veiculo:");
				f5000.setChassi(leitor.nextLine());
										
				System.out.println("Digite o nome do proprietario:");
				proprietario.setNome(leitor.nextLine());
				System.out.println("Digite o CPF do proprietario:");
				proprietario.setCpf(leitor.nextLine());
				System.out.println("Digite a CNH do proprietario:");
				proprietario.setCnh(leitor.nextLine());
				f5000.setProprietario(proprietario);
				
				System.out.println("Qual a capacidade de carga do veiculo: ");
				f5000.setCapacidadeCarga(leitor.nextDouble());
				
				System.out.println("VEICULO: " + sandero.getModelo() + " - " + sandero.getPlaca());
				System.out.println("PROPRIETARIO: " + sandero.getProprietario().getNome());
				System.out.println("TOTAL: " + sandero.calculaValorLocacao());
				break;
	
			default:
				break;
		}
				
		leitor.close();
	}

}
