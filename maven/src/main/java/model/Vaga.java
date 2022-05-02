package model;

public class Vaga {
	private String titulo;
	private String descricao;
	private String requisitos;
	private String categoriaTrabalho;
	private String salario;
	
	
	public Vaga(String titulo, String descricao, String requisitos, String categoriaTrabalho, String salario) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.requisitos = requisitos;
		this.categoriaTrabalho = categoriaTrabalho;
		this.salario = salario;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getRequisitos() {
		return requisitos;
	}
	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}
	public String getCategoriaTrabalho() {
		return categoriaTrabalho;
	}
	public void setCategoriaTrabalho(String categoriaTrabalho) {
		this.categoriaTrabalho = categoriaTrabalho;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
 
}
