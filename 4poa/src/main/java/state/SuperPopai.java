package state;

public class SuperPopai implements State {

	public State comerEspinafre() {
		System.out.println("Comeu o espinafre: Invencivel!");
		return this;
	}

	public State brigarComPlutos() {
		System.out.println("Brigar com plutus: Derrota o Plutus");
		return this;
	}

	public String retornarTipo() {
		return "Popai Alterado";
	}

}
