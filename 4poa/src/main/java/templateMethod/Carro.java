package templateMethod;

public class Carro extends Veiculo{
	boolean on_off = false;
	String combustivel = "Gasolina Aditivada";
	String passo1 = "Após ligado, passar marcha primeira...";
	String passo2 = "Retirando o pé da embreagem...";
	String passo3 = "Dirigindo...";
	
	@Override
	protected String dirigir(boolean on_off) {
		if(on_off == true) {
			return new String("Primeiros passos: " + "\n" + passo1 + "\n" + passo2 + "\n" + passo3);
		}
		return new String("Carro desligado.");
	}

	@Override
	protected String abastecer() {
		return new String(combustivel);
	}

}
