package herancaEx03;

public class Carro {
	public int acelerar;
	public int frear;
	public int velocidade = 0;
	
	
	public int getAcelerar() {
		return acelerar;
	}
	public void setAcelerar(int acelerar) {
		this.acelerar = acelerar;
	}
	public int getFrear() {
		return frear;
	}
	public void setFrear(int frear) {
		this.frear = frear;
	}
	
	public int acelerar(String curva) {
		int velocidadeNova = this.velocidade + 5;
		System.out.println(velocidadeNova + " km");
		if(velocidadeNova > 70 && curva.equalsIgnoreCase("curva")) {
			System.out.println("O veiculo capotou");
		}		
		return velocidadeNova;
	}
	public void frear(int velocidadeNova) {
		velocidadeNova = this.velocidade - velocidade;
		System.out.println(velocidadeNova);
	}
		
}
