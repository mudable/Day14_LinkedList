package com.bz.linked_list;

import java.util.Scanner;

/*created linked list to push the data inside the list.
 */
class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class operations {
	Node head;
	Node tail;

	public void pushData(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
		} else {
			Node temp = head;
			this.head = newnode;
			newnode.next = temp;
		}
	}

	public void print() {
		if (head == null)
			System.out.println("Empty LinkList");
		else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
		}
	}

	/*
	 * Used the function to add the element at the end. and applied switch case to
	 * select where to add the element.
	 */
	public void append(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
			tail = newnode;
		} else {
			tail.next = newnode;
			tail = newnode;
		}
	}
}

public class Linked_List {
	public static void addDataStart() {
		operations link = new operations();
		link.pushData(70);
		link.pushData(30);
		link.pushData(56);
		link.print();
	}

	public static void addDataEnd() {
		operations link = new operations();
		link.append(56);
		link.append(30);
		link.append(70);
		link.print();
	}

	public static void main(String[] args) {
		System.out.println("*** Welcome To LinkList Program ***");
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Press 1 to add data at start");
		System.out.println("Press 2 to add data at end");
		int input = sc.nextInt();
		switch (input) {
		case 1:
			addDataStart();
			break;
		case 2:
			addDataEnd();
			break;
		default:
			System.out.println("Invalid Choice");
		}
	}
}
