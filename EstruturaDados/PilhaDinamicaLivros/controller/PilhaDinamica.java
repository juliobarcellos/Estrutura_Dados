package controller;

import javax.swing.JOptionPane;

public class PilhaDinamica {
	private int tamanho;
	private Livro topo;
	
	public PilhaDinamica() {
	topo = null;
	tamanho = 0;
	}
	
	public boolean verificaPilhaVazia() {
		if (tamanho ==0) {
			return true;
		}
		return false;
	}
	
	public int tamanhoPilha () {
		return this.tamanho;
	}
	
	public void push (Livro novo) {
		novo.setProximo(topo);
		topo = novo;
		tamanho++;
	}
	
	public Livro pop () {
		Livro livro = null;
		if (verificaPilhaVazia()) {
			JOptionPane.showMessageDialog(null, "Não é possivel desempilhar pois a pilha está vazia!");
		} else {
			livro = topo;
			topo = topo.getProximo();
			livro.setProximo(null);
			tamanho--;
		}
		return livro;
	}
	
	public Livro topo () {
		if (verificaPilhaVazia()) {
			JOptionPane.showMessageDialog(null, "A pilha está vazia e não possui topo!");
			return null;
		} 
		return topo;
	}
	
}
