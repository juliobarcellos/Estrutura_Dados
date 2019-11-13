package controller;

import javax.swing.JOptionPane;

public class SlinkedList {
	protected Node head;
	protected long size;
	
	public SlinkedList() {
		head = null;
		size = 0;
	}
	
	public void addFirst (Node v) {
		v.setNext(head);
		head = v;
		size++;
	}
	
	public void addPos (int posicao, Node novo) {
		if (posicao ==1) {
			addFirst(novo);
		} else if (posicao > size+1 || posicao <1) {
			JOptionPane.showMessageDialog(null, "Posição Inválida!");
		} else if (posicao == size+1){
			Node proximo = head;
		
			while (proximo.getNext()!=null) {
				proximo = proximo.getNext();
			}
			proximo.setNext(novo);
			size++;
		} else {
			Node atual = head;
			int pos = 1;
		
			while (atual!=null) {
				if (posicao-1 == pos){
					novo.setNext(atual.getNext());
					atual.setNext(novo);
					size++;
					break;
				}else if (pos != posicao) {
					atual = atual.getNext();
					pos++;
				}
			}
		}
	}
	
	public void removeFirst () {
		if (head == null) {
			JOptionPane.showMessageDialog(null, "Não é possível remover pois a lista está vazia!");
		}
		Node t = head;
		head = head.getNext();
		t.setNext(null);
		size = size-1;
	}
	
	public void removePos(int posicao) {
		if (head == null) {
			JOptionPane.showMessageDialog(null, "Não é possível remover pois a lista está vazia!");
		} else if (posicao > size) {
			JOptionPane.showMessageDialog(null, "Posição inválida!");
		} else if (posicao ==1) {
			removeFirst();
		} else {
			Node atual = head;
			int pos = 1;
		
			while (atual!=null) {
				if (posicao-1 == pos){
					Node proximo = atual.getNext();
					atual.setNext(proximo.getNext());
					size--;
					break;
				}else if (pos != posicao) {
					atual = atual.getNext();
					pos++;
				}
			}
		}
	}

	public void listAll() {
		Node atual = head;
		int pos = 1;
		
		while (atual != null) {
			System.out.println(atual.toString());
			atual = atual.getNext();
			pos++;
		}
	}
	
	
	public void buscaAluno (Node busca) {
		Node atual = head;
		int pos = 1;
		boolean localizado = false;
		while (atual != null) {
			if (atual.equals(busca) ) {
				localizado = true;
				break;
			} else {
				atual = atual.getNext();
				pos++;
			}
		}
		if (localizado) {
			JOptionPane.showMessageDialog(null, "Node localizado na lista!\nPosição nº"+pos+"\n"+atual.toString());
		} else {
			JOptionPane.showMessageDialog(null, "Node não localizado na lista!");
		}
	}
	
}
