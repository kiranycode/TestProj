package com.revision.questions;

public class SwapLinkedListNodes {

	public static void main(String[] args) {
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, null))))));
		SwapLinkedListNodes swapLinkedListNodes = new SwapLinkedListNodes();
		head.toString();
		head = swapLinkedListNodes.swapPairs(head);
		head.toString();

	}
	
	 public ListNode swapPairs(ListNode head) {
		 
		 ListNode t1 = head;
		 
		 if(head.next!=null){
			 head =head.next;
		 }else{
			 return head;
		 }
		 ListNode t3 = head.next;
		 ListNode t2=head;
		 
		 
		 while(t3!=null){
			 t2.next=t1;
			 t1.next=t3.next;
			 t2 =t2.next;
			 t1=t3;
			 t3=t3.next;
		 }
		 return head;
	 }

}
