package herancaEx01;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Aviao aviao = new Aviao();
		
		System.out.println("Qual o tipo do avião: ");
		aviao.setTipo(leitor.nextLine());
		System.out.println("qual o codigo do avião: ");
		aviao.setCodigo(leitor.nextLine());
		System.out.println("Qual a capacidade: ");
		aviao.setCapacidade(leitor.nextInt());
		
		System.out.println("Avião tipo: " + aviao.getTipo() + "\nDe capacidade: " + aviao.getCapacidade() +
				"\nQue responde pelo código: " + aviao.getCodigo() );
		
		
		leitor.close();
	}

}
