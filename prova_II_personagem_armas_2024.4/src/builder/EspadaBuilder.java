package builder;

import model.Arma;
import model.Espada;

public class EspadaBuilder extends AbstractArmaBuilder implements ArmaBuilder {

	@Override
	public void reset() {
		this.danoAdicionalRapido = 15.0;
		this.danoAdicionalForca = 20.0;
		this.danoAdicionalEspecial = 30.0;
		this.habilitada = false;
		
	}

	@Override
	public void habilitar() {
		this.habilitada = true;
		
	}

	@Override
	public Arma getArma() {
		return new Espada(this.danoAdicionalRapido, this.danoAdicionalForca, this.danoAdicionalEspecial, this.habilitada);
	}

}
