package builder;

import model.Arma;
import model.Metralhadora;

public class MetralhadoraBuilder extends AbstractArmaBuilder implements ArmaBuilder {

	@Override
	public void reset() {
		this.danoAdicionalRapido = 20.0;
		this.danoAdicionalForca = 5.0;
		this.danoAdicionalEspecial = 50.0;
		this.habilitada = true;
		
	}

	@Override
	public void habilitar() {
		this.habilitada = true;
		
	}

	@Override
	public Arma getArma() {
		return new Metralhadora(this.danoAdicionalRapido, this.danoAdicionalForca, this.danoAdicionalEspecial, this.habilitada);
	}

}
