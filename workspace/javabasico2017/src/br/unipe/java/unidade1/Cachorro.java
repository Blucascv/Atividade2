package br.unipe.java.unidade1;

public class Cachorro {

	String nome;

	public void late() {
		System.out.println(this.nome + " latindo: Au Au");

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
