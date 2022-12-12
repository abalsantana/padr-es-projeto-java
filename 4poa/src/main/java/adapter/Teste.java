package adapter;

/*O Padrão Adapter é muito importante pois permite que uma interface não compatível com outra sejam ligadas através de
 um adaptador. Muito utilizado quando se tem sistemas legados, onde um tipo de saída é diferente do tipo de entrada do sistema novo.
 "Objetivo: converter a interface de uma classe em outra
interface esperada pelos clientes. Adapter permite a
comunicação entre classes que não poderiam trabalhar
juntas devido à incompatibilidade de suas interfaces." [GoF]*/

public class Teste {

	public static void main(String[] args) {
		TomadaDeTresPinos t3 = new TomadaDeTresPinos();
		
		AdapterTomada b = new AdapterTomada(t3);
		b.ligarNaTomadaDeDoisPinos();
		
		

	}

}
