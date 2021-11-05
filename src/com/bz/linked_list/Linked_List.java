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

	/* method to push the data inside the list */
	public Node pushData(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
		} else {
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

	/* created method to append and pop the element present inside the list */
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

	public void inBetweenInsert(Node previousNode, Node newNode) {
		Node tempNode = previousNode.next;
		previousNode.next = newNode;
		newNode.next = tempNode;
	}

	public void pop() {
		this.head = this.head.next;
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
}

public class Linked_List {
	public static void main(String[] args) {
		LinkList obj = new LinkList();
		System.out.println("*** Welcome To LinkList Program ***");
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Press 1 to add data at start");
		System.out.println("Press 2 to add data at end");
		System.out.println("Press 3 to insert data in between");
		System.out.println("Press 4 to delete first node");
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
		default:
			System.out.println("Invalid Choice");
		}
	}
}