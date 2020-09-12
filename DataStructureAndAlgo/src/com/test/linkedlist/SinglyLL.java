package com.test.linkedlist;

public class SinglyLL {

	public LL_Node head = null;
	public LL_Node tail = null;

	public void node(int data) {
		LL_Node node = new LL_Node(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
			tail = node;
		}
	}

	public void displayNodeData() {
		// TODO Auto-generated method stub
		LL_Node currentNode = head;
		if (currentNode == null) {
			System.out.println("List is empty");
			return;
		}

		

		while (currentNode != null) {
			System.out.print(currentNode.getData() + " ");
			currentNode = currentNode.getNext();
		}

	}

	public static void main(String[] args) {
		SinglyLL singlyNode = new SinglyLL();
		singlyNode.node(10);
		singlyNode.node(20);
		singlyNode.node(30);
		singlyNode.node(40);
		singlyNode.node(35);
		singlyNode.node(55);

		singlyNode.displayNodeData();

		singlyNode.addNodeAtBeginning(5);
		System.out.println();
		System.out.println("New Node add at beginning");
		singlyNode.displayNodeData();
		
		
		singlyNode.addNodeAtLast(45);
		System.out.println("Add Node add at last");
		singlyNode.displayNodeData();
		
		
		System.out.println();
		System.out.println("Length is Even - " + singlyNode.isLLLengthEven());
		
		
		
		

	}

	private void addNodeAtLast(int i) {
		// TODO Auto-generated method stub
		LL_Node node = new LL_Node(i);
		if(head == null) {
			head = node;
			return;
		}
		
		
		LL_Node currentNode = head;
		while(currentNode.getNext()!= null) {
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(node);
		
		
	}

	public void addNodeAtBeginning(int i) {
		// TODO Auto-generated method stub
		LL_Node currentNode = head;
		LL_Node newNode = new LL_Node(i);
		if (head == null) {
			head = newNode;
		}
		newNode.setNext(currentNode);
		head = newNode;

	}
	
	public boolean isLLLengthEven() {
		LL_Node currentNode = head;
		boolean flag = false;
		int count = 0;
		if (currentNode == null) {
			return flag;
		} else {
			while (currentNode != null && currentNode.getNext() != null) {
				currentNode = currentNode.getNext().getNext();
			}
			if(currentNode==null) {
				flag = true;
				return true;
			}
		}
		return flag;
	}
	

}
