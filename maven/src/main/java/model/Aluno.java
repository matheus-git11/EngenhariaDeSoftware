package model;

import java.util.LinkedList;

public class Aluno extends Usuario {
	
	private String cpf;
	private String enderešo;
	private String idade;
	private String curriculo;
	private LinkedList<String> dados;
	private String tokenCoordenador;
	


	public Aluno(String nome, String sobrenome, String email, int id, String contato, String cpf, String enderešo,
			String idade, String curriculo ,String token) {
		super(nome, sobrenome, email, id, contato);
		this.cpf = cpf;
		this.enderešo = enderešo;
		this.idade = idade;
		this.curriculo = curriculo;
		this.dados = new LinkedList<String>();
		this.tokenCoordenador=token;
		
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getEnderešo() {
		return enderešo;
	}



	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}



	public String getIdade() {
		return idade;
	}



	public void setIdade(String idade) {
		this.idade = idade;
	}



	public String getCurriculo() {
		return curriculo;
	}



	public void setCurriculo(String curriculo) {
		this.curriculo = curriculo;
	}



	public LinkedList<String> getDados() {
		return dados;
	}



	public void setDados(String dados) {
		this.dados.add(dados);
	}



	public String getTokenCoordenador() {
		return tokenCoordenador;
	}



	public void seTtokenCoordenador(String token) {
		this.tokenCoordenador = token;
	}
 
}
