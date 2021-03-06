package controller;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSets {
	public static void main(String[] args) {

		Set<Dog> dogSet = new LinkedHashSet<Dog>();

		dogSet.add(new Dog(2));
		dogSet.add(new Dog(1));
		dogSet.add(new Dog(3));
		dogSet.add(new Dog(-55));
		dogSet.add(new Dog(203));
		Iterator<Dog> it = dogSet.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
