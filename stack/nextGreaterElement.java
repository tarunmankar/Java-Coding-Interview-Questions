class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            Stack<Integer> s=new Stack<>();
            HashMap<Integer,Integer> h= new HashMap<>();
            
            for(int i=nums2.length-1; i>=0; i--)
            {
                    while(s.isEmpty()==false && s.peek()<nums2[i])
                    {
                         s.pop();
                    }
                    h.put(nums2[i],s.isEmpty()?-1:s.peek());
                    s.push(nums2[i]);
            }
            
            for(int i =0;i<nums1.length;i++)
                    nums1[i]=h.get(nums1[i]);
            
             
            return nums1;
    }
}
