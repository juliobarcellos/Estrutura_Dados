package view;

import javax.swing.JOptionPane;

import controller.Livro;
import controller.PilhaDinamica;

public class PrincipalPilha {
	public static void main(String[] args) {
		int opc;
		PilhaDinamica pilha = new PilhaDinamica();
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal\n\n1 - Consultar o tamanho da Pilha\n2 - Verificar se a pilha está vazia\n3 - Empilhar um Livro na Pilha\n4 - Desempilhar um Livro do topo da Pilha\n5 - Mostrar o Livro que está no topo da pilha\n9 - Encerrar"));
			switch (opc) {
			case 1:
				JOptionPane.showMessageDialog(null, "Quantidade de livros na pilha: "+pilha.tamanhoPilha());
				break;
			case 2:
				if(pilha.verificaPilhaVazia()) {
					JOptionPane.showMessageDialog(null, "A pilha está vazia!");
				} else {
					JOptionPane.showMessageDialog(null, "A pilha não está vazia, contém "+pilha.tamanhoPilha()+" Livros");
				}
				break;
			case 3:
				int numReg = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de registro do livro: "));
				String titulo = JOptionPane.showInputDialog("Digite o título do livro: ");
				String autor = JOptionPane.showInputDialog("Digite o nome do(a) autor(a) do livro: ");
				double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do livro: ").replace(",", "."));
				Livro livro = new Livro(numReg, titulo, autor, preco, null);
				pilha.push(livro);
				break;
			case 4:
				Livro desempilha = pilha.pop();
				JOptionPane.showMessageDialog(null, "Livro desempilhado:\n"+desempilha.toString());
				break;
			case 5:
				Livro topo = pilha.topo();
				JOptionPane.showMessageDialog(null, "Livro do topo da pilha:\n"+topo.toString());
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Fim!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Digite uma opção válida!");
			}
		}
		while (opc!=9);
	}
	
}
