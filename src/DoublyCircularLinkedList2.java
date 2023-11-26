//DoublyCircular Linked List Operation: Insertion at Beginning

class MyDoublyCircularLinkedList2{
	public Node head = null;  
    
	class Node{
		int data;
		Node next;
		Node prev;
		public Node(int data) {    
            this.data = data;    
            this.next = null;  
            this.prev = null;     
        }
	}
	
	public void addNodeAtBegin(int data) {
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
        head = newNode;
    }

    public void printListForward() {
        if (head == null) {
        	System.out.println("DoublyCircular Linked List is empty!");
        }else {
        	System.out.println("Nodes of DoublyCircular Linked List: "); 
	        Node currentNode = head;
	        do {
	            System.out.print(currentNode.data + " ");
	            currentNode = currentNode.next;
	        }while(currentNode != head);
	        System.out.println();
        }
    }
    public void printListBackward() {
        if (head == null) {
        	System.out.println("DoublyCircular Linked List is empty!");
        }else {
        	System.out.println("Nodes of DoublyCircular Linked List: "); 
	        Node currentNode = head.prev;
	        do {
	            System.out.print(currentNode.data + " ");
	            currentNode = currentNode.prev;
	        }while(currentNode != head.prev);
	        System.out.println();
        }
    }
}
public class DoublyCircularLinkedList2 {
	public static void main(String[] args) {
		MyDoublyCircularLinkedList2 list=new MyDoublyCircularLinkedList2();
		list.addNodeAtBegin(5);
		list.addNodeAtBegin(9);
		list.addNodeAtBegin(23);
		list.addNodeAtBegin(56);
		list.addNodeAtBegin(3);
		list.printListForward();
		list.printListBackward();
	}
}
