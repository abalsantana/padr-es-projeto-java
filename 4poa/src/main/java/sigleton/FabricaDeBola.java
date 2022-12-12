package sigleton;

public class FabricaDeBola {
	protected int totalBoloChocolate;
	protected int totalBoloLaranja;
	protected int totalBoloMaracuja;
	
	public static FabricaDeBola instancia;
	
	
	protected FabricaDeBola() {
	}
	

	public static FabricaDeBola getInstancia() {
		if(instancia==null) {
			instancia = new FabricaDeBola();
		}
		return instancia;
	}



	public static void setInstancia(FabricaDeBola instancia) {
		FabricaDeBola.instancia = instancia;
	}


	public String criarBoloChocolate() {
		return new String("Bolo de Chocolate criado.");
	}
	
	public String criarBoloLaranja() {
		return new String("Bolo de Laranja criado.");
	}
	
	public String criarBoloMaracuja() {
		return new String("Bolo de Maracujá criado."); 
	}
	
	
}
