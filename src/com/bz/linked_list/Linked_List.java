package com.bz.linked_list;

class Node {
	int data;
	Node next;
public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
class operations {
	/*
	 * Taking variables to store the head
	 */
	Node head;
	public void pushData(int data) {

		// created the object of the Node class to get the address of the Node and
		// passing the "data" it will store in constructor
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
			System.out.println("Empty LinkedList");
		else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
		}
	}
}
public class Linked_List {
	public static void main(String[] args) {
		System.out.println("Welcome To LinkList Program");
		operations link = new operations();
		link.pushData(70);
		link.pushData(30);
		link.pushData(56);
		link.print();
		}
}
