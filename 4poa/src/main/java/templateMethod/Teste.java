package templateMethod;

/*
 	O Teamplete Method, prevê o modelo de algoritmo para as classes e deixa que as subclasses extendam e complemente os métodos da forma que
 	for conveniente, sem deixar de usar o modelo proposto.
 	"Definir o esqueleto de um algoritmo dentro de uma
	operação, deixando alguns passos a serem preenchidos pelas
	subclasses. Template Method permite que suas subclasses
	redefinam certos passos de um algoritmo sem mudar sua
	estrutura." [GoF]
 */

public class Teste {

	public static void main(String[] args) {
		
		Aviao aviao = new Aviao();
		System.out.println(aviao.dirigir(true) + "\n" + aviao.abastecer());
		
		System.out.println("\n----------------------------------------\n");
		
		Carro carro = new Carro();
		System.out.println("Carro: " + carro.dirigir(true) + "\nTipo de Combustivel: " + carro.abastecer());

	}

}
