package model;

public class Aluno {

	private String nome;
	private int idade;
	private char sexo;

	public Aluno(String nome, int idade, char sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return this.nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public char getSexo() {
		return this.sexo;
	}

}
