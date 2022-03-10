package com.revision.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.NoSuchElementException;

public class CircularQueue {
	public static void main(String[] args) {
		CircularQueue circularQueue = new CircularQueue(4);
		circularQueue.enqueue(1);
		circularQueue.enqueue(2);
		circularQueue.enqueue(3);
		circularQueue.enqueue(4);
		circularQueue.dequeue();
		circularQueue.enqueue(5);
		
	}

	private int head = 0, tail = 0, size = 0;
	private static final int SCALE_FACTOR = 2;
	private int[] queue;

	public CircularQueue(int capacity) {
		queue = new int[capacity];
	}

	public void enqueue(int x) {
		if (size == queue.length) {
			resize();
		}

		// Insert the item to the end of the queue
		queue[tail] = x;

		/*
		 * Adjust the tail - the new conceptual index is +1 the original tail,
		 * then we wrap that value around the array with the % operator
		 */
		tail = (tail + 1) % queue.length;
		size++;
	}

	public int dequeue() {
		if (size == 0) {
			throw new NoSuchElementException("Queue is empty.");
		}

		int dequeuedValue = queue[head];
		head = (head + 1) % queue.length;
		size--;

		return dequeuedValue;
	}

	private void resize() {
		/*
		 * Do a circular shift of all items -head positions which will put the
		 * head item at index 0 and the rest of the list in proper position as
		 * well
		 */
		Collections.rotate(Arrays.asList(queue), -head);

		/*
		 * The head becomes 0 & the tail becomes 1 past the last item in the
		 * present queue because we are about to resize the queue
		 */
		head = 0;
		tail = size;

		/*
		 * Resize by the scaling factor (all old items are copied over to a
		 * newly sized array)
		 */
		queue = Arrays.copyOf(queue, size * SCALE_FACTOR);
	}

}
