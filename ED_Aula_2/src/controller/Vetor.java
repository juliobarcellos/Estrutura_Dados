package controller;

import model.Aluno;

public class Vetor {
	private Object[] objetos = new Object[100];
	private int totaldeObjetos = 0;

	public void adiciona(Object objeto) {
		this.garantaEspaco();
		this.objetos[this.totaldeObjetos] = objeto;
		this.totaldeObjetos++;
	}

	public void adiciona(int posicao, Aluno aluno) {
		this.garantaEspaco();
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inválida!");
		}

		for (int i = this.totaldeObjetos; i >= posicao; i--) {
			this.objetos[i + 1] = this.objetos[i];
		}

		this.objetos[posicao] = aluno;
		this.totaldeObjetos++;
	}

	public Object pega(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição Inválida!");
		}
		return this.objetos[posicao];
	}

	public void remove(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição Inválida!");
		}
		for (int i = posicao; i < this.totaldeObjetos; i++) {
			this.objetos[i] = this.objetos[i + 1];
		}
		this.totaldeObjetos--;
	}

	public boolean contem(Aluno aluno) {
		for (int i = 0; i < this.totaldeObjetos; i++) {
			if (aluno.equals(this.objetos[i])) {
				return true;
			}
		}
		return false;
	}

	public int tamanho() {
		return this.totaldeObjetos;
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totaldeObjetos;
	}

	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao < this.totaldeObjetos;
	}

	private void garantaEspaco() {
		if (this.totaldeObjetos == this.objetos.length) {
			Object[] novaArray = new Object[this.objetos.length * 2];
			for (int i = 0; i < this.objetos.length; i++) {
				novaArray[i] = this.objetos[i];
			}
			this.objetos = novaArray;
		}
	}

	public void mostraLista() {
		for (int i = 0; i < this.totaldeObjetos; i++) {
			Aluno aluno = (Aluno) objetos[i];
			System.out.println("Aluno " + i + ":\nNome: " + aluno.getNome() + "\nIdade: " + aluno.getIdade()
					+ "\nSexo: " + aluno.getSexo() + "\n");
		}
	}

	public void mostraLista(int posicao) {
		Aluno aluno = (Aluno) this.pega(posicao);
		System.out.println("Aluno " + posicao + ":\nNome: " + aluno.getNome() + "\nIdade: " + aluno.getIdade()
				+ "\nSexo: " + aluno.getSexo() + "\n");
	}

}
