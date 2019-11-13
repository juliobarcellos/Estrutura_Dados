package view;

import livroFinal.ListaLigada;

public class PrincipalSemJOP {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		PrincipalSemJOP principal = new PrincipalSemJOP();
		
		principal.cadastroLivros (lista);
		lista.listarLivros();
		lista.adicionarLivro(1, 30, "O Inimigo do Mundo", "Leonel Caldela", 35.95);
		lista.listarLivros();
		lista.adicionarLivro(2, 31, "O Cranio e o Corvo", "Leonel Caldela", 38.95);
		lista.listarLivros();
		lista.removerLivro();
		lista.listarLivros();
		lista.removerLivro(4);
		lista.listarLivros();
	}
	
	public void cadastroLivros (ListaLigada lista) {
		lista.adicionarLivro(10, "Fahrenheit 451", "Ray Bradbury", 29.90);
		lista.adicionarLivro(5, "Harry Potter e o Cálice de Fogo", "J.K. Rowling", 59.90);
		lista.adicionarLivro(20, "O Caçador de Apóstolos", "Leonel Caldela", 19.90);
		lista.adicionarLivro(15, "A Flecha de Fogo", "Leonel Caldela", 64.90);
		lista.adicionarLivro(33, "Cilada", "Harlan Coben", 18.90);
		lista.adicionarLivro(60, "Em Algum Lugar nas Estrelas","Clare Vanderpool", 34.90);
	}
}
