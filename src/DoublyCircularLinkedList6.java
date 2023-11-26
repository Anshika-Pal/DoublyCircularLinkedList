//DoublyCircular Linked List Operation:  Deletion at Specific Node Value

class MyDoublyCircularLinkedList6{
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
	
	public void deleteNodeAtSpecificNodeValue(int locationValue)  {
		
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

public class DoublyCircularLinkedList6 {
	public static void main(String[] args) {
		MyDoublyCircularLinkedList6 list=new MyDoublyCircularLinkedList6();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(9);
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(56);
		list.addNodeAtEnd(5);
		
		list.deleteNodeAtSpecificNodeValue(5);
		
		list.printListForward();
		list.printListBackward();
	}
}
