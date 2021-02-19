package view;

import controller.FilaEstatica;
import controller.Pessoa;

public class PrincipalFilaEstatica {

	public static void main(String[] args) {
		FilaEstatica fila = new FilaEstatica();
		if (fila.filaVazia()) {
			System.out.println("A fila está vazia!");
		}
		System.out.println("Tamanho atual da fila: " + fila.tamanhoFila());

		Pessoa p1 = new Pessoa(1, "Julio", "julio@teste.com");
		Pessoa p2 = new Pessoa(2, "Raizer", "raizer@teste.com");
		Pessoa p3 = new Pessoa(3, "Caique", "caique@teste.com");
		Pessoa p4 = new Pessoa(4, "Lazaro", "lazaro@teste.com");
		Pessoa p5 = new Pessoa(5, "Gustavo", "gustavo@teste.com");
		Pessoa p6 = new Pessoa(6, "Victor", "victor@teste.com");
		Pessoa p7 = new Pessoa(7, "Rodrigo", "rodrigo@teste.com");

		fila.enfileirar(p1);
		fila.enfileirar(p2);
		fila.enfileirar(p3);
		fila.enfileirar(p4);
		fila.enfileirar(p5);

		if (fila.filaCheia()) {
			System.out.println("A fila está cheia!");
		}

		fila.desenfileirar();
		fila.desenfileirar();
		fila.enfileirar(p6);
		fila.enfileirar(p7);

		System.out.println("Pessoa na frente da fila: " + fila.getFrente());

		System.out.println("Buscando ID 1 na fila");
		if (fila.buscar(1) == null) {
			System.out.println("ID não encontrado na fila");
		}

		System.out.println("Buscando ID 3 na fila");
		System.out.println(fila.buscar(3).toString());
	}

}
