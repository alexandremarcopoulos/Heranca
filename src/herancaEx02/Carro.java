package herancaEx02;

public class Carro extends Veiculos {
	public int portas;
	public int lugares;
	
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	public int getLugares() {
		return lugares;
	}
	public void setLugares(int lugares) {
		this.lugares = lugares;
	}
	public void carroAnda() {
		System.out.println("O carro esta andando!");
	}
	public void carroPara() {
		System.out.println("O carro esta parado!");
	}
	
}
