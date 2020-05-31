package herancaEx03;

import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Carro car = new Carro();
		Scanner leitor = new Scanner(System.in);
		char andarFrear;
		String terreno;
		int velocidadeControle = 0;
		
		
		System.out.println("O carro esta pardo");
		System.out.println("Digite se o carro irá para uma curva, subida, reta");
		terreno = leitor.nextLine();
		System.out.println("Digite a velocidade atual do carro");
		car.setAcelerar(leitor.nextInt());
		System.out.println("Digite um 1 para acelerar e 2 para frear.");
		andarFrear = leitor.next().charAt(0);
		
		if(andarFrear == 1) {
			velocidadeControle = car.acelerar(terreno);
		}
		else {
			car.frear(velocidadeControle);
		}
		
		
		leitor.close();
	}
}
