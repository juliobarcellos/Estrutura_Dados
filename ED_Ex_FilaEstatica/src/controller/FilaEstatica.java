package controller;

public class FilaEstatica {
	private int fim= -1;
	private Pessoa[] fila = new Pessoa[5];
	private int tamanho =0;
	
	public int tamanhoFila() {
		return this.tamanho;
	}
	
	public boolean filaCheia() {
		return (tamanho == fila.length);
	}
	
	public boolean filaVazia() {
		return (tamanho ==0);
	}
	
	public void enfileirar (Pessoa pessoa) {
		if (filaCheia()) {
			System.out.println("Não é possível enfileirar, a fila está cheia!");
		} else {
			fila[tamanho]=pessoa;
			tamanho++;
			fim++;
			System.out.println("Pessoa enfileirada!");
		}
	}
	
	public Pessoa desenfileirar () {
		Pessoa pessoa = null;
		if (filaVazia()) {
			System.out.println("Não é possível desenfileirar, a fila está vazia!");
		} else {
			pessoa = fila[0];
			for (int c=1; c<tamanho; c++) {
				fila[c-1] = fila[c];
			}
			fila[tamanho-1] =null;
			tamanho--;
			fim--;
		}
		return pessoa;
	}
	
	public Pessoa getFrente() {
		return fila[0];
	}

	public Pessoa buscar(int id) {
		Pessoa pessoa = null;
		for (int c=0; c<fim;c++) {
			if(fila[c].getId().equals(id)) {
				pessoa=fila[c];
				break;
			}
		}
		return pessoa;
	}
	
}
