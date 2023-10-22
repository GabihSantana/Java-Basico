
public class Carro extends Veiculo{
	
	public void ligar() {
		confereCambio();
		confereCombustível();
		System.out.println("CARRO LIGADO");
	}
	private void confereCombustível() {
		System.out.println("Conferindo Combustível");
	}
	private void confereCambio() {
		System.out.println("Conferindo Cambio em P");
	}
}
