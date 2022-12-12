package composite;

public class Bandeira implements MateriaPrima{

	public double circulo(int raio) {
		// cálculo da área do círculo
		return Math.PI*(Math.pow(raio, 2));
	}

	public int quadrado(int lado) {
		//Cálculo da área do quadrado
		return (int) Math.pow(lado, 2);
	}

	public int retangulo(int base, int altura) {
		// Cálculo da área do retângulo
		return base * altura;
	}

	public double losango(int D, int d) {
		// área do losango
		return (D * d)/2;
	}

	public double estrela(int raio) {
		// Área da estrela
		return Math.pow((4 * Math.PI * raio),2);
	}

	public int faixaSemiCircular() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void cor() {
		// TODO Auto-generated method stub
		System.out.println("Cor amarela");
	}


}
