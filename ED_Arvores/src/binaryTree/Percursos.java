package binaryTree;

public class Percursos {
	public void caminhar(NoBinario raiz) {
		System.out.print("\n Exibindo em ordem: ");
		inOrder(raiz);
		System.out.print("\n Exibindo em pos-ordem: ");
		posOrder(raiz);
		System.out.print("\n Exibindo em pre-ordem: ");
		preOrder(raiz);
		System.out.print("\n Altura da arvore: " + altura(raiz));
		System.out.print("\n Quantidade de folhas: " + folhas(raiz));
		System.out.print("\n Quantidade de Nós: " + contarNos(raiz));
		if (raiz != null) {
			System.out.print("\n Valor minimo: " + min(raiz).valor);
			System.out.println("\n Valor maximo: " + max(raiz).valor);
		}
	}

	public void inOrder(NoBinario atual) {
		if (atual != null) {
			inOrder(atual.noEsquerdo);
			System.out.print(atual.valor + " ");
			inOrder(atual.noDireito);
		}
	}

	public void preOrder(NoBinario atual) {
		if (atual != null) {
			System.out.print(atual.valor + " ");
			preOrder(atual.noEsquerdo);
			preOrder(atual.noDireito);
		}
	}

	public void posOrder(NoBinario atual) {
		if (atual != null) {
			posOrder(atual.noEsquerdo);
			posOrder(atual.noDireito);
			System.out.print(atual.valor + " ");
		}
	}

	public int altura(NoBinario atual) {
		if (atual == null || (atual.noEsquerdo == null && atual.noDireito == null))
			return 0;
		else {
			if (altura(atual.noEsquerdo) > altura(atual.noDireito))
				return (1 + altura(atual.noEsquerdo));
			else
				return (1 + altura(atual.noDireito));
		}
	}

	public int folhas(NoBinario atual) {
		if (atual == null)
			return 0;
		if (atual.noEsquerdo == null && atual.noDireito == null)
			return 1;
		return folhas(atual.noEsquerdo) + folhas(atual.noDireito);
	}

	public int contarNos(NoBinario atual) {
		if (atual == null)
			return 0;
		else
			return (1 + contarNos(atual.noEsquerdo) + contarNos(atual.noDireito));
	}

	public NoBinario min(NoBinario raiz) {
		NoBinario atual = raiz;
		NoBinario anterior = null;
		while (atual != null) {
			anterior = atual;
			atual = atual.noEsquerdo;
		}
		return anterior;
	}

	public NoBinario max(NoBinario raiz) {
		NoBinario atual = raiz;
		NoBinario anterior = null;
		while (atual != null) {
			anterior = atual;
			atual = atual.noDireito;
		}
		return anterior;
	}
}
