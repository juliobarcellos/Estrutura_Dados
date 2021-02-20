package tree;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		No<String> arvore = new No<>("Raíz");

		No<String> folha1 = new No<>("Folha1");
		folha1.addFolha("Folha 1.1");
		folha1.addFolha("Folha 1.2");

		No<String> folha2 = new No<>("Folha2");
		folha2.addFolha("folha 2.1");

		arvore.addFolha(folha1);
		arvore.addFolha(folha2);
		arvore.addFolha("Folha3");

		arvore.addFolhas(Arrays.asList(new No<>("Folha4"), new No<>("Folha5"), new No<>("Folha6")));

		for (No<String> no : arvore.getFolhas()) {
			System.out.println(no.getDados());
			if (no.getFolhas() != null) {
				for (No<String> filho : no.getFolhas()) {
					System.out.println(filho.getDados());
				}
			}
		}
	}
}
