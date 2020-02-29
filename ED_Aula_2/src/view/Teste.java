package view;

import controller.Vetor;
import model.Aluno;

public class Teste {
	public static void main(String[] args) {
		
		Vetor vetor = new Vetor();
		
		Aluno aluno1 = new Aluno("Victor", 19, 'M');
		Aluno aluno2 = new Aluno("Lazaro", 21, 'M');
		Aluno aluno3 = new Aluno("Julio", 29, 'M');

		
		vetor.adiciona(aluno1);
		vetor.adiciona(aluno2);
		vetor.adiciona(0, aluno3);
		
		int tamanho = vetor.tamanho();
		
		if (tamanho != 3) {
			System.out.println("Erro! O tamanho da lista está errado.");
		}
		
		if (!vetor.contem(aluno1)) {
			System.out.println("Erro! Não achou um aluno que deveria estar na lista.");
		}
		
		vetor.remove(0);
		tamanho = vetor.tamanho();
		
		if(tamanho!=2) {
			System.out.println("Erro! O tamanho da lista está errado.");
		}
		
		if (vetor.contem(aluno3)) {
			System.out.println("Erro! Achou um aluno que não deveria estar na lista.");
		}
		
		vetor.mostraLista();
		vetor.mostraLista(0);
	}
}
