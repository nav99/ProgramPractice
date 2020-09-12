package com.test.linkedlist;

public class LL_Node {
	private LL_Node next;
	private int data;
	private String temp;
	
	public LL_Node(int data) {
		this.data = data;
	}

	public LL_Node getNext() {
		return next;
	}

	public void setNext(LL_Node node) {
		this.next = node;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	

}
