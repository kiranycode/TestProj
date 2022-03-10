package com.dailybyte.questions;

public class LinkedList<K,V> {
	
	
	LinkedList<K,V> next;
	K key;
	V value;
	
	
	public LinkedList<K, V> getNext() {
		return next;
	}
	public void setNext(LinkedList<K, V> next) {
		this.next = next;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}
