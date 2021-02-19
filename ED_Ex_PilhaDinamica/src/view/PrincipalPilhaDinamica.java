package view;

import controller.Livro;
import controller.PilhaDinamica;

public class PrincipalPilhaDinamica {
	public static void main(String[] args) {

		PilhaDinamica pilha = new PilhaDinamica();

		Livro l1 = new Livro(10, "O Senhor dos Anéis", "J.R.R. Tolkien", 129.9, null);
		Livro l2 = new Livro(20, "O Hobbit", "J.R.R. Tolkien", 39.9, null);
		Livro l3 = new Livro(30, "O Silmarillion", "J.R.R. Tolkien", 35.9, null);
		Livro l4 = new Livro(40, "Os Filhos de Húrin", "J.R.R. Tolkien", 22.0, null);
		Livro l5 = new Livro(50, "Contos Inacabados", "J.R.R. Tolkien", 45.5, null);
		Livro l6 = new Livro(60, "A Queda de Gondolin", "J.R.R. Tolkien", 39.9, null);
		Livro l7 = new Livro(70, "Beren e Luthien", "J.R.R. Tolkien", 39.9, null);
		Livro l8 = new Livro(80, "Árvore e Folha", "J.R.R. Tolkien", 15.5, null);

		if (pilha.verificaPilhaVazia()) {
			System.out.println("A pilha está vazia!");
		} else {
			System.out.println("A pilha não está vazia, contém " + pilha.tamanhoPilha() + " Livros");
		}

		pilha.push(l1);
		pilha.push(l2);
		pilha.push(l3);
		pilha.push(l4);
		pilha.push(l5);
		pilha.push(l6);
		pilha.push(l7);
		pilha.push(l8);

		if (pilha.verificaPilhaVazia()) {
			System.out.println("A pilha está vazia!");
		} else {
			System.out.println("A pilha não está vazia, contém " + pilha.tamanhoPilha() + " Livros");
		}

		System.out.println("Livro no topo da pilha= " + pilha.topo());

		System.out.println("Livro desempilhado: " + pilha.pop().toString());
		System.out.println("Livro desempilhado: " + pilha.pop().toString());
		System.out.println("Livro desempilhado: " + pilha.pop().toString());

		System.out.println("Quantidade de livros na pilha: " + pilha.tamanhoPilha() + " Livros");

//		int opc;
//		PilhaDinamica pilha = new PilhaDinamica();
//		do {
//			opc = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal\n\n1 - Consultar o tamanho da Pilha\n2 - Verificar se a pilha est� vazia\n3 - Empilhar um Livro na Pilha\n4 - Desempilhar um Livro do topo da Pilha\n5 - Mostrar o Livro que est� no topo da pilha\n9 - Encerrar"));
//			switch (opc) {
//			case 1:
//				JOptionPane.showMessageDialog(null, "Quantidade de livros na pilha: "+pilha.tamanhoPilha());
//				break;
//			case 2:
//				if(pilha.verificaPilhaVazia()) {
//					JOptionPane.showMessageDialog(null, "A pilha est� vazia!");
//				} else {
//					JOptionPane.showMessageDialog(null, "A pilha n�o est� vazia, cont�m "+pilha.tamanhoPilha()+" Livros");
//				}
//				break;
//			case 3:
//				int numReg = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de registro do livro: "));
//				String titulo = JOptionPane.showInputDialog("Digite o t�tulo do livro: ");
//				String autor = JOptionPane.showInputDialog("Digite o nome do(a) autor(a) do livro: ");
//				double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o do livro: ").replace(",", "."));
//				Livro livro = new Livro(numReg, titulo, autor, preco, null);
//				pilha.push(livro);
//				break;
//			case 4:
//				Livro desempilha = pilha.pop();
//				JOptionPane.showMessageDialog(null, "Livro desempilhado:\n"+desempilha.toString());
//				break;
//			case 5:
//				Livro topo = pilha.topo();
//				JOptionPane.showMessageDialog(null, "Livro do topo da pilha:\n"+topo.toString());
//				break;
//			case 9:
//				JOptionPane.showMessageDialog(null, "Fim!");
//				break;
//			default:
//				JOptionPane.showMessageDialog(null, "Digite uma op��o v�lida!");
//			}
//		}
//		while (opc!=9);
	}

}
