package abstract_factory;

import builder.ArmaBuilder;
import builder.PersonagemBuilder;

public interface ComboPersonagemAbstractFactory {
	
	public ArmaBuilder getArmaBuilder();
	
	public PersonagemBuilder getPersonagemBuilder();
}
