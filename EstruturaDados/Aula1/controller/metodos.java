package controller;

public class metodos {
	
	int V[] = new int [8];
	
	int maior (int V[]) {
		int m = V[0];
		for (int i=1;i<V.length;i++) {
			if (V[i]>m) {
				m = V[i];
			}
		}
		return m;
	}
	
	int pesquisaLinear (int V[], int num) {
		for (int i=0; i<V.length;i++) {
			if (V[i]==num) {
				return i;
			}
		}
		return -1;
	}
	
	//aplicando boas práticas:
	
	
	int pesquisaLinear2 (int V[], int n, int num) {
		int resposta = -1;
		for (int i=0; i<n;i++) {
			if (V[i]==num) {
				resposta = i;
				n=i;
			}
		}
		return resposta;
	}
	
	
	
	
	
}
