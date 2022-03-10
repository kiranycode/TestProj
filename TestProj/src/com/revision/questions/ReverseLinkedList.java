package com.revision.questions;



class ListNode{
	ListNode next;
	int value;
	ListNode(int value, ListNode next){
		this.value= value;
		this.next= next;
	}
	
	ListNode(){
		
	}
	ListNode(int value){
		this.value=value;
	}
	
	public String toString(){
		String  result="";
		ListNode node= this;
		while(node!=null){
			result = result +node.value+",";
			node= node.next;
		}
		System.out.println(result);
		return result;
	}
}

public class ReverseLinkedList {
	
	
	
	
	public static void main(String[] args) {		
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
		
		ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
		head.toString();
		head = reverseLinkedList.reverse(head);
		head.toString();
		
	}

	private ListNode reverse(ListNode node) {
		ListNode current= node;
		ListNode previous= null;		
		ListNode temp=null;
		
		while(current !=null){
			temp = current.next;
			current.next=previous;
			previous=current;
			current=temp;
		}
		
		return previous;
		
	}

}
