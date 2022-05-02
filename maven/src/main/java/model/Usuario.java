package model;

public class Usuario {
	private String nome;
	private String sobrenome;
	private String email;
	private int id;
	private String contato;
	
	public Usuario(String nome, String sobrenome, String email, int id, String contato) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.id = id;
		this.contato = contato;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
		
	public void setContato(String contato) {
		this.contato=contato;
	}
	
	public String getContato() {
		return this.contato;
	}
}
