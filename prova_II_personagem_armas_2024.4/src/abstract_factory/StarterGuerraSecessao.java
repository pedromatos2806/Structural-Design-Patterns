package abstract_factory;

import builder.ArmaBuilder;
import builder.BacamarteBuilder;
import builder.PersonagemBuilder;
import builder.SoldadoGuerraSecessaoBuilder;

public class StarterGuerraSecessao implements ComboPersonagemAbstractFactory {

	@Override
	public ArmaBuilder getArmaBuilder() {
		
		return new BacamarteBuilder();
	}

	@Override
	public PersonagemBuilder getPersonagemBuilder() {
		return new SoldadoGuerraSecessaoBuilder();
	}

}