package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		List<String> pessoas = new ArrayList<>();
		pessoas.add("João");
		pessoas.add("Guilherme");
		pessoas.add("Pedro");
		pessoas.add("Julio");

		for (String pessoa : pessoas) {
			System.out.println("Nome: " + pessoa.toString());
		}
		System.out.println(pessoas);
		pessoas.clear();

		List lista = new ArrayList();
		lista.addAll(pessoas);
		for (Object pessoa : lista) {
			System.out.println("Nome: " + pessoa.toString());
		}
		System.out.println("Tamanho da lista: " + lista.size());
		lista.add("João");
		lista.add("Guilherme");
		lista.add("Pedro");
		lista.add("Julio");

		Collections.sort(lista);

		System.out.println(lista);

	}

}
