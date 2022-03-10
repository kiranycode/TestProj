package com.revision.questions;
//Implement Queue using Array in java.



public class QueueWithArray<T> {
	
	Object [] array = null;
	int pushPosition=0;
	int popPosition=-1;
	int size=10;
	
	public QueueWithArray(){
		array = new Object[10];
	}
	
	public QueueWithArray(int s){
		size =s;
		array = new Object[s];
	}
	
	
	public void enqueue(Object x){
		pushPosition= pushPosition/size;
		if(pushPosition!=popPosition){
			array[pushPosition]=x;
		}else{
			System.out.println("queue is full");
		}
	}
	
	public Object dequeue(){
		if(popPosition>0 && popPosition<size-1 ){
			if(popPosition==size-1){
				popPosition =0;
			}else{
				popPosition++;
			}
			return array[popPosition];
		}else{
			if(pushPosition>=0){
				popPosition=0;
			}
		}
		
		
		return new Object();
	}
	
	public static void main(String[] args) {		
		QueueWithArray queue = new QueueWithArray(5);
	        queue.enqueue(6);
	        queue.dequeue();
	        queue.enqueue(3);
	        queue.enqueue(99);
	        queue.enqueue(56);
	        queue.dequeue();
	        queue.enqueue(43);
	        queue.dequeue();
	        queue.enqueue(89);
	        queue.enqueue(77);
	        queue.dequeue();
	        queue.enqueue(32);
	        queue.enqueue(232);
	}

}
