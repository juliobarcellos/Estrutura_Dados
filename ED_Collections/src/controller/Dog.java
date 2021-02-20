package controller;

public class Dog implements Comparable<Dog> {

	private int size;

	public Dog(int s) {
		this.size = s;
	}

	@Override
	public String toString() {

		return size + "";
	}

	@Override
	public int compareTo(Dog o) {
		return size - o.size;
	}

}
