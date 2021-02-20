package controller;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Comparador {
	public static void main(String[] args) {
		Set<Dog> hashDog = new HashSet<Dog>();
		Set<Dog> treeDog = new TreeSet<Dog>();
		Set<Dog> linkedHashDog = new LinkedHashSet<Dog>();
		long tempoInicial, tempoFinal, tempoTotal;

		tempoInicial = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			int x = (int) (Math.random() * 990) + 10;
			hashDog.add(new Dog(x));
		}
		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;
		System.out.println("Tempo HashSet: " + tempoTotal);

		tempoInicial = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			int x = (int) (Math.random() * 990) + 10;
			treeDog.add(new Dog(x));
		}
		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;
		System.out.println("Tempo TreeSet: " + tempoTotal);

		tempoInicial = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			int x = (int) (Math.random() * 990) + 10;
			linkedHashDog.add(new Dog(x));
		}
		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;
		System.out.println("Tempo LinkedHashSet: " + tempoTotal);

	}
}
