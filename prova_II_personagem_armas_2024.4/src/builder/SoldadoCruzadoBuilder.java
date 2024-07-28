package builder;

import java.util.ArrayList;

import model.Arma;
import model.Cruzado;
import model.Personagem;

public class SoldadoCruzadoBuilder extends AbstractPersonagemBuilder implements PersonagemBuilder{

	@Override
	public void reset() {
		this.ataqueRapido = 10.0; 
		this.ataqueForca= 50.0; 
		this.ataqueEspecial = 100.0;
		this.defesa = 150.0;
		this.moedas = 100.0;
		this.habilidade = false;
		this.armas = new ArrayList<Arma>();
		
	}

	@Override
	public Personagem getPersonagem() {
		 return new Cruzado(this.ataqueRapido, this.ataqueForca
				 , this.ataqueEspecial, this.defesa
				 , this.moedas, this.habilidade, this.armas);
	}

	@Override
	public void addArma(Arma arma) {
		this.armas.add(arma);
		
	}

}