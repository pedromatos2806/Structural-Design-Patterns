package decorator;

import model.Arma;
 /* 
  * A intenção desse Decorator é modificar a arma em tempo de execução fazendo com que 
  * essa arma aumente os atributos adicionais de cada uma!
  * 
  * 
  * */
public class ArmaDecorator implements Arma {
	private Arma arma;

	public ArmaDecorator(Arma arma) {
		this.arma = arma;
	}

	@Override
	public Double getAdicionalRapido() {
		return this.arma.getAdicionalRapido();
	}

	@Override
	public Double getAdicionalForca() {
		return this.arma.getAdicionalForca();
	}

	@Override
	public Double getAdicionalEspecial() {
		return this.arma.getAdicionalEspecial();
	}

	@Override
	public Boolean habilitada() {
		return this.arma.habilitada();
	}
}
