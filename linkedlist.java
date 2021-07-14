package com.linked_list;

import java.util.Scanner;

public class linkedlist {
	static node head = null;
	static node temp = null;

	public static node insert() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		while (data != -1) {

			if (head == null) {
				node newnode = new node(data);
				head = newnode;
				newnode.next = null;
				temp = head;

			} else {
				node newnode = new node(data);
				temp.next = newnode;
				newnode.next = null;
				temp = temp.next;

			}
			data = s.nextInt();

		}
		return head;
	}

	public static void print(node head) {
		node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->" + " ");
			temp = temp.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		node head = insert();
		print(head);
		s.close();
	}

}
