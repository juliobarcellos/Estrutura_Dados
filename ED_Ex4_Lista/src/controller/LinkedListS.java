package controller;

import javax.swing.JOptionPane;

public class LinkedListS {
	protected Aluno head;
	protected long size;

	public LinkedListS() {
		head = null;
		size = 0;
	}

	public void addFirst(Aluno novo) {
		novo.setNext(head);
		head = novo;
		size++;
	}

	public void addPos(int posicao, Aluno novo) {
		if (posicao == 1) {
			addFirst(novo);
		} else if (posicao > size + 1 || posicao < 1) {
			JOptionPane.showMessageDialog(null, "Posição Inválida!");
		} else if (posicao == size + 1) {
			Aluno proximo = head;

			while (proximo.getNext() != null) {
				proximo = proximo.getNext();
			}
			proximo.setNext(novo);
			size++;
		} else {
			Aluno atual = head;
			int pos = 1;

			while (atual != null) {
				if (posicao - 1 == pos) {
					novo.setNext(atual.getNext());
					atual.setNext(novo);
					size++;
					break;
				} else if (pos != posicao) {
					atual = atual.getNext();
					pos++;
				}
			}
		}
	}

	public void removeFirst() {
		if (head == null) {
			JOptionPane.showMessageDialog(null, "Não é possível remover pois a lista está vazia!");
		}
		Aluno t = head;
		head = head.getNext();
		t.setNext(null);
		size--;
	}

	public void removePos(int posicao) {
		if (head == null) {
			JOptionPane.showMessageDialog(null, "Não é possível remover pois a lista está vazia!");
		} else if (posicao > size) {
			JOptionPane.showMessageDialog(null, "Posição inválida!");
		} else if (posicao == 1) {
			removeFirst();
		} else {
			Aluno atual = head;
			int pos = 1;

			while (atual != null) {
				if (posicao - 1 == pos) {
					Aluno proximo = atual.getNext();
					atual.setNext(proximo.getNext());
					size--;
					break;
				} else if (pos != posicao) {
					atual = atual.getNext();
					pos++;
				}
			}
		}
	}

	public void listAll() {
		Aluno atual = head;
		int pos = 1;

		while (atual != null) {
			System.out.println(atual.toString());
			atual = atual.getNext();
			pos++;
		}
	}

	public void buscaAluno(Aluno busca) {
		Aluno atual = head;
		int pos = 1;
		boolean localizado = false;
		while (atual != null) {
			if (atual.equals(busca)) {
				localizado = true;
				break;
			} else {
				atual = atual.getNext();
				pos++;
			}
		}
		if (localizado) {
			JOptionPane.showMessageDialog(null,
					"Aluno localizado na lista!\nPosição nº" + pos + "\n" + atual.toString());
		} else {
			JOptionPane.showMessageDialog(null, "Aluno não localizado na lista!");
		}
	}

}
