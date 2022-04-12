// Program to find sum of elements in a given array in java

package array;
public class ArrSum {

  public static void main(String[] args) {
		int [] arr= {5,5,5,5,5};
		int sum=0;
        for(int i=0; i<arr.length; i++){
        	sum=sum+arr[i];
        }
        System.out.print(sum);
  	}
}
