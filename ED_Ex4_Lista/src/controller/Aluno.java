package controller;

public class Aluno {
	private String 	numMatricula;
	private String nome, disciplina;
	private float p1, p2, p3;
	private Aluno next;
	
	public Aluno (String busca) {
		this.numMatricula = busca;
		this.nome = busca;
	}
	
	public Aluno(String numMatricula, String nome, String disciplina, float p1, float p2, float p3, Aluno next) {
		this.numMatricula = numMatricula;
		this.nome = nome;
		this.disciplina = disciplina;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.next = next;
	}

	public String getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(String numMatricula) {
		this.numMatricula = numMatricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public float getP1() {
		return p1;
	}

	public void setP1(float p1) {
		this.p1 = p1;
	}

	public float getP2() {
		return p2;
	}

	public void setP2(float p2) {
		this.p2 = p2;
	}

	public float getP3() {
		return p3;
	}

	public void setP3(float p3) {
		this.p3 = p3;
	}
	
	public Aluno getNext() {
		return next;
	}
	
	public void setNext(Aluno next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Aluno [numMatricula=" + numMatricula + ", nome=" + nome + ", disciplina=" + disciplina + ", p1=" + p1
				+ ", p2=" + p2 + ", p3=" + p3 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numMatricula == null) ? 0 : numMatricula.hashCode());
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
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (nome.equals(other.nome) || numMatricula.equals(other.numMatricula))
			return true;
		return false;
	}
	
}
