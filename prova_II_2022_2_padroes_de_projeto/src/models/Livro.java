package models;

public class Livro extends AbstractObra implements Obra {
	
	private String editora;
	
	private String idioma;
	
	private String autor;
	
	private Double numeroPaginas;
	
	
	public String getEditora() {
		return this.editora;
	}
	public String getIdioma() {
		return this.idioma;
	}
	public String getAutor() {
		return this.autor;
	}
	public Double getNumeroPaginas() {
		return this.numeroPaginas;
	}
	@Override
	public String getTitulo() {
		return super.titulo;
	}
	@Override
	public Double getAno() {
		return super.ano;
	}
	@Override
	public Double getAvaliacao() {
		return super.avaliacao;
	}
	
	
}
