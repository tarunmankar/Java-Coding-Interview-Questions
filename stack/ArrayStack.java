package stack;

public class ArrayStack{
	int MAX = 100;
	int top = -1;
	int arr[] = new int[MAX];
	
	/* ArrayStack(int MAX) {
		this.MAX=MAX;
	}
	*/
	
	boolean isEmpty() {
		   return (top==-1);
	}

//------------------------------------------------------------------------------------------------
	
	boolean isFull() {
			return (top==MAX-1);
    }
	
//------------------------------------------------------------------------------------------------
	
	void push(int x){
		if(isFull()){
		  System.out.print("Stack overflow");
		}
		else {
			arr[top+1]= x;
			top++;
		}
	}

//------------------------------------------------------------------------------------------------
	
	void pop(){
		if(isEmpty()) {
		  System.out.print("Stack is Empty");
		}
		else {
			top--;
		}
	}

//------------------------------------------------------------------------------------------------
	
	void peek(){
		if(isEmpty()) {
		  System.out.print("Stack is Empty");
		}
		else {
			System.out.print(arr[top]);
		}
	}

//------------------------------------------------------------------------------------------------
	
	void printall(){
		if(isEmpty()) {
		  System.out.print("Stack is Empty");
		}
		else {
			for(int i=top; i<=0; i--) {
				System.out.print(arr[i]+" ");
			}
		}
	}

//------------------------------------------------------------------------------------------------
	
	public static void main(String[] args) {
		ArrayStack st=new ArrayStack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.printall();
		System.out.println();
		st.peek();
		st.pop();
	}
}
