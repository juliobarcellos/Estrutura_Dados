package binaryTree;

public class ArvoreBinaria {
	private NoBinario raiz;

	public ArvoreBinaria() {
		raiz = null;
	}

	public void add(long valor) {
		NoBinario novo = new NoBinario();
		novo.valor = valor;
		novo.noDireito = null;
		novo.noEsquerdo = null;

		if (raiz == null)
			raiz = novo;
		else {
			NoBinario atual = raiz;
			NoBinario anterior;
			while (true) {
				anterior = atual;
				if (valor <= atual.valor) {
					atual = atual.noEsquerdo;
					if (atual == null) {
						anterior.noEsquerdo = novo;
						return;
					}
				} else {
					atual = atual.noDireito;
					if (atual == null) {
						anterior.noDireito = novo;
						return;
					}
				}
			}
		}

	}

	public NoBinario buscar(long valor) {
		if (raiz == null) {
			System.out.println("Árvore vazia!");
			return null;
		}
		NoBinario atual = raiz;
		while (atual.valor != valor) {
			if (valor < atual.valor)
				atual = atual.noEsquerdo;
			else
				atual = atual.noDireito;
			if (atual == null) {
				System.out.println("Valor não encontrado!");
				return null;
			}
		}
		System.out.println("No encontrado! Valor: \n" + atual.toString());
		return atual;
	}

	public boolean remover(long valor) {
		if (raiz == null)
			return false;

		NoBinario atual = raiz;
		NoBinario pai = raiz;
		boolean noEsquerdo = true;

		while (atual.valor != valor) {
			pai = atual;
			if (valor < atual.valor) {
				atual = atual.noEsquerdo;
				noEsquerdo = true;
			} else {
				atual = atual.noDireito;
				noEsquerdo = false;
			}
			if (atual == null)
				return false;
		}

		if (atual.noEsquerdo == null && atual.noDireito == null) {
			if (atual == raiz)
				raiz = null;
			else if (noEsquerdo)
				pai.noEsquerdo = null;
			else
				pai.noDireito = null;
		} else if (atual.noDireito == null) {
			if (atual == raiz)
				raiz = atual.noEsquerdo;
			else if (noEsquerdo)
				pai.noEsquerdo = atual.noEsquerdo;
			else
				pai.noDireito = atual.noEsquerdo;
		} else if (atual.noEsquerdo == null) {
			if (atual == raiz)
				raiz = atual.noDireito;
			else if (noEsquerdo)
				pai.noEsquerdo = atual.noDireito;
			else
				pai.noDireito = atual.noDireito;
		} else {
			NoBinario sucessor = no_sucessor(atual);
			if (atual == raiz)
				raiz = sucessor;
			else if (noEsquerdo)
				pai.noEsquerdo = sucessor;
			else
				pai.noDireito = sucessor;
			sucessor.noEsquerdo = atual.noEsquerdo;
		}

		return true;
	}

	private NoBinario no_sucessor(NoBinario n) {
		NoBinario paiDoSucessor = n;
		NoBinario sucessor = n;
		NoBinario atual = n.noDireito;

		while (atual != null) {
			paiDoSucessor = sucessor;
			sucessor = atual;
			atual = atual.noEsquerdo;
		}

		if (sucessor != n.noDireito) {
			paiDoSucessor.noEsquerdo = sucessor.noDireito;
			sucessor.noDireito = n.noDireito;
		}
		return sucessor;
	}

	public NoBinario getRaiz() {
		return this.raiz;
	}
}
