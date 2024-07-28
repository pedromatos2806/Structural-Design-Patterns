package main;

import abstract_factory.*;
import builder.ArmaBuilder;
import builder.PersonagemBuilder;
import director.PersonagemDirector;
import model.Personagem;

public class App {
	public void run (ComboPersonagemAbstractFactory comboPersonagemAbstractFactory) {
		
		PersonagemBuilder personagemBuilder = comboPersonagemAbstractFactory.getPersonagemBuilder();
		ArmaBuilder armaBuilder = comboPersonagemAbstractFactory.getArmaBuilder();
		PersonagemDirector director = new PersonagemDirector(personagemBuilder, armaBuilder);
		director.criarStarter();
		Personagem personagem = personagemBuilder.getPersonagem();
		System.out.println(personagem);
	}
	
	public static void main(String[] args) {
		App app = new App();
		
		app.run(new StarterMedievel());
		app.run(new StarterGuerraSecessao());
		app.run(new StarterGuerraGolfo());

	}
}
