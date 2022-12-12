package abstractFactory;

public class TuboQualqer implements Tubo{
	private int diamentro;
	private int comprimento;

	
	public TuboQualqer(int diamentro, int comprimento) {
		super();
		this.diamentro = diamentro;
		this.comprimento = comprimento;
	}
	
	
	public TuboQualqer() {
		super();
	}






	public int getDiamentro() {
		return diamentro;
	}




	public void setDiamentro(int diamentro) {
		this.diamentro = diamentro;
	}




	public int getComprimento() {
		return comprimento;
	}




	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}



	//Calcula volume de qualquer tubo
	public double calculaVolumeTubo(int diametro, int comprimento) {
		// Calcula volume do tubo
		double volumeTubo = Math.PI*(Math.pow(this.diamentro/2,2))*this.comprimento;
		return volumeTubo;
	}
	

}
