package binaryTree;

public class Principal {
	public static void main(String[] args) {
		ArvoreBinaria arvore = new ArvoreBinaria();
		Percursos p = new Percursos();

		for (int i = 0; i < 25; i++) {
			arvore.add((long) (Math.random() * 150) + 1);
		}

		arvore.add(150);
		arvore.buscar(150);
		p.caminhar(arvore.getRaiz());
		long valorRaiz = arvore.getRaiz().valor;
		arvore.remover(valorRaiz);
		arvore.buscar(valorRaiz);
		p.caminhar(arvore.getRaiz());
	}
}
