package state;

public class Popai implements State{

	public State comerEspinafre() {
		System.out.println("Comeu o espinafre: Tornou-se SuperPopai!");
		return new SuperPopai();
	}

	public State brigarComPlutos() {
		System.out.println("Popai é derrotado por Plutus!");
		return new PopaiDerrotado();
	}

	public String retornarTipo() {
		return "Popai normal!";
	}

}
