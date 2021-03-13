package com.henrique;

public class Cliente {
	
	private String nome;
	private String hemail;
	private String telefone;
	private boolean ativo = false;
	
	public Cliente(String nome, String hemail, String telefone) {
		
		this.nome = nome;
		this.hemail = hemail;
		this.telefone = telefone;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getHemail() {
		return hemail;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public boolean isAtivo() {
		return ativo;
	}
	
	public void ativar() {
		this.ativo = true;
	}
}
