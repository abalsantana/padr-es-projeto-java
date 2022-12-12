package state;

public class PopaiDerrotado implements State {

	public State comerEspinafre() {
		System.out.println("Comeu o espinafre: Tornou-se SuperPopai!");
		return new SuperPopai();
	}

	public State brigarComPlutos() {
		System.out.println("Brigar com Plutus: Popai derrotado!");
		return new Popai();
	}

	public String retornarTipo() {
		return "Popai triste!";
	}

}
