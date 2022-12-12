package builder;

public class CarroConstrutor implements Construtor{
	
	private TipoCarro tipoCarro;
	private int assentos;
	private Motor motor;
	private Tipo_Transmissao tipo_Transmissao;
	
		

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

	public void setaTipoCarro(TipoCarro carro) {
		this.tipoCarro = carro;
		
	}

	public void setaAssentos(int assento) {
		this.assentos = assento;
		
	}

	public void setaMotor(Motor motor) {
		this.motor = motor;
		
	}

	public void setaTransmissao(Tipo_Transmissao tipoTransmissao) {
		this.tipo_Transmissao = tipoTransmissao;
		
	}
	
	public Carro pegaCarro(){
		return new Carro(tipoCarro, assentos, motor, tipo_Transmissao);
	}


}
