package exemplo;

public class Principal {
	
	public static void main(String[] args) {
		ListaEncadeada listaEncadeada = new ListaEncadeada();
		Principal principal = new Principal();
		principal.adicionarPessoa (listaEncadeada);
		principal.remover (listaEncadeada);
		
		while (listaEncadeada.temProximo()) {
			System.out.println(listaEncadeada.getPosicaoAtual().getValor());
		}
	}
	
	private void adicionarPessoa (ListaEncadeada listaEncadeada) {
		Pessoa p1 = new Pessoa (1, "João", "jp@gmail.com");
		Pessoa p2 = new Pessoa (2, "Maria", "maria@gmail.com");
		Pessoa p3 = new Pessoa (3, "Bruno", "bruno@gmail.com");
		Pessoa p4 = new Pessoa (4, "José", "jose@gmail.com");
		Pessoa p5 = new Pessoa (5, "Mario", "mario@gmail.com");
		Pessoa p6 = new Pessoa (6, "Eduardo","dudu@gmail.com");
		listaEncadeada.adicionar(p1);
		listaEncadeada.adicionar(p2);
		listaEncadeada.adicionar(p3);
		listaEncadeada.adicionar(p4);
		listaEncadeada.adicionar(p5);
		listaEncadeada.adicionar(p6);
	}
	
	private void remover(ListaEncadeada listaEncadeada) {
		listaEncadeada.remover();
		listaEncadeada.remover();
		listaEncadeada.remover();
	}
	
}
