package view;

import javax.swing.JOptionPane;

import controler.ListaLigada;
import controler.Livro;

public class PrincipalListaDinamica {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		PrincipalListaDinamica principal = new PrincipalListaDinamica();
		int Opc;

		do {
			Opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Menu Principal\n\n1 - Cadastrar Livros\n2 - Consultar Livros\n3 - Remover Livros\n9 - Fim"));
			switch (Opc) {
			case 1:
				principal.cadastroLivros(lista);
				break;
			case 2:
				principal.consultaLivros(lista);
				break;
			case 3:
				principal.removeLivros(lista);
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Fim");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Digite uma Opção Válida!");
			}
		} while (Opc != 9);

//		principal.cadastroLivros (lista);
//		lista.listarLivros();
//		lista.adicionarLivro(1, 30, "O Inimigo do Mundo", "Leonel Caldela", 35.95);
//		lista.listarLivros();
//		lista.adicionarLivro(2, 31, "O Cranio e o Corvo", "Leonel Caldela", 38.95);
//		lista.listarLivros();
//		lista.removerLivro();
//		lista.listarLivros();
//		lista.removerLivro(4);
//		lista.listarLivros();
//		principal.buscarLivro(lista);
	}

	private void cadastroLivros(ListaLigada lista) {

		int Opc, numReg;
		String titulo, autor;
		double preco;

		do {
			Opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Cadastro de Livros\n\n1 - Cadastrar Livro no início da lista\n2 - Cadastrar Livro em uma posição específica\n9 - Retornar ao Menu Principal"));
			switch (Opc) {
			case 1:
				numReg = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de registro do livro: "));
				titulo = JOptionPane.showInputDialog("Digite o título do livro: ");
				autor = JOptionPane.showInputDialog("Digite o nome do(a) autor(a) do livro: ");
				preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do livro: ").replace(",", "."));
				lista.adicionarLivro(numReg, titulo, autor, preco);
				break;
			case 2:
				int posicao = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de livros cadastrados: "
						+ lista.getQtdLivros() + "\nDigite a posição em que deseja inserir o livro: "));
				numReg = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de registro do livro: "));
				titulo = JOptionPane.showInputDialog("Digite o título do livro: ");
				autor = JOptionPane.showInputDialog("Digite o nome do(a) autor(a) do livro: ");
				preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do livro: ").replace(",", "."));
				lista.adicionarLivro(posicao, numReg, titulo, autor, preco);
				break;
			case 9:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Digite uma Opção Válida!");
			}
		} while (Opc != 9);
//		lista.adicionarLivro(10, "Fahrenheit 451", "Ray Bradbury", 29.90);
//		lista.adicionarLivro(5, "Harry Potter e o C�lice de Fogo", "J.K. Rowling", 59.90);
//		lista.adicionarLivro(20, "O Ca�ador de Ap�stolos", "Leonel Caldela", 19.90);
//		lista.adicionarLivro(15, "A Flecha de Fogo", "Leonel Caldela", 64.90);
//		lista.adicionarLivro(33, "Cilada", "Harlan Coben", 18.90);
//		lista.adicionarLivro(60, "Em Algum Lugar nas Estrelas","Clare Vanderpool", 34.90);
	}

	private void consultaLivros(ListaLigada lista) {

		int Opc;

		do {
			Opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Consulta de Livros\n\n1 - Consultar quantidade de livros cadastrados\n2 - Listar livros cadastrados\n3 - Pegar o livro de uma posição específica\n4 - Consultar se um livro está armazenado\n9 - Retornar ao Menu Principal"));
			switch (Opc) {
			case 1:
				JOptionPane.showMessageDialog(null, "Quantidade de livros cadastrados: " + lista.getQtdLivros());
				break;
			case 2:
				lista.listarLivros();
				break;
			case 3:
				int posicao;
				do {
					posicao = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de livros cadastrados: "
							+ lista.getQtdLivros() + "\nDigite a posição do livro desejado: "));
					if (posicao < 1 || posicao > lista.getQtdLivros()) {
						JOptionPane.showMessageDialog(null, "Digite uma opção válida!");
					}
				} while (posicao < 1 || posicao > lista.getQtdLivros());
				Livro busca = lista.pegaLivro(posicao);
				JOptionPane.showMessageDialog(null, "Detalhes do livro procurado: \n" + busca.toString());
				break;
			case 4:
				buscarLivro(lista);
				break;
			case 9:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Digite uma Opção Válida!");
			}
		} while (Opc != 9);

	}

	private void buscarLivro(ListaLigada lista) {

		String info = JOptionPane.showInputDialog("Digite o número de registro ou o título do livro desejado");
		try {
			int numReg = Integer.parseInt(info);
			Livro livro = new Livro(numReg);
			lista.temLivro(livro);
		} catch (NumberFormatException e) {
			Livro livro = new Livro(info);
			lista.temLivro(livro);
		}
	}

	private void removeLivros(ListaLigada lista) {

		int Opc;

		do {
			Opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Consulta de Livros\n\n1 - Remover livro do início da lista\n2 - Remover livro de uma posição específica\n9 - Retornar ao Menu Principal"));
			switch (Opc) {
			case 1:
				lista.removerLivro();
				break;
			case 2:
				int posicao;
				do {
					posicao = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de livros cadastrados: "
							+ lista.getQtdLivros() + "\nDigite a posição do livro que deseja remover: "));
					if (posicao < 1 || posicao > lista.getQtdLivros()) {
						JOptionPane.showMessageDialog(null, "Digite uma opção válida!");
					}
				} while (posicao < 1 || posicao > lista.getQtdLivros());
				lista.removerLivro(posicao);
				break;
			case 9:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Digite uma Opção Válida!");
			}
		} while (Opc != 9);

	}

}
