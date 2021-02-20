package controller;

import java.util.Arrays;

public class SortMethods {

	public int[] preencheVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) ((Math.random() * 500) + 1);
		}
		return vetor;
	}

	public String exibeVetor(int[] vetor) {
		String vt = "";
		for (int i = 0; i < vetor.length; i++) {
			vt += vetor[i] + " ";
		}
		return vt;
	}

	public void bubbleSort(int v[]) {
		for (int i = v.length; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				if (v[j - 1] > v[j]) {
					int aux = v[j];
					v[j] = v[j - 1];
					v[j - 1] = aux;
				}
			}
		}
	}

	public void quickSort(int vet[], int esq, int dir) {
		int pivo = esq, i, ch, j;
		for (i = esq + 1; i <= dir; i++) {
			j = i;
			if (vet[j] < vet[pivo]) {
				ch = vet[j];
				while (j > pivo) {
					vet[j] = vet[j - 1];
					j--;
				}
				vet[j] = ch;
				pivo++;
			}
		}
		if (pivo - 1 >= esq) {
			quickSort(vet, esq, pivo - 1);
		}
		if (pivo + 1 <= dir) {
			quickSort(vet, pivo + 1, dir);
		}
	}

	public void insertionSort(int[] vetor) {
		int j;
		int key;
		int i;
		for (j = 1; j < vetor.length; j++) {
			key = vetor[j];
			for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
				vetor[i + 1] = vetor[i];
			}
			vetor[i + 1] = key;
		}
	}

	public void insertionSortBinary(int[] vetor) {
		for (int i = 1; i < vetor.length; i++) {
			int x = vetor[i];

			// Encontrando o lugar para inserir usando pesquisa binária
			int j = Math.abs(Arrays.binarySearch(vetor, 0, i, x) + 1);

			// "Empurrando" o vetor uma posição para a direita
			System.arraycopy(vetor, j, vetor, j + 1, i - j);

			// Inserindo o elemento na posição correta
			vetor[j] = x;
		}
	}

	public void selectionSort(int[] vetor) {
		for (int i = 0; i < vetor.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[min]) {
					min = j;// inserindo o menor valor para a primeira posição
				}
			}
			int aux = vetor[min];
			vetor[min] = vetor[i];
			vetor[i] = aux;
		}
	}

	public void heapSortMax(int[] vetor) {
		for (int i = vetor.length / 2 - 1; i >= 0; i--) {
			maxHeapify(vetor, i, vetor.length);
		}
		int tamanho = vetor.length;
		for (int i = vetor.length - 1; i > 0; i--) {
			int aux = vetor[0];
			vetor[0] = vetor[i];
			vetor[i] = aux;
			maxHeapify(vetor, 0, --tamanho);
		}
	}

	private void maxHeapify(int[] vetor, int pai, int tamanho) {
		int noEsq = 2 * pai + 1, noDir = noEsq + 1;
		if (noEsq < tamanho) {
			if (noDir < tamanho && vetor[noEsq] < vetor[noDir])
				noEsq = noDir;
			if (vetor[noEsq] > vetor[pai]) {
				int aux = vetor[noEsq];
				vetor[noEsq] = vetor[pai];
				vetor[pai] = aux;
				maxHeapify(vetor, noEsq, tamanho);
			}
		}
	}

	public void heapSortMin(int[] vetor) {
		for (int i = vetor.length / 2 - 1; i >= 0; i--) {
			minHeapify(vetor, i, vetor.length);
		}
		int tamanho = vetor.length;
		for (int i = vetor.length - 1; i > 0; i--) {
			int aux = vetor[0];
			vetor[0] = vetor[i];
			vetor[i] = aux;
			minHeapify(vetor, 0, --tamanho);
		}
	}

	private void minHeapify(int[] vetor, int pai, int tamanho) {
		int noEsq = 2 * pai + 1, noDir = noEsq + 1;
		if (noEsq < tamanho) {
			if (noDir < tamanho && vetor[noEsq] > vetor[noDir])
				noEsq = noDir;
			if (vetor[noEsq] < vetor[pai]) {
				int aux = vetor[noEsq];
				vetor[noEsq] = vetor[pai];
				vetor[pai] = aux;
				minHeapify(vetor, noEsq, tamanho);
			}
		}
	}

	public void mergeSortRecursivo(int inicio, int fim, int[] vetor) {

		if (inicio < fim - 1) {
			int meio = (inicio + fim) / 2;
			mergeSortRecursivo(inicio, meio, vetor);
			mergeSortRecursivo(meio, fim, vetor);
			merge(vetor, inicio, meio, fim);
		}
	}

	private void merge(int[] vetor, int inicio, int meio, int fim) {
		int novoVetor[] = new int[fim - inicio];
		int i = inicio;
		int m = meio;
		int pos = 0;

		while (i < meio && m < fim) {
			if (vetor[i] <= vetor[m]) {
				novoVetor[pos] = vetor[i];
				pos = pos + 1;
				i = i + 1;
			} else {
				novoVetor[pos] = vetor[m];
				pos = pos + 1;
				m = m + 1;
			}
		}

		while (i < meio) {
			novoVetor[pos] = vetor[i];
			pos = pos + 1;
			i = i + 1;
		}

		while (m < fim) {
			novoVetor[pos] = vetor[m];
			pos = pos + 1;
			m = m + 1;
		}

		for (pos = 0, i = inicio; i < fim; i++, pos++) {
			vetor[i] = novoVetor[pos];
		}
	}

}
