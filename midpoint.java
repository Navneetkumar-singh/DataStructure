package com.linked_list;

public class midpoint {
	public static node midnodeeasy(node head) {
		node startnodeslow = head;
		node startnodefast = head;
		while (startnodefast!= null && startnodefast.next != null) {
			startnodeslow = startnodeslow.next;
			startnodefast = startnodefast.next.next;
		}
		return startnodeslow;
	}

	public static node midnode(node head) {
		node midnode = null;
		int count = 0;
		node temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;

		}
		int midpoint = (count / 2);

		int i = 0;
		temp = head;
		while (i < midpoint - 1) {

			temp = temp.next;
			i++;
		}

		return temp;
	}

	public static void main(String[] args) {
		linkedlist list = new linkedlist();
		node n = list.insert();
		System.out.println("inserted list");
		list.print(n);
		node midnode = midnode(n);
		System.out.println("mid list is" + midnode.data);
		;
		node midNode = midnodeeasy(n);
		System.out.println("mid is" + midnode.data);
	}
}
