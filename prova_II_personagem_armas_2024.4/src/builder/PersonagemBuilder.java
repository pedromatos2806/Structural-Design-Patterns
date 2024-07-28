package builder;

import model.Arma;
import model.Personagem;

public interface PersonagemBuilder {
	
	public void reset();
	
	public Personagem getPersonagem();
	
	public void addArma(Arma arma);
}
