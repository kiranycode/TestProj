package com.revision.questions;

public class RemoveNthNode {

	public static void main(String[] args) {
		//ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
		ListNode head = new ListNode(1,new ListNode(2));
		RemoveNthNode removeNthNode = new RemoveNthNode();
		head.toString();
		head=	removeNthNode.removeNthFromEnd(head, 1);
		System.out.println(head);
	}
	
	
	 public ListNode removeNthFromEnd(ListNode head, int n) {
		 ListNode nthNode=head;
		 ListNode currentNode=head;
		 while(n>=0 && currentNode!=null){
			 currentNode =currentNode.next;
			 n--;
		 }
		 if(n>0){
			 return head;
		 }
		 if(currentNode==null && n==0){
			 return head.next;
		 }
		 
		 while(currentNode!=null){
			 currentNode=currentNode.next;
			 nthNode =nthNode.next;
		 }
		
		 nthNode.next= nthNode.next.next;
		 return head;
	 }

}
