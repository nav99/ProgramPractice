package com.test.linkedlist;

public class NthNodeFromEnd {
	public static void main(String[] args) {
		SinglyLL listNode  = new SinglyLL();
		listNode.node(10);
		listNode.node(20);
		listNode.node(30);
		listNode.node(40);
		listNode.node(50);
		listNode.node(60);
		listNode.node(70);
		listNode.node(80);
		listNode.node(90);
		
		printNthNodeFromEnd(listNode.head,3);
	}

	private static void printNthNodeFromEnd(LL_Node head, int n) {
		// TODO Auto-generated method stub
		LL_Node currentNode = head;
		LL_Node temp = head;
		LL_Node fast = head;
		LL_Node slow = head;
		int start = 1;
		
			
		int len = 0;
		while(currentNode!=null) {
			len++;
			currentNode = currentNode.getNext();
		}
		for(int i=1;i<len-n+1;i++) {
			temp= temp.getNext();
		}
		
		System.out.println(temp.getData());
		
		
		while(fast.getNext()!=null) {
			fast = fast.getNext();
			start++;
			if(start > n) {
				slow = slow.getNext();
			}
		}
		
		System.out.println("Slow Data "+ slow.getData());
		
	}

}
