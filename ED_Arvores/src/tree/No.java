package tree;

import java.util.ArrayList;
import java.util.List;

public class No<T> {
	private List<No<T>> folhas = new ArrayList<No<T>>();
	private No<T> pai = null;
	private T dados = null;

	public No(T dados) {
		this.dados = dados;
	}

	public No(T dados, No<T> pai) {
		this.dados = dados;
		this.pai = pai;
		pai.addFolha(this);
	}

	public List<No<T>> getFolhas() {
		return folhas;
	}

	public No<T> getPai() {
		return this.pai;
	}

	public void setPai(No<T> folha) {
		this.pai = folha;
	}

	public void addFolha(T dados) {
		No<T> folha = new No<>(dados);
		this.addFolha(folha);
	}

	public void addFolha(No<T> folha) {
		folha.setPai(this);
		this.folhas.add(folha);
	}

	public void addFolhas(List<No<T>> folhas) {
		for (No<T> n : folhas) {
			n.setPai(this);
		}
		this.folhas.addAll(folhas);
	}

	public T getDados() {
		return this.dados;
	}

	public void setDados(T dados) {
		this.dados = dados;
	}

	public boolean ehRaiz() {
		return (this.pai == null);
	}

	public boolean ehFolha() {
		return this.folhas.size() == 0;
	}

	public void removePai() {
		this.pai = null;
	}
}