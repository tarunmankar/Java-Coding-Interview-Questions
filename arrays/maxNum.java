/* Program to find largest element in an array
input - 3,5,3,8,9,3,13,8,9,11;
output - 13
*/

public class MaxNum {
	public static void main(String[] args) {
		int arr[]= {3,5,3,8,9,3,13,8,9,11};
		int max=arr[0];
		
		for(int i=0; i<arr.length; i++) {
		    if(arr[i]<max ) {
		    	max=arr[i];
		    }
		}
		System.out.println(max);
	}
}
