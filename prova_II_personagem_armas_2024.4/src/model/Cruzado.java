package model;

import java.util.List;

public class Cruzado implements Personagem {

	private List<Arma> armas;
	private Double ataqueRapido;
	private Double ataqueForca; 
	private Double ataqueEspecial;
	private Double defesa;
	private Double moedas;
	private Boolean habilidade;		
	
	public Cruzado(Double ataqueRapido, Double ataqueForca, 
			 Double ataqueEspecial, Double defesa,
			 Double moedas, Boolean habilidade, List<Arma> armas) {
		this.armas = armas;
		this.ataqueRapido =  ataqueRapido;
		this.ataqueForca = ataqueForca;
		this.ataqueEspecial = ataqueEspecial; 
		this.defesa = defesa;
		this.moedas = moedas;
		this.habilidade	= habilidade;
		this.armas = armas;		

	}	
	
	@Override
	public Double getAtaqueRapido() {
		return 0.0;
	}

	@Override
	public Double getAtaqueForca() {
		return 0.0;	
	}

	@Override
	public Double getAtaqueEspecial() {
		return 0.0;	
	}

	@Override
	public Double getDefesa() {
		return 0.0;	
	}
	
	public String toString() {
		return "Cruzado " + this.inicializadoCom()  + " com " +  this.armas.get(0);
	}
	
	public String inicializadoCom() {
		return "<AR = " + this.ataqueRapido + ", " + 
				"AF = " + this.ataqueForca + ", " + 
				"AE = " + this.ataqueEspecial + ", " + 
				"D = " + this.defesa + ", " +
				"$ = " +  this.moedas + 
				((this.habilidade) ? ", Com Habilidade" : "") + ">";
	}
	

}
