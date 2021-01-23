package edu.escuelaing.arep.util;

public class Node<E> {
	
	private E data = null;
	private Node<E> next = null;
	
	public Node(E data) {
		this.data = data;
	}
	
	public Node<E> getNext(){
		return next;
	}
	
	public void setNext(Node<E> next) {
		this.next = next;
	}
	
	public E getData() {
		return data;
	}
	
	public boolean hasNext() {
		boolean res = false;
		if(this.next != null) {
			res = true;
		}
		return res;
	}


}
