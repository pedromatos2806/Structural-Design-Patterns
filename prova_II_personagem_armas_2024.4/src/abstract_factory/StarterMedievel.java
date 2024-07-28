package abstract_factory;

import builder.ArmaBuilder;
import builder.EspadaBuilder;
import builder.PersonagemBuilder;
import builder.SoldadoCruzadoBuilder;

public class StarterMedievel implements ComboPersonagemAbstractFactory {

	@Override
	public ArmaBuilder getArmaBuilder() {
		
		return new EspadaBuilder();
	}

	@Override
	public PersonagemBuilder getPersonagemBuilder() {
		return new SoldadoCruzadoBuilder();
	}

}