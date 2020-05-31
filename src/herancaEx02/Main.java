package herancaEx02;

import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner leitor = new Scanner(System.in);
		Veiculos veiculo = new Veiculos();
		Carro carro = new Carro();
		Moto moto = new Moto();
		
		System.out.println("Digite o tipo do veiculo: ");
		veiculo.setTipo(leitor.nextLine());
		
		
		if (veiculo.getTipo().equalsIgnoreCase("Carro")) {
			carro.carroPara();
			System.out.println("Digite a cor do carro: ");
			carro.setCor(leitor.nextLine());
			System.out.println("Digite a placa do carro: ");
			carro.setPlaca(leitor.nextLine());
			System.out.println("Digite o numero de portas do carro: ");
			carro.setPortas(leitor.nextInt());
			System.out.println("Digite a quantidade de rodas do veiculo: ");
			veiculo.setRodas(leitor.nextInt());
			carro.carroPara();
			
			System.out.println("A cor do carro é: " + carro.getCor() +
					"\nA placa do carro corresponde á: " + carro.getPlaca() +
					"\nO carro tem " + carro.getPortas() + " portas." + 
					"\nO carro tem " + carro.getRodas() + " rodas.");
			
		}
		else {
			moto.motoPara();
			System.out.println("Digite a cor da moto: ");
			moto.setCor(leitor.nextLine());
			System.out.println("Digite a placa da moto: ");
			moto.setPlaca(leitor.nextLine());
			System.out.println("Digite a relação da moto (Correia, corrente, cardan, etc.):");
			moto.setRelacao(leitor.nextLine());
			moto.motoAnda();
			
			System.out.println("A cor da moto é " + moto.getCor() + 
					"\nA placa da moto corresponde á: " + moto.getPlaca() +
					"\nE sua relação é do tipo: " + moto.getRelacao());
			
		}
		
		
		leitor.close();
	}
}
