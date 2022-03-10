package com.revision.questions;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueWithAMax {

	private Queue<Integer> queue = new LinkedList<>();

   
    private Deque<Integer> maxCache = new LinkedList<>();

    public void enqueue(int x) {
      queue.add(x);

      // Eject items 'beat' by this enqueued item
      while (!maxCache.isEmpty() && maxCache.peekLast() < x) {
        maxCache.removeLast();
      }

      maxCache.addLast(x);
    }

    public int dequeue() {
      if (queue.isEmpty()) {
        throw new NoSuchElementException("Queue is empty.");
      }

      /*
        Extract value and see if this was at the head of 'maxCache'
        and needs removal from the max history
      */
      int value = queue.poll();
      if (value == maxCache.peekFirst()) {
        maxCache.removeFirst();
      }

      return value;
    }

    public int max() {
      if (maxCache.isEmpty()) {
        throw new NoSuchElementException("Queue is empty.");
      }

      return maxCache.peek();
    }
	
	
	
}
