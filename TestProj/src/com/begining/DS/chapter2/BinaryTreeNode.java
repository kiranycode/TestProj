package com.begining.DS.chapter2;

public class BinaryTreeNode<K, V> {
	
	private K key;
	public void setValue(V value) {
		this.value = value;
	}




	private V value;
	
	public BinaryTreeNode<K, V> left;
	public BinaryTreeNode<K, V> right;
	
	public K getKey() {
		return key;
	}


	public V getValue() {
		return value;
	}



	
	public BinaryTreeNode(K key, V value){
		this.key =key;
		this.value= value;
	}
	
}
