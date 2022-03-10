package com.revision.questions;

public class ReverseLinkedListInRange {

	public static void main(String[] args) {
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
		ReverseLinkedListInRange reverseLinkedListInRange = new ReverseLinkedListInRange();
		System.out.println(head);
		head = reverseLinkedListInRange.reverseBetween(head, 2, 4);
		System.out.println(head);
	}

	public ListNode reverseBetween(ListNode head, int m, int n) {
		
		if(head==null){
			return null;
		}
		
		ListNode current= head;		
		ListNode previous= null;		
		
			
		
		while(m>1){
			previous=current; //12345
			current =current.next;//2345
			m--;
			n--;
		}
		ListNode bridge=previous; //12345
		ListNode tail=current;//2345
		while(n>=1){
			ListNode nextNode=current.next;//345			
			current.next=previous; //3,2
			previous=current;//
			current=nextNode;
			n--;
		}
		
		if(bridge!=null){
			bridge.next=previous;
		}else{
			head= previous;
		}
		tail.next=current;	
		
		return head;
	}

}
