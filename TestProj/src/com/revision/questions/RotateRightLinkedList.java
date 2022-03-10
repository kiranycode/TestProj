package com.revision.questions;

public class RotateRightLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
		ListNode head1 = new ListNode();
		head = head1;

		RotateRightLinkedList rotateRightLinkedList = new RotateRightLinkedList();
		head.toString();
		// head= rotateRightLinkedList.rotateRight(head, 2);
		head = rotateRightLinkedList.rotateRight(head, 1);
		// head.toString();

	}

	public ListNode rotateRight(ListNode head, int k) {

		ListNode rn = head;
		ListNode ln = head;
		if (head == null) {
			return head;
		}
		if (k == 0) {
			return head;
		}
		int i = 0;
		while (ln != null) {
			ln = ln.next;
			i++;
		}

		k = k % i;
		if (k == 0) {
			return head;
		}
		//actul rotation logic
		ln = head;
		while (k > 0) {
			ln = ln.next;
			k--;
		}

		while (ln.next != null) {
			ln = ln.next;
			rn = rn.next;
		}
		ListNode rhn = rn.next;
		rn.next = null;
		ln.next = head;

		return rhn;
	}
}
