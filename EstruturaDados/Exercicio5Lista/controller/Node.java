package controller;

public class Node {
	private String Element;
	private Node next;
	
	public Node (String Element, Node next) {
		this.Element = Element;
		this.next = next;
	}

	public String getElement() {
		return Element;
	}

	public void setElement(String element) {
		Element = element;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
