package controller;

public class PilhaEstatica {
	Livro[] pilha = new Livro[7];
	private int topoPilha = -1;

	public boolean verificaPilhaVazia() {
		return (topoPilha == -1);
	}

	public int tamanhoPilha() {
		return topoPilha + 1;
	}

	public boolean pilhaCheia() {
		return (topoPilha == pilha.length - 1);
	}

	public void push(Livro novo) {
		if (pilhaCheia()) {
			System.out.println("Não é possível empilhar pois a pilha está cheia!");
		} else {
			topoPilha++;
			pilha[topoPilha] = novo;
			System.out.println("Livro empilhado com sucesso!");
		}
	}

	public Livro pop() {
		Livro livro = null;
		if (verificaPilhaVazia()) {
			System.out.println("Não é possível desempilhar pois a pilha está vazia!");
		} else {
			livro = pilha[topoPilha];
			pilha[topoPilha] = null;
			topoPilha--;
		}
		return livro;
	}

	public Livro getTopo() {
		Livro livro = null;
		if (verificaPilhaVazia()) {
			System.out.println("A pilha está vazia!");
		} else {
			livro = pilha[topoPilha];
		}
		return livro;
	}

}
