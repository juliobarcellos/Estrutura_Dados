package model;

public class Aluno {

	private String Nome;
	private int Idade;
	private char Sexo;
	
	public Aluno(String nome, int idade, char sexo) {
		this.Nome = nome;
		this.Idade = idade;
		this.Sexo = sexo;
	}
	
	public String getNome() {
		return this.Nome;
	}
	
	public int getIdade() {
		return this.Idade;
	}
	
	public char getSexo() {
		return this.Sexo;
	}
	
}
