package controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSets {
	public static void main(String[] args) {
		Set<String> cargos = new HashSet<>();
		cargos.add("Gerente");
		cargos.add("Diretor");
		cargos.add("Presidente");
		cargos.add("Secretária");
		cargos.add("Funcionário");
		cargos.add("Diretor");

		System.out.println(cargos);

		System.out.println("Consigo adicionar um segundo Diretor? " + cargos.add("Diretor"));
		System.out.println("Consigo adicionar um Superintendente? " + cargos.add("Superintendente"));

		System.out.println(cargos);
		System.out.println("Tamanho do Set: " + cargos.size());

		System.out.println("\nUsando for each para mostrar os elementos do Set: ");
		for (String cargo : cargos) {
			System.out.print(cargo + " ");
		}
		System.out.println("\nAgora usando for each com iterator:");
		Iterator<String> i = cargos.iterator();
		while (i.hasNext()) {
			String cargo = i.next();
			System.out.print(cargo + " ");
		}

		HashSet<String> dset = new HashSet<String>();
		dset.add(new String("2dog"));
		dset.add(new String("1dog"));
		dset.add(new String("3dog"));
		dset.add(new String("5dog"));
		dset.add(new String("4dog"));

		System.out.println("\n\nDemonstrando que a ordem de exibição não é a mesma que a ordem de gravação: ");
		Iterator<String> it = dset.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

	}
}
