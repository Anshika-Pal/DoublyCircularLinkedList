//DoublyCircular Linked List Operation: Insertion after Specific Node Value of Linked List

class MyDoublyCircularLinkedList3 {
	public Node head = null;

	class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	public void addNodeAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			head.next = head;
			head.prev = head;
			return;
		}
		newNode.next = head;
		newNode.prev = head.prev;
		head.prev.next = newNode;
		head.prev = newNode;
	}

	public void addNodeAfterSpecificNodeValue(int locationValue, int data) {
		// Checks if the list is empty
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		// Create a new node
		Node newNode = new Node(data);
		Node currentNode = head;
		Node locationNode = null;
		do {
			if (currentNode.data == locationValue) {
				locationNode = currentNode;
				break;
			}
			currentNode = currentNode.next;
		} while (currentNode != head);

		if (locationNode == null) {
			System.out.println("Location Value does not exist.");
		} else {
			newNode.next = locationNode.next;
			newNode.prev = locationNode;
			locationNode.next = newNode;
			newNode.next.prev = newNode;
		}
	}

	public void printListForward() {
		if (head == null) {
			System.out.println("DoublyCircular Linked List is empty!");
		} else {
			System.out.println("Nodes of DoublyCircular Linked List: ");
			Node currentNode = head;
			do {
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.next;
			} while (currentNode != head);
			System.out.println();
		}
	}

	public void printListBackward() {
		if (head == null) {
			System.out.println("DoublyCircular Linked List is empty!");
		} else {
			System.out.println("Nodes of DoublyCircular Linked List: ");
			Node currentNode = head.prev;
			do {
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.prev;
			} while (currentNode != head.prev);
			System.out.println();
		}
	}
}
public class DoublyCircularLinkedList3 {
	public static void main(String[] args) {
		MyDoublyCircularLinkedList3 list = new MyDoublyCircularLinkedList3();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(9);
		list.addNodeAtEnd(23);
		list.addNodeAtEnd(56);
		list.addNodeAtEnd(3);

		list.addNodeAfterSpecificNodeValue(3, 65);

		list.printListForward();
		list.printListBackward();
	}
}
