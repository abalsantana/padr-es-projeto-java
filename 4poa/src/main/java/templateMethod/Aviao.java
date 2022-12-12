package templateMethod;

public class Aviao extends Veiculo{
	boolean on_off = false;
	String combustivel = "Querosene de aviacao.";
	String manete = "Empurrar manete para frente...";
	String flap = "Baixar o flap...";
	


	@Override
	protected String dirigir(boolean on_off) {
		if(on_off == true) {
			return new String("Primeiros passo: " + "\n" + manete + "\n" + flap + "\nDecolando...");
		}
		return new String("Avião desligado.");
	}

	@Override
	protected String abastecer() {
		return new String("Tipo de combustível:" + combustivel);
	}

}
