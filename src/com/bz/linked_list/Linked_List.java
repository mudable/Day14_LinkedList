package com.bz.linked_list;

import java.util.Scanner;

/*created the linked list*/
class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	@Override
	public String toString() {
		return "Node{" + "data=" + data + ", next=" + next;
	}
}

class operations {

	Node head;
	Node tail;

	public Node pushData(int data) {

		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
			tail = newnode;
		} else {
			/*
			 * swapping the value to get the new node address
			 */
			Node temp = head;
			this.head = newnode;
			newnode.next = temp;
		}
		return newnode;
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

	/* created append method to append the element. */
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

	/* insert element between the nodes */
	public void inBetweenInsert(Node previousNode, Node newNode) {
		Node tempNode = previousNode.next;
		previousNode.next = newNode;
		newNode.next = tempNode;
	}

	/* pop method to delete the element */
	public void pop() {
		this.head = this.head.next;
	}

	public void deleteEnd() {
		Node tempNode = head;
		while (!tempNode.next.equals(tail)) {
			tempNode = tempNode.next;
		}
		this.tail = tempNode;
		tempNode.next = null;
	}
}

class LinkList {
	static operations link = new operations();

	public static void addDataStart() {
		link.pushData(70);
		link.pushData(30);
		link.pushData(56);
		link.print();
	}

	public void addDataEnd() {
		link.append(56);
		link.append(30);
		link.append(70);
		link.print();
	}

	public void insertInBetewwn() {
		Node secondnode = link.pushData(70);
		Node firstnode = link.pushData(56);
		Node newnode = new Node(30);
		System.out.println("Before:");
		link.print();
		link.inBetweenInsert(firstnode, newnode);
		System.out.println("\nAfter:");
		link.print();
	}

	public void deleteFirstNode() {
		addDataStart();
		link.pop();
		System.out.println("\nafter deleting first element: ");
		link.print();
	}

	public void deleteLastNode() {
		addDataStart();
		link.deleteEnd();
		System.out.println("\nafter deleting last element: ");
		link.print();
	}
}

/* created the object of class */
public class Linked_List {
	public static void main(String[] args) {
		LinkList obj = new LinkList();
		System.out.println("*** Welcome To LinkList Program ***");
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Press 1 to add data at start");
		System.out.println("Press 2 to add data at end");
		System.out.println("Press 3 to insert data in between");
		System.out.println("Press 4 to delete first element");
		System.out.println("Press 5 to delete last element");
		int input = sc.nextInt();
		switch (input) {
		case 1:
			obj.addDataStart();
			break;
		case 2:
			obj.addDataEnd();
			break;
		case 3:
			obj.insertInBetewwn();
			break;
		case 4:
			obj.deleteFirstNode();
			break;
		case 5:
			obj.deleteLastNode();
			break;
		default:
			System.out.println("Invalid Choice");
		}
	}
}