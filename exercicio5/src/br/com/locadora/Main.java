package br.com.locadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Veiculo veiculoPasseio =  new VeiculoPasseio();
		VeiculoCarga veiculoCarga = new VeiculoCarga();
		Pessoa proprietario = new Pessoa();
		
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
				veiculoPasseio.setPlaca(leitor.nextLine());
				System.out.println("Digite a marca do veiculo: ");
				veiculoPasseio.setMarca(leitor.nextLine());
				System.out.println("Digite o modelo do veiculo: ");
				veiculoPasseio.setModelo(leitor.nextLine());
				System.out.println("Digite o ano do veiculo: ");
				veiculoPasseio.setAno(leitor.nextInt());
				leitor.nextLine();
				System.out.println("Digite o KM inicial do veiculo: ");
				veiculoPasseio.setKmInicial(leitor.nextDouble());
				System.out.println("Digite o KM final do veiculo: ");
				veiculoPasseio.setKmFinal(leitor.nextDouble());
				System.out.println("Digite o valor do KM rodado: ");
				veiculoPasseio.setValorKmRodado(leitor.nextDouble());
				leitor.nextLine();
				System.out.println("Digite o chassi do veiculo:");
				veiculoPasseio.setChassi(leitor.nextLine());
										
				System.out.println("Digite o nome do proprietario:");
				proprietario.setNome(leitor.nextLine());
				System.out.println("Digite o CPF do proprietario:");
				proprietario.setCpf(leitor.nextLine());
				System.out.println("Digite a CNH do proprietario:");
				proprietario.setCnh(leitor.nextLine());
				veiculoPasseio.setProprietario(proprietario);
				
				System.out.println("Quantas portas possui o veiculo: ");
				veiculoPasseio.setPortas(leitor.nextInt());
				
				System.out.println("O veiculo possui Ar-Condicionado:");
				System.out.println("1 - sim");
				System.out.println("2 - não");
				
				if(leitor.nextInt() == 1){
					veiculoPasseio.setArCondicionado(true);
				} else if(leitor.nextInt() == 2){
					veiculoPasseio.setArCondicionado(false);
				}
				
				System.out.println("VEICULO: " + veiculoPasseio.getModelo() + " - " + veiculoPasseio.getPlaca());
				System.out.println("PROPRIETARIO: " + veiculoPasseio.getProprietario().getNome());
				System.out.println("TOTAL: " + veiculoPasseio.calculaValorLocacao());
				break;
				
			case 2:
				System.out.println("Digite a placa do veiculo: ");
				veiculoCarga.setPlaca(leitor.nextLine());
				System.out.println("Digite a marca do veiculo: ");
				veiculoCarga.setMarca(leitor.nextLine());
				System.out.println("Digite o modelo do veiculo: ");
				veiculoCarga.setModelo(leitor.nextLine());
				System.out.println("Digite o ano do veiculo: ");
				veiculoCarga.setAno(leitor.nextInt());
				leitor.nextLine();
				System.out.println("Digite o KM inicial do veiculo: ");
				veiculoCarga.setKmInicial(leitor.nextDouble());
				System.out.println("Digite o KM final do veiculo: ");
				veiculoCarga.setKmFinal(leitor.nextDouble());
				System.out.println("Digite o valor do KM rodado: ");
				veiculoCarga.setValorKmRodado(leitor.nextDouble());
				leitor.nextLine();
				System.out.println("Digite o chassi do veiculo:");
				veiculoCarga.setChassi(leitor.nextLine());
										
				System.out.println("Digite o nome do proprietario:");
				proprietario.setNome(leitor.nextLine());
				System.out.println("Digite o CPF do proprietario:");
				proprietario.setCpf(leitor.nextLine());
				System.out.println("Digite a CNH do proprietario:");
				proprietario.setCnh(leitor.nextLine());
				veiculoCarga.setProprietario(proprietario);
				
				System.out.println("Qual a capacidade de carga do veiculo: ");
				veiculoCarga.setCapacidadeCarga(leitor.nextDouble());
				
				System.out.println("VEICULO: " + veiculoCarga.getModelo() + " - " + veiculoCarga.getPlaca());
				System.out.println("PROPRIETARIO: " + veiculoCarga.getProprietario().getNome());
				System.out.println("TOTAL: " + veiculoCarga.calculaValorLocacao());
				break;
	
			default:
				break;
		}
				
		leitor.close();
	}

}
