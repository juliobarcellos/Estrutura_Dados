package view;

import controller.Livro;
import controller.PilhaEstatica;

public class PrincipalPilhaEstatica {
	public static void main(String[] args) {
		PilhaEstatica pilha = new PilhaEstatica();

		System.out.println("Tamanho atual da pilha: " + pilha.tamanhoPilha());

		Livro l1 = new Livro(10, "O Senhor dos Anéis", "J.R.R. Tolkien", 129.9);
		Livro l2 = new Livro(20, "O Hobbit", "J.R.R. Tolkien", 39.9);
		Livro l3 = new Livro(30, "O Silmarillion", "J.R.R. Tolkien", 35.9);
		Livro l4 = new Livro(40, "Os Filhos de Húrin", "J.R.R. Tolkien", 22.0);
		Livro l5 = new Livro(50, "Contos Inacabados", "J.R.R. Tolkien", 45.5);
		Livro l6 = new Livro(60, "A Queda de Gondolin", "J.R.R. Tolkien", 39.9);
		Livro l7 = new Livro(70, "Beren e Luthien", "J.R.R. Tolkien", 39.9);
		Livro l8 = new Livro(80, "Árvore e Folha", "J.R.R. Tolkien", 15.5);

		pilha.push(l1);
		pilha.push(l2);
		pilha.push(l3);
		pilha.push(l4);
		pilha.push(l5);

		System.out.println("Tamanho atual da pilha: " + pilha.tamanhoPilha());

		pilha.push(l6);
		pilha.push(l7);
		pilha.push(l8);

		System.out.println("Tamanho atual da pilha: " + pilha.tamanhoPilha());
		System.out.println("Livro no topo da pilha= " + pilha.getTopo().toString());

		System.out.println("Livro desempilhado= " + pilha.pop().toString());
		pilha.push(l8);

	}
}
