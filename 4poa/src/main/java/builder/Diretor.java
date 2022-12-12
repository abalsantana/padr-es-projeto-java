package builder;

public class Diretor {
	
		public void constroiCarroSport(Construtor construtor) {
			construtor.setaAssentos(3);
			construtor.setaMotor(Motor.MOTOR_TURBO_1000);
			construtor.setaTipoCarro(TipoCarro.HATCH);
			construtor.setaTransmissao(Tipo_Transmissao.AUTOMÁTICO);
		}
		
		public void constroiCarroOnibus(Construtor construtor) {
			construtor.setaAssentos(33);
			construtor.setaMotor(Motor.MOTOR2000);
			construtor.setaTipoCarro(TipoCarro.ÔNIBUS);
			construtor.setaTransmissao(Tipo_Transmissao.MANUAL);
		}
		
		public void constroiCarroPopulart(Construtor construtor) {
			construtor.setaAssentos(3);
			construtor.setaMotor(Motor.MOTOR1000);
			construtor.setaTipoCarro(TipoCarro.HATCH);
			construtor.setaTransmissao(Tipo_Transmissao.AUTOMÁTICO);
		}
		

}
