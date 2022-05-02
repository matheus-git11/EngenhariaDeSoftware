package model;

public class Mensagem {
 private String texto;
 private String remetente;
 private String destinatario;
 private String dia;
 
 public String getTexto() {
	return texto;
}
public void setTexto(String texto) {
	this.texto = texto;
}
public String getRemetente() {
	return remetente;
}
public void setRemetente(String remetente) {
	this.remetente = remetente;
}
public String getDestinatario() {
	return destinatario;
}
public void setDestinatario(String destinatario) {
	this.destinatario = destinatario;
}
public String getDia() {
	return dia;
}
public void setDia(String dia) {
	this.dia = dia;
}
public int getHora() {
	return hora;
}
public void setHora(int hora) {
	this.hora = hora;
}
private int hora;
}
