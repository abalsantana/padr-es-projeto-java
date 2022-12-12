package abstractFactory;

import java.text.DecimalFormat;
/*
 	O Abstract Factory define uma interface para criar todos os produtos distintos, 
 	mas deixa a criação real do produto para classes fábrica concretas. 
 	Cada tipo de fábrica corresponde a uma determinada variedade de produtos.
 	"Prover uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes
	concretas." [GoF]
 */

public class TesteVolumeTubos {

	public static void main(String[] args) {
		
		
		TuboQualqer t10 = new TuboQualqer();
		
		//Seta do diâmetro da tubulação 10 polegadas
		t10.setDiamentro(10);
		
		//Seta do comprimento de 20 metros
		t10.setComprimento(12);

		double volumeTubo10 = t10.calculaVolumeTubo(t10.getDiamentro(), t10.getComprimento());
		
		//Arredonda o numero com duas casas decimais
		DecimalFormat format = new DecimalFormat("#,##0.00");

		System.out.println("Volume do Tubo de " + t10.getDiamentro() + " polegadas: " + format.format(volumeTubo10) + " metros cúbicos");

	}

}
