package controller;

public class Metodos {

	public int buscaLinear(int v[], int tamanho_vetor, int valor) {
		int indice = -1;
		for (int i = 0; i < tamanho_vetor; i++) {
			if (v[indice] == valor) {
				return i; // encontrou o valor na posição i
			}
		}
		return indice; // indica que não encontrou o valor
	}

	public int pesquisaBinaria(int vet[], int chave, int Tam) {
		int esq = 0;
		int dir = Tam - 1;
		int pivo;
		int retorno = -1;
		while (esq <= dir) {
			pivo = (esq + dir) / 2;
			if (chave == vet[pivo])
				retorno = pivo;
			if (chave < vet[pivo])
				esq = pivo - 1;
			else
				esq = pivo + 1;
		}
		return retorno;
	}

	public int pesquisaBinariaRecursiva(int x, int v[], int e, int d) {
		int pivo = (e + d) / 2;
		if (v[pivo] == x)
			return pivo;
		if (e >= d)
			return -1; // não encontrado
		else if (v[pivo] < x)
			return pesquisaBinariaRecursiva(x, v, pivo + 1, d);
		else
			return pesquisaBinariaRecursiva(x, v, e, pivo - 1);
	}

	public int somaLinearRecursiva(int v[], int n) {
		if (n == 1) {
			return v[0];
		}
		return v[n - 1] + somaLinearRecursiva(v, n - 1);
	}

	public int somaBinariaRecursiva(int v[], int i, int n) {
		if (n == 1)
			return v[0];
		return somaBinariaRecursiva(v, i,
				(int) Math.ceil(n / 2) + somaBinariaRecursiva(v, i, (int) Math.ceil(n / 2) + (int) Math.floor(n / 2)));
	}

	public int maiorRecursiva(int v[], int inicio, int fim) {
		int meio = (inicio + fim) / 2;
		int n1, n2;
		if (meio > inicio) {
			n1 = maiorRecursiva(v, inicio, meio);
			n2 = maiorRecursiva(v, meio + 1, fim);
		} else {
			n1 = v[inicio];
			n2 = v[fim];
		}
		if (n1 > n2)
			return n1;
		else
			return n2;
	}
}
