package builder;

public class Carro {
	private TipoCarro tipoCarro;
	private int assentos;
	private Motor motor;
	private Tipo_Transmissao tipo_Transmissao;
	

	public Carro(TipoCarro tipoCarro, int assentos, Motor motor, Tipo_Transmissao tipo_Transmissao) {
		super();
		this.tipoCarro = tipoCarro;
		this.assentos = assentos;
		this.motor = motor;
		this.tipo_Transmissao = tipo_Transmissao;
	}


	public TipoCarro getTipoCarro() {
		return tipoCarro;
	}


	public void setTipoCarro(TipoCarro tipoCarro) {
		this.tipoCarro = tipoCarro;
	}


	public int getAssentos() {
		return assentos;
	}


	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}


	public Motor getMotor() {
		return motor;
	}


	public void setMotor(Motor motor) {
		this.motor = motor;
	}


	public Tipo_Transmissao getTipo_Transmissao() {
		return tipo_Transmissao;
	}


	public void setTipo_Transmissao(Tipo_Transmissao tipo_Transmissao) {
		this.tipo_Transmissao = tipo_Transmissao;
	}


	@Override
	public String toString() {
		return "Carro [tipoCarro=" + tipoCarro + ", assentos=" + assentos + ", motor=" + motor + ", tipo_Transmissao="
				+ tipo_Transmissao + "]";
	}
	
	
	
}
