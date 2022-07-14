package stack;

public class LinkedlistStack {
	    Node head;
		class Node {
	        int data;
	        Node next;
	
	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }
		
//------------------------------------------------------------------------------------------------
		
		boolean isEmpty() {
            return (head == null);
        }

//------------------------------------------------------------------------------------------------
		
        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

//------------------------------------------------------------------------------------------------

        public void pop() {
            if(isEmpty()) {
            	System.out.print("Stack is Empty");
            	return;
            }
            
            head = head.next;
        }

//------------------------------------------------------------------------------------------------
        
        public void peek() {
            if(isEmpty()) {
            	System.out.print("Stack is Empty");
            	return;
            }
            
            System.out.print(head.data);
        }
 
//------------------------------------------------------------------------------------------------        

        public void printList()
        {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
 
//------------------------------------------------------------------------------------------------

    public static void main(String args[]) {
    	LinkedlistStack st = new LinkedlistStack();
    	st.push(1);
    	st.push(2);
    	st.push(3);
    	st.printList();
        st.pop();
        st.peek();
        st.printList();
    }
}
