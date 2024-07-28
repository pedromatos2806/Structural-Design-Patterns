package abstract_factory;
import builder.ArmaBuilder;
import builder.MetralhadoraBuilder;
import builder.PersonagemBuilder;
import builder.SoldadoGuerraGolfoBuilder;

public class StarterGuerraGolfo implements ComboPersonagemAbstractFactory {

	@Override
	public ArmaBuilder getArmaBuilder() {
		
		return new MetralhadoraBuilder();
	}

	@Override
	public PersonagemBuilder getPersonagemBuilder() {
		return new SoldadoGuerraGolfoBuilder();
	}

}