package composite;

public interface MateriaPrima {
	double circulo(int raio);
	int quadrado(int lado);
	int retangulo(int base, int altura);
	double losango(int diagonaMenor, int diagonalMaior);
	double estrela(int raio);
	int faixaSemiCircular();
	void cor();
}
