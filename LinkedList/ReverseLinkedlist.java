package LinkedList;

class ReverseLinkedList {
	static Node head;
    static class Node {
		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}

    public void addLast(int data) {
	       Node newNode = new Node(data);
	       if(head == null) {
	           head = newNode;
	           return;
	       }
	 
	       Node lastNode = head;
	       while(lastNode.next != null) {
	           lastNode = lastNode.next;
	       }
	       lastNode.next = newNode;
	   }

    
	/* Function to reverse the linked list */
	Node reverse(Node node)
	{
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}

	void printList(Node node)
	{
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args)
	{
		ReverseLinkedList list = new ReverseLinkedList();
		list.addLast(12);
		list.addLast(13);
		list.addLast(14);
		list.addLast(16);
		
		System.out.println("Given Linked list");
		list.printList(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);
	}
}
