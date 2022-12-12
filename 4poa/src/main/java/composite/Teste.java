package composite;

public class Teste {

	public static void main(String[] args) {
		
		Bandeira bandeira = new Bandeira();
		bandeira.circulo(3);
		bandeira.estrela(3);
		bandeira.faixaSemiCircular();
		bandeira.losango(6, 3);
		bandeira.quadrado(10);
		bandeira.cor();
		bandeira.retangulo(6, 4);
		
		System.out.println(bandeira.toString());
		

	}

}
