package com.dailybyte.questions;


public class DailyByteLinkedList<V> {
	
	MyLiknedListNode<V> rootNode;
	
	
	
	public void add(V value){		
		MyLiknedListNode<V> node  =new MyLiknedListNode<V>(value);
		if(rootNode==null){
			rootNode=node;
		}else{
			node.setNext(rootNode);
			rootNode = node;
		}		
	}
	
	

	public static void main(String[] args) {
		DailyByteLinkedList<Integer> linkedList = new DailyByteLinkedList<Integer>();		
		linkedList.add(3);
		linkedList.add(2);
		linkedList.add(1);		
		linkedList.print(linkedList);
		DailyByteLinkedList<Integer> linkedList2 = new DailyByteLinkedList<Integer>();
		linkedList2.add(6);
		linkedList2.add(5);
		linkedList2.add(4);		
		linkedList2.print(linkedList2);
		
		merge(linkedList,linkedList2);
	}

	
	private static void merge(DailyByteLinkedList<Integer> linkedList, DailyByteLinkedList<Integer> linkedList2) {
		
		
	}



	private  void print(DailyByteLinkedList<Integer> linkedList) {
		MyLiknedListNode<Integer> node =(MyLiknedListNode<Integer>) linkedList.rootNode;
		while(node!=null){
			System.out.println(node.getValue());
			node = node.getNext();
		}
		
		
		
	}


	public class MyLiknedListNode<V>{
		V value;
		
		MyLiknedListNode next;
		
		public V getValue() {
			return value;
		}

		public void setValue(V value) {
			this.value = value;
		}

		
		public MyLiknedListNode getNext() {
			return next;
		}

		public void setNext(MyLiknedListNode next) {
			this.next = next;
		}

		public MyLiknedListNode(V value){
			this.value= value;			
		}

	}
}
