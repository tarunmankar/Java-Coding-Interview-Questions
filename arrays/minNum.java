/* que- Program to find the minimum element of an array
input - 5,3,7,2,7,12
output - 2
*/

public class MinNum {
	public static void main(String[] args) {
		int[] arr= {2,3,1};
		int min = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}
}
