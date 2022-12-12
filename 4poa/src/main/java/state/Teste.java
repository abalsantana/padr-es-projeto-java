package state;

public class Teste {
	
	/*
	 	O padrão State, pemite mudar o comportamento do objeto quando seu estado mudar. Isso é importante para evitar alguns problemas
	 	comuns em códigos, com a implementação de vários ifs e else's bem como a criação de enum's dificultando a legibilidade do mesmo.
	 	
	*/
	public static void main(String[] args) {
		
		State popai = new Popai();
		
		popai = popai.brigarComPlutos();
		
		popai = popai.comerEspinafre();
		
		System.out.println(popai.retornarTipo());
		
		popai = popai.brigarComPlutos();
		
		System.out.println(popai.retornarTipo());
		
		popai = popai.comerEspinafre();
		
		System.out.println(popai.retornarTipo());
		
		popai = popai.brigarComPlutos();
		
		System.out.println(popai.retornarTipo());
		
		popai = popai.comerEspinafre();
		
		System.out.println(popai.retornarTipo());
	}

}
