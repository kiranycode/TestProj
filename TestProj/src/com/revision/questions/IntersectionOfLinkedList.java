package com.revision.questions;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfLinkedList {

	public static void main(String[] args) {
		
		ListNode intersectionNode =new ListNode(8, new ListNode(4, new ListNode(5, null)));
		//ListNode intersectionNode =null;
		ListNode nodeA = new ListNode(4, new ListNode(1, intersectionNode));
		ListNode nodeB = new ListNode(5, new ListNode(6, new ListNode(1, intersectionNode)));
		
		IntersectionOfLinkedList intersectionOfLinkedList = new IntersectionOfLinkedList();
		ListNode resultIntersection = intersectionOfLinkedList.findIntersection(nodeA,  nodeB);
		System.out.println(resultIntersection);

	}

	private ListNode findIntersection1(ListNode nodeA, ListNode nodeB) {
		Set<ListNode> listNodeSet = new HashSet<ListNode>();
		ListNode node1 = nodeA;
		while(node1!=null){
			listNodeSet.add(node1);
			node1 = node1.next;
		}
		
		ListNode node2 = nodeB;
		while(node2!=null && !listNodeSet.contains(node2)){
			node2 = node2.next;
		}
		return node2;
	}
	
	
	private ListNode findIntersection(ListNode nodeA, ListNode nodeB) {
		ListNode tempNode1 = nodeA;
		ListNode tempNode2 = nodeB;
		
		while(tempNode1!=tempNode2 ){
			if(tempNode1==null  ){
				tempNode1=nodeB;
			}else{
				tempNode1 = tempNode1.next;
			}
			if(tempNode2==null){
				tempNode2=nodeA;
				
			}else{
				tempNode2 = tempNode2.next;
			}
		}
		return tempNode1;
	}

}
