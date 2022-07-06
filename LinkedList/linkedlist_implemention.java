package LinkedList;

class LinkedList{
	Node head;
		class Node 
		{ 
		    int data; 
		    Node next;
	
		    Node(int data) 
		    { 
		        this.data = data; 
		        this.next = null;
		    } 
		}   

	//addFirst.................................................................................................................
	  public void addFirst(int data) {
	       Node newNode = new Node(data);
	       newNode.next = head;
	       head = newNode;
	   }

	//add Last..................................................................................................................
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

	//Remove First ...............................................................................................................
	  public void removeFirst() {
	       if(head == null) {
	           System.out.println("Empty List, nothing to delete");
	           return;
	       }
	 
	       head = this.head.next;
	   }

	//Remove Last.........................................................................................................
	 public void removeLast() {
	       if(head == null) {
	           System.out.println("Empty List, nothing to delete");
	           return;
	       }
	 
	       if(head.next == null) {
	           head = null;
	           return;
	       }
	 
	       Node currNode = head;
	       Node lastNode = head.next;
	           while(lastNode.next != null) {
	           currNode = currNode.next;
	           lastNode = lastNode.next;
	       }
	   }


	// Search a element a linked list...............................................................................................
	    public boolean search(Node head, int x) 
	    { 
	        Node current = head;   
	        while (current != null) 
	        { 
	            if (current.data == x) 
	                return true;   
	            current = current.next; 
	        } 
	        return false;   
	    } 

	// Printing the List.............................................................................................................
	   public void printList() {
	       Node currNode = head;
	 
	       while(currNode != null) {
	           System.out.print(currNode.data+" ");
	           currNode = currNode.next;
	       }
	       System.out.print("null");
	    }
	   
	 //Count Number..................................................................................................................
	   public int getCount()
	    {
	        Node temp = head;
	        int count = 0;
	        while (temp != null)
	        {
	            count++;
	            temp = temp.next;
	        }
	        return count;
	    }
	   
	    public static void main(String args[]) 
	    { 
	        LinkedList llist = new LinkedList(); 
	        llist.addFirst(1); 
	        llist.addFirst(2); 
	        llist.addFirst(3); 
	        llist.addLast(11); 
	        llist.addLast(22); 
	        llist.addLast(33); 
	        System.out.println();
	        llist.printList();
	        llist.removeFirst();
	        System.out.println();
	        llist.printList();
	        llist.removeLast();
	        System.out.println();
	        llist.printList();
	        System.out.println();
	        System.out.println("count = "+llist.getCount());
	    } 
	}
