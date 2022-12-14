package prototype;

/*
 * Cria clones dos objetos a partir de um protótipo.
 	"Especificar os tipos de objetos a serem criados usando uma
instância como protótipo e criar novos objetos ao copiar
este protótipo." [GoF]
 */

public class Teste {
	public static void main(String args[]) throws CloneNotSupportedException {

	    Carro chevrolet = new Chevrolet("Cruze Sport v6");
	    chevrolet.preco = 100000;
	    Carro ford = new Ford("Focus 2.0");
	    ford.preco=500000;

	    Carro bc1;
	    //Clone do Objeto Chevrolet
	    bc1 = chevrolet.clone();

	    //Configurando preço que será maior que 100000
	    bc1.preco = chevrolet.preco + Carro.setPreco();
	    System.out.println("Nome do Carro: "+ bc1.getNomeModelo() + ", Preço do Carro: " + bc1.preco);

	    //Clone do Objeto Ford
	    bc1 = ford.clone();

	    //Configurando preço que será maior que 500000
	    bc1.preco = ford.preco + Carro.setPreco();
	    System.out.println("Nome do Carro: " + bc1.getNomeModelo() + ", Preço do Carro: " + bc1.preco);

	 }

}
