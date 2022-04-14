/* Program to print the elements of an array in reverse order
intput - {1,2,3,4,5,6}
output - {6,5,4,3,2,1}
*/


public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {3,5,7,3,9,4,1,4,2};
		int[] rev = new int[arr.length];
	      int j = arr.length;
	        for (int i = 0; i < arr.length; i++) 
	        {
	            rev[j - 1] = arr[i];
	                    j  = j - 1;
	        }
	      System.out.println(Arrays.toString(rev));
	    }
	}
