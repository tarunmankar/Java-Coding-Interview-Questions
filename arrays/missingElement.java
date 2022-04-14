/* Find all missing numbers from a given sorted array
input - 1,2,3,4,6,7,8,9
output - 5
*/

public class MissingElement {

	public static void main(String[] args) {
		  int[] arr = {1,2,3,4,6,7,8,9};
		  int n=arr.length+1;
		  int sum=n*(n+1)/2;
		  for(int i=0; i<arr.length; i++) {
			  sum=sum-arr[i];
		  }
		  System.out.println(sum);
	  }
 }

/*_____________________________________OR________________________________________
public static void main(String[] args) {
      int arr[] = {1,2,3,4,5,7,8,9,10};
      int arrSum = 0;
        for(int i=0; i<arr.length; i++){
            arrSum = arrSum+arr[i];
          }    
   
      int n = arr.length+1;
      int totalSum = n*(n+1)/2;
      int misNo = totalSum - arrSum;
      System.out.println(misNo);
   }
 }
