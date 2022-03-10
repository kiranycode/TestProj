package com.revision.questions;

import java.util.HashMap;
import java.util.Map;

class Node {
	int val;
	Node next;
	Node random;

	public Node(int val) {
		this.val = val;
		this.next = null;
		this.random = null;
	}
}

public class CopyRandamList {

	public static void main(String[] args) {
		// head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
		Node head = new Node(7);
		Node next13 =  new Node(13);
		head.next = next13;
		head.random=null;
		next13.random=head;
		
		Node next11 =  new Node(11);
		next13.next =next11;
		
		Node next10 =  new Node(10);
		next11.next= next10;
		next10.random=next11;
		
		Node next1 =  new Node(1);
		next10.next= next1;
		next1.random=head;
		next11.random= next1;
		print(head);
		
		print(randomCopy(head));
		

	}

	

	private static Node randomCopy(Node head) {
		
		
		if(head==null ){
			return null;
		}
		
		if(head.next==null ){
			Node test=new Node(head.val);
			if(head.random!=null){
				test.random= test;
			}
			return test;
		}
		
		
		Map<Node, Node> randomNodeMap = new HashMap();
		Node p= head;		
		Node newHead = new Node(p.val);
		Node curr = newHead;		
		
		randomNodeMap.put(p,curr);
		while(p.next!=null){
			p=p.next;
			Node cp = new Node(p.val);
			curr.next=cp;
			curr =cp;
			randomNodeMap.put(p,curr);
		}
		
		curr = newHead;
		 p= head;
		while(p!=null){
			curr.random=randomNodeMap.get(p.random);
			p=p.next;
			curr= curr.next;
			
		}
		
		return newHead;
		
	}
	
	
	
	private static void print(Node head) {
		while(head!=null){
			System.out.print("("+head.val +" ,"+getRandom(head)+")");
			head=head.next;
		}
		System.out.println();
	}

	private static String getRandom(Node head) {
		if(head.random!=null){
			return head.random.val+"";
		}else{
			return null;
		}
	}

}
