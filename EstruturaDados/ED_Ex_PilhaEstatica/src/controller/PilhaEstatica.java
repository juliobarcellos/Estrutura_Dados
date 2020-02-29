package controller;

public class PilhaEstatica {
	 Book [] pilha = new Book[7];
	 private int topoPilha = -1;
	 
	 public boolean verificaPilhaVazia() {
		 return (topoPilha == -1);
	 }
	 
	 public int tamanhoPilha() {
		 return topoPilha+1;
	 }
	 
	 public boolean pilhaCheia() {
		 return (topoPilha==pilha.length-1);
	 }
	 
	 public void push (Book novo) {
		 if (pilhaCheia()) {
			 System.out.println("N�o � poss�vel empilhar pois a pilha est� cheia!");
		 }else {
			 topoPilha++;
			 pilha[topoPilha] = novo;
			 System.out.println("Livro empilhado com sucesso!");
		 }
	 }
	 
	 public Book pop () {
		 Book livro = null;
		 if (verificaPilhaVazia()) {
			 System.out.println("N�o � possivel desempilhar pois a pilha est� vazia!");
		 } else {
			 livro = pilha[topoPilha];
			 pilha [topoPilha] = null;
			 topoPilha--;
		 }
		 return livro;
	 }
	 
	 public Book getTopo() {
		 Book livro = null;
		 if (verificaPilhaVazia()) {
			 System.out.println("A pilha est� vazia!");
		 } else {
			 livro = pilha[topoPilha];
		 }
		 return livro;
	 }
	 
}
