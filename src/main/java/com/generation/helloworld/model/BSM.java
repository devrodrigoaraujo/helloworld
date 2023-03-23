package com.generation.helloworld.model;

public class BSM {

	private String nome;

	public BSM(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


   @Override
	public String toString() {
		return "BSM: " + getNome();
}
}