package herancaEx02;

public class Moto extends Veiculos{
	public int cilindradas;
	public String relacao;
	public int velocidade;
	
	public int getCilindradas() {
		return cilindradas;
	}
	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	public String getRelacao() {
		return relacao;
	}
	public void setRelacao(String relacao) {
		this.relacao = relacao;
	}
	
	public void motoAnda() {
		System.out.println("A moto esta andando!");;
	}
	public void motoPara() {
		System.out.println("A moto esta parada!");;
	}
	
	
	
}
