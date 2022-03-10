package com.begining.DS.chapter2;

import java.util.Optional;

public class LinkedListNode<V> {
	V value;
	LinkedListNode<V> next;
		
	public LinkedListNode(V value, LinkedListNode<V> next){
		this.value = value;
		this.next= next;
	}
	
	public  Optional<LinkedListNode<V>> getNext(){
		return  Optional.ofNullable(next);		 
	}

}
