package edu.escuelaing.arep.util;

import java.util.Iterator;

public class LinkedListIterator<E> implements Iterator<E>{

	Node<E> current = null;
	
	public LinkedListIterator(Node<E> node) {
		current = node;
	}
	
	public boolean hasNext() {
		return current!=null;
	}

	public E next() {
		E data = current.getData();
		current = current.getNext();
		return data;
	}

}
