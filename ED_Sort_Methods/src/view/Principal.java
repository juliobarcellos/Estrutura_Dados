/*Para que os valores de execução sejam relevantes foi necessário trabalhar com um
vetor de 50000 posições. Porém esse tamanho fica inviável de exibir no console
então deixei a exibição desativada. Caso queira ver o vetor antes e depois será só 
ativar as duas linhas comentadas no código abaixo
*/

package view;

import controller.SortMethods;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = new int[50000];
		SortMethods sm = new SortMethods();

		sm.preencheVetor(vetor);
//		System.out.println("Vetor desordenado: " + sm.exibeVetor(vetor));

		for (int i = 1; i < 9; i++) {
			int[] ordenado = new int[50000];
			System.arraycopy(vetor, 0, ordenado, 0, vetor.length);
			ordena(ordenado, sm, i);
			if (i == 8) {
//				System.out.println("Vetor ordenado: " + sm.exibeVetor(ordenado));
			}
		}
	}

	public static void ordena(int[] ordenado, SortMethods sm, int i) {
		double tempoInicial, tempoFinal, tempoTotal;
		String metodo = "";
		tempoInicial = System.nanoTime();
		switch (i) {

		case 1:
			sm.bubbleSort(ordenado);
			metodo = "BubbleSort";
			break;
		case 2:
			sm.quickSort(ordenado, 0, ordenado.length - 1);
			metodo = "QuickSort";
			break;
		case 3:
			sm.insertionSort(ordenado);
			metodo = "InsertionSort";
			break;
		case 4:
			sm.insertionSortBinary(ordenado);
			metodo = "InsertionSortBinary";
			break;
		case 5:
			sm.selectionSort(ordenado);
			metodo = "SelectionSort";
			break;
		case 6:
			sm.heapSortMax(ordenado);
			metodo = "HeapSortMax";
			break;
		case 7:
			sm.heapSortMin(ordenado);
			metodo = "HeapSortMin";
			break;
		case 8:
			sm.mergeSortRecursivo(0, ordenado.length, ordenado);
			metodo = "MergeSort";
			break;
		}

		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println(metodo + " executado em = " + tempoTotal + " s");
	}

}
