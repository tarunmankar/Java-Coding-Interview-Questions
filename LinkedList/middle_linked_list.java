package LinkedList;

class PrintMiddle{
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	/* Function to print middle of linked list */
	void printMiddleNode()
	{
		Node slow = head;
		Node fast = head;
		
			while (fast!= null && fast.next != null)
			{
				fast = fast.next.next;
				slow = slow.next;
			}
			System.out.println("The middle element is "+slow.data);
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

	public void printList()
	{
		Node tnode = head;
		while (tnode != null)
		{
			System.out.print(tnode.data+" ");
			tnode = tnode.next;
		}
	}

	public static void main(String [] args)
	{
		PrintMiddle llist = new PrintMiddle();
		
			llist.addLast(12);
			llist.addLast(13);
			llist.addLast(14);
			llist.addLast(15);
			llist.addLast(16);
			llist.printList();
			System.out.println();
			llist.printMiddleNode();
	}
}
//This code is contributed by Rajat Mishra
