/* Q. Find the first non-repeating element in a given array of integers.
  Input : 9 4 9 6 7 4
  Output : 6    
*/

class Main {
        public static void main(String[] args)
        {
            int arr[] = { 9, 4, 9, 6, 7, 4 };
            int n = arr.length;
            System.out.print(firstNonRepeating(arr, n));
        }
        
        static int firstNonRepeating(int arr[], int n)
        {
            for (int i = 0; i < n; i++) {
            int j;
               for (j = 0; j < n; j++){
                   if (i!=j && arr[i] == arr[j])
                    break;
               }
                if (j == n)
                   return arr[i];
        }
        return -1;
    }
}
/* Time Complexity: O(n)
   Auxiliary Space: O(n)
_______________________________________________________________ 
*/

public class Main {
    public static void main(String[] args) {
       int arr[] = {1,4,7,2,6,8,1,4};
       int n = arr.length;
       System.out.print(firstNonRepeating(arr, n));
    }
    
    static int firstNonRepeating(int arr[], int n)
    {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            }
            else {
                m.put(arr[i], 1);
            }
        }
        
        for (int i = 0; i < n; i++)
            if (m.get(arr[i]) == 1)
                return arr[i];
        return -1;
    }
}

// Time Complexity: O(n^2)
//  Auxiliary Space: O(n^2)
