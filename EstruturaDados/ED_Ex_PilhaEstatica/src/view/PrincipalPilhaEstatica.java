package view;

import controller.Book;
import controller.PilhaEstatica;

public class PrincipalPilhaEstatica {
	public static void main(String[] args) {
		PilhaEstatica pilha = new PilhaEstatica();
		
		System.out.println("Tamanho atual da pilha: "+pilha.tamanhoPilha());
		
		Book l1 = new Book(10, "O Senhor dos Anéis", "J.R.R. Tolkien", 129.9);
		Book l2 = new Book(20, "O Hobbit", "J.R.R. Tolkien", 39.9);
		Book l3 = new Book(30, "O Silmarillion", "J.R.R. Tolkien", 35.9);
		Book l4 = new Book(40, "Os Filhos de Húrin", "J.R.R. Tolkien", 22.0);
		Book l5 = new Book(50, "Contos Inacabados", "J.R.R. Tolkien", 45.5);
		Book l6 = new Book(60, "A Queda de Gondolin", "J.R.R. Tolkien", 39.9);
		Book l7 = new Book(70, "Beren e Luthien", "J.R.R. Tolkien", 39.9);
		Book l8 = new Book(80, "Folha e Árvore", "J.R.R. Tolkien", 15.5);
		
		pilha.push(l1);
		pilha.push(l2);
		pilha.push(l3);
		pilha.push(l4);
		pilha.push(l5);
		
		System.out.println("Tamanho atual da pilha: "+pilha.tamanhoPilha());
		
		pilha.push(l6);
		pilha.push(l7);
		pilha.push(l8);
		
		System.out.println("Tamanho atual da pilha: "+pilha.tamanhoPilha());
		System.out.println("Livro no topo da pilha= "+pilha.getTopo().toString());
		
		System.out.println("Livro desempilhado= "+pilha.pop().toString());
		pilha.push(l8);
		
		
	}
}
