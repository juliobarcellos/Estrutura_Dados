package controller;

public class Livro {

	private int numReg;
	private String titulo;
	private String autor;
	private double preco;
	private Livro proximo;

	public Livro(int numReg) {
		this.numReg = numReg;
	}

	public Livro(String titulo) {
		this.titulo = titulo;
	}

	public Livro(int numReg, String titulo, String autor, double preco, Livro proximo) {
		super();
		this.numReg = numReg;
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
		this.proximo = proximo;
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

	public Livro getProximo() {
		return proximo;
	}

	public void setProximo(Livro proximo) {
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		return "Livro [numReg=" + numReg + ", titulo=" + titulo + ", autor=" + autor + ", preco=" + preco + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numReg;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (titulo.equals(other.titulo) || numReg == other.numReg)
			return true;
		return false;
	}

}
