//DoublyCircular Linked List Operation:  Deletion from End

class MyDoublyCircularLinkedList4{
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
	
	public void deleteNodeFromEnd() {
		//Checks if the list is empty    
        if(head == null) {
        	System.out.println("Nothing to delete.");
        }else if(head.next == head) {
			head=null;
		}else { 
			head.prev.prev.next=head;
			head.prev=head.prev.prev;
		}
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
public class DoublyCircularLinkedList4 {
	public static void main(String[] args) {
		MyDoublyCircularLinkedList4 list=new MyDoublyCircularLinkedList4();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(9);
		list.addNodeAtEnd(23);
		list.addNodeAtEnd(56);
		list.addNodeAtEnd(3);
		
		list.deleteNodeFromEnd();
		
		list.printListForward();
		list.printListBackward();
	}
}
