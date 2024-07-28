package models;

public class Album extends AbstractObra implements Obra{

	private String gravadora;
	
	private String estudio;
	
	private String autor;
	
	private Double duracao;

	public String getGravadora() {
		return gravadora;
	}

	public String getEstudio() {
		return estudio;
	}

	public String getAutor() {
		return autor;
	}

	public Double getDuracao() {
		return duracao;
	}

	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return super.titulo;
	}

	@Override
	public Double getAno() {
		// TODO Auto-generated method stub
		return super.ano;
	}

	@Override
	public Double getAvaliacao() {
		// TODO Auto-generated method stub
		return super.avaliacao;
	}

}
