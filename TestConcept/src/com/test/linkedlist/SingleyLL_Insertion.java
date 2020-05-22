package com.test.linkedlist;

public class SingleyLL_Insertion {

	public LLNode head = null;
	public LLNode tail = null;

	public void node(int data) {
		LLNode node1 = new LLNode(data);
		if (head == null) {
			head = node1;
			tail = node1;
		} else {
			tail.setNext(node1);
			tail = node1;
		}
	}

	public void dislay() {
		LLNode current = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of Singly LL");
		while (current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNext();
		}

	}

	public int listLength() {
		LLNode current = head;
		int length = 0;
		while (current != null) {
			length++;
			current = current.getNext();
		}
		return length;
	}

	public void addNodeAtBeggining(int newData) {
		LLNode newNode = new LLNode(newData);
		newNode.setNext(head);
		head = newNode;

	}

	public void pushAtEnd(int data) {
		LLNode newNode = new LLNode(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.setNext(null);
		LLNode currentNode = head;
		while (currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(newNode);
		return;

	}

	public boolean isLLLengthEven() {
		LLNode currentNode = head;
		boolean flag = false;
		int count = 0;
		if (currentNode == null) {
			return flag;
		} else {
			while (currentNode != null && currentNode.getNext() != null) {
				currentNode = currentNode.getNext().getNext();
				if (currentNode.getNext().getNext() != null) {
					flag = false;
					return flag;
				}
				flag = true;
			}
		}
		return flag;
	}

	public void insertAtoPosition(int data, int position) {
		int count = 1;
		LLNode lastNode = head;
		while (count < position - 1) {
			lastNode = lastNode.getNext();
			count++;
		}
		LLNode nodeToInsert = new LLNode(data);
		LLNode tempNode = lastNode;
		// tempNode.setData(nodeToInsert.getData());
		nodeToInsert.setNext(tempNode.getNext());
		lastNode.setNext(nodeToInsert);
	}

	public int nodeFromLastSecond() {
		// TODO Auto-generated method stub
		LLNode firstPointer = head;

		return 0;
	}

	public static void main(String[] args) {
		SingleyLL_Insertion singlyNode = new SingleyLL_Insertion();
		System.out.println("---------");
		singlyNode.node(10);
		singlyNode.node(20);
		singlyNode.node(30);
		singlyNode.node(40);
		singlyNode.node(50);
		singlyNode.node(60);
		singlyNode.node(70);
		singlyNode.node(80);
		singlyNode.node(80);

		singlyNode.addNodeAtBeggining(27);

		singlyNode.pushAtEnd(36);

		int size = singlyNode.listLength();

		System.out.println("Length = " + singlyNode.listLength());

		boolean flag = singlyNode.isLLLengthEven();
		System.out.println("Linked List Even = " + flag);

		singlyNode.insertAtoPosition(99, 4);

		singlyNode.dislay();
	
	}

}
