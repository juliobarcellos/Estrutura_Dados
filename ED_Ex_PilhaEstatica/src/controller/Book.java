package controller;

public class Book {
	private int numReg;
	private String titulo;
	private String autor;
	private double preco;

	public Book(int numReg, String titulo, String autor, double preco) {
		super();
		this.numReg = numReg;
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}

	public int getNumReg() {
		return numReg;
	}

	public void setNumReg(int numReg) {
		this.numReg = numReg;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Livro [numReg=" + numReg + ", titulo=" + titulo + ", autor=" + autor + ", preco=" + preco + "]";
	}

}
