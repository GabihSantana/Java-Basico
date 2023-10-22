
public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("12542");
		jeep.ligar();
		
		Moto z400 = new Moto();
		z400.setChassi("13432");
		
		z400.ligar();
		
		Veiculo coringa = jeep;
		coringa.ligar();
	}
}
