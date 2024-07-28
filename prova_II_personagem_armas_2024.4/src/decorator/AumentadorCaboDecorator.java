package decorator;

import model.Arma;

public class AumentadorCaboDecorator extends ArmaDecorator implements Arma{

	public AumentadorCaboDecorator(Arma arma) {
		super(arma);
	}
	
	@Override
	public Double getAdicionalRapido() {
		
		return this.getAdicionalRapido() + 15.0 ;
	}

	@Override
	public Double getAdicionalForca() {
		return this.getAdicionalForca() + 10.0;
	}

	@Override
	public Double getAdicionalEspecial() {
		return this.getAdicionalEspecial() + 5.0;
	}

	@Override
	public Boolean habilitada() {
		return this.habilitada();
	}
	
}
