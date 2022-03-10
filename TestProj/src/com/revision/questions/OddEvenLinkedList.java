package com.revision.questions;



 /*class ListNode{
	ListNode next;
	int value;
	ListNode(int value, ListNode next){
		this.value= value;
		this.next= next;
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
}*/

public class OddEvenLinkedList {

	public static void main(String[] args) {
		/*Input: 1->2->3->4->5->NULL
		Output: 1->3->5->2->4->NULL*/
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
		
		OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();
		head.toString();
		head = oddEvenLinkedList.OddEvenSep(head);
		head.toString();

	}

	private ListNode OddEvenSep(ListNode head) {
		ListNode odd = head;
		ListNode even = head.next;
		ListNode evenhead = even;
		
		while( even!=null&&even.next !=null ){			
			odd.next= even.next;
			odd= even.next;					
			even.next=odd.next;
			even =odd.next;	
		}
		odd.next=evenhead;
		return head;
		
	}

}
