package view;

import javax.swing.JOptionPane;

import controller.Aluno;
import controller.LinkedListS;

public class PrincipalEx4 {

	public static void main(String[] args) {
		LinkedListS lista = new LinkedListS();
		Aluno A1 = new Aluno("101", "Alan", "Estrutura", 2, 4, 6, null);
		Aluno A2 = new Aluno("102", "Bruno", "Estrutura", 4, 6, 8, null);
		Aluno A3 = new Aluno("103", "Caique", "Estrutura", 6, 8, 10, null);
		Aluno A4 = new Aluno("104", "Diogo", "Estrutura", 3, 5, 7, null);
		Aluno A5 = new Aluno("N01", "Adson", "Estrutura", 5, 7, 9, null);
		Aluno A6 = new Aluno("N02", "Caio", "Estrutura", 5, 5, 5, null);
		Aluno A7 = new Aluno("N03", "Edson", "Estrutura", 8, 7, 9, null);
		lista.addFirst(A1);
		lista.addFirst(A2);
		lista.addFirst(A3);
		lista.addFirst(A4);
		lista.addPos(1, A7);
		lista.addPos(4, A6);
		lista.addPos(7, A5);
		lista.listAll();
		lista.removeFirst();
		System.out.println("");
		lista.listAll();
		lista.removePos(1);
		System.out.println("");
		lista.listAll();
		lista.removePos(2);
		System.out.println("");
		lista.listAll();
		lista.removePos(4);
		System.out.println("");
		lista.listAll();
		buscarLivro(lista);

//		adicionarAluno (lista);
	}

	private static void buscarLivro(LinkedListS lista) {

		String busca = JOptionPane.showInputDialog("Digite o número de matrícula ou o nome do aluno desejado");
		Aluno aluno = new Aluno(busca);
		lista.buscaAluno(aluno);
	}

//	public static void adicionarAluno(LinkedListS lista) {
//		String numMatricula = JOptionPane.showInputDialog("Digite o número de matrícula do novo aluno:");
//		String nome = JOptionPane.showInputDialog("Digite o nome do novo aluno:");
//		String disciplina = JOptionPane.showInputDialog("Digite o nome da disciplina do novo aluno:");
//		float p1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota p1 do novo aluno:"));
//		float p2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota p2 do novo aluno:"));
//		float p3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota p3 do novo aluno:"));
//		Aluno novo = new Aluno(numMatricula, nome, disciplina, p1, p2, p3, null);
//		
//		final String [] opcao = {"Cabeça", "Posição específica"};
//		int opc = JOptionPane.showOptionDialog(null, "Deseja inserir o Aluno no topo da lista ou em uma posição específica?", "Escolha uma opção", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,opcao, opcao[0]);
//		switch (opc) {
//		case 0:
//			lista.addFirst(novo);
//			break;
//		case 1:
//			
//			break;
//		default:
//			break;
//		}
//	}

}
