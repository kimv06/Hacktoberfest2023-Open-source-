import java.io.*;
import java.util.*;

public class LinkedListCreation {

	class Node {
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	Node head = null;
	Node tail = null;
	void addNode(int data)
	{

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		}
		else {

			tail.next = newNode;
			tail = newNode;
		}
	}
	void displayNodes()
	{

		Node current = head;
		if (head == null) {
			System.out.println("Empty");
			return;
		}
		System.out.println("Nodes : ");
		while (current != null) {

			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	int countNodes()
	{
		int count = 0;

		Node currentNode = head;
		while (currentNode != null) {

			count++;
			currentNode = currentNode.next;
		}
		return count;
	}

	public static void main(String[] args)
	{

		LinkedListCreation L1 = new LinkedListCreation();

		L1.addNode(1);
		L1.addNode(2);
		L1.addNode(3);
		L1.addNode(4);
		L1.displayNodes();
		System.out.println("Total Nodes: "
						+ L1.countNodes());
	}
}
