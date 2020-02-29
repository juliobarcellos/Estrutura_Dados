package controler;

import javax.swing.JOptionPane;

public class ListaLigada {
	private Livro inicio;
	private int qtdLivros;
	

	public ListaLigada() {
		this.inicio = (Livro) null;
		this.qtdLivros = 0;
	}
	
	public void adicionarLivro (int numReg, String titulo, String autor, double preco) {
		Livro novoLivro = new Livro(numReg, titulo, autor, preco, inicio);
		inicio = novoLivro;
		qtdLivros++;
	}
	
	public void adicionarLivro (int posicao, int numReg, String titulo, String autor, double preco) {
		
		if (posicao ==1) {
			adicionarLivro(numReg, titulo, autor, preco);
		} else {
			Livro atual = inicio;
			int pos = 1;
		
			while (atual!=null) {
				if (posicao-1 == pos){
					Livro novoLivro = new Livro(numReg, titulo, autor, preco, atual.getAnterior());
					atual.setAnterior(novoLivro);
					qtdLivros++;
					break;
				}else if (pos != posicao) {
					atual = atual.getAnterior();
					pos++;
				}
			}
		}
	}
	

	public void listarLivros() {
		Livro atual = inicio;
		int posicao = 1;
		
		System.out.println("Quantidade de livros cadastrados = "+qtdLivros+"\n");
		
		while (atual!=null) {
			System.out.println("Livro "+posicao+":\nTítulo= "+atual.getTitulo()+"\nAutor = "+atual.getAutor()+"\nNúmero de Registro = "+atual.getNumReg()+"\nPreço = "+atual.getPreco()+"\n");
			atual = atual.getAnterior();
			posicao++;
		}
	}
	
	public void removerLivro() {
		inicio = inicio.getAnterior();
		qtdLivros--;
	}
	
	
	public void removerLivro (int posicao) {
		if (posicao ==1) {
			removerLivro();
		} else {
			Livro atual = inicio;
			int pos = 1;
		
			while (atual!=null) {
				if (posicao-1 == pos){
					Livro anterior = atual.getAnterior();
					atual.setAnterior(anterior.getAnterior());
					qtdLivros--;
					break;
				}else if (pos != posicao) {
					atual = atual.getAnterior();
					pos++;
				}
			}
		}
	}
	
	public Livro pegaLivro (int posicao) {
		Livro desejado = null;
		if (posicao ==1) {
			desejado = inicio;
		} else {
			Livro atual = inicio;
			int pos = 1;
		
			while (atual!=null) {
				if (posicao == pos) {
					desejado = atual;
					break;
				}
			}
		}
		return desejado;
	}
	
	public void temLivro (Livro livro) {
		Livro atual = inicio;
		int pos = 1;
		boolean localizado = false;
		while (atual != null) {
			if (atual.equals(livro) ) {
				localizado = true;
				break;
			} else {
				atual = atual.getAnterior();
				pos++;
			}
		}
		if (localizado) {
			JOptionPane.showMessageDialog(null, "Livro localizado na lista!\nPosição nº"+pos+"\n"+atual.toString());
		} else {
			JOptionPane.showMessageDialog(null, "Livro não localizado na lista!");
		}
	}

	public int getQtdLivros() {
		return qtdLivros;
	}
	
	
}
