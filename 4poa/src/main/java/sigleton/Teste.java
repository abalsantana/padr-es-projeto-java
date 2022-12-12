package sigleton;

/*
 	O padrão Singleton garante que uma classe tenha apenas uma instância. E só pode ser instanciada dentro da própria classe.
 	"Garantir que uma classe só tenha uma única instância, e prover um ponto de acesso global a ela." [GoF]
*/
public class Teste {

	public static void main(String[] args) {

		FabricaDeBola fabricaBolo = new FabricaDeBola();
		

		System.out.println(fabricaBolo.criarBoloChocolate());
		System.out.println(fabricaBolo.criarBoloLaranja());
		System.out.println(fabricaBolo.criarBoloMaracuja());
		
		
	}

}
