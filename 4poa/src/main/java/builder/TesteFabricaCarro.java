package builder;

import java.util.List;

/*O Builder é um padrão de projeto criacional, que permite a construção de objetos complexos passo a passo.
Diferente de outros padrões de criação, o Builder não exige que os produtos tenham uma interface comum. 
Isso torna possível produzir produtos diferentes usando o mesmo processo de construção.
"Separar a construção de um objeto complexo de sua representação para que o mesmo processo de construção
possa criar representações diferentes." [GoF]
*/
public class TesteFabricaCarro {

	public static void main(String[] args) {
		
		Diretor diretor = new Diretor();
		
		CarroConstrutor carroConstrutor = new CarroConstrutor();
		//Diretor construiu um ônibus
		diretor.constroiCarroOnibus(carroConstrutor);
		
		//Criando o 1º carro
		Carro carro1 = carroConstrutor.pegaCarro();
		//Imprimindo o carro construído
		System.out.println("Carro1: " + carro1.toString());
		
		//Criando o 2º carro
		diretor.constroiCarroSport(carroConstrutor);
		Carro carro2 = carroConstrutor.pegaCarro();
		//Imprimindo o carro construído
		System.out.println("Carro2: " + carro2.toString());
		
		
	}

}
