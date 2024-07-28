package builder;

import model.Arma;
import model.Bacamarte;

public class BacamarteBuilder extends AbstractArmaBuilder implements ArmaBuilder {

	@Override
	public void reset() {
		this.danoAdicionalRapido = 15.0;
		this.danoAdicionalForca = 10.0;
		this.danoAdicionalEspecial = 40.0;
		this.habilitada = false;
		
	}

	@Override
	public void habilitar() {
		this.habilitada = true;
		
	}

	@Override
	public Arma getArma() {
		return new Bacamarte(this.danoAdicionalRapido, this.danoAdicionalForca, this.danoAdicionalEspecial, this.habilitada);
	}

}
