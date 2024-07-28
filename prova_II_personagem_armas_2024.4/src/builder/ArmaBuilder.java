package builder;

import model.Arma;

public interface ArmaBuilder {

	public void reset();

	public void habilitar();

	public Arma getArma();
}