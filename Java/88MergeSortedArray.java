"""
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
"""
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int Resarray[]= new int[m];
        int Indexnums1=0, Indexnums2=0;
        if(n==0)
            return;
        else if(m==0){
            for(int z=0; z<n; z++)
                nums1[z]= nums2[z];
            return;
        }
        for(int y=0; y<m; y++)
            Resarray[y]= nums1[y];

        for (int x=0; x<n+m; x++){
            if(Indexnums1 == m){
                nums1[x]= nums2[Indexnums2];
                Indexnums2++;
            }
            else if(Indexnums2 == n){
                nums1[x]= Resarray[Indexnums1];
                Indexnums1++;
            }
            else{
                if(Resarray[Indexnums1]<= nums2[Indexnums2]){
                    nums1[x]= Resarray[Indexnums1];
                    Indexnums1++;
                }else{
                    nums1[x]= nums2[Indexnums2];
                    Indexnums2++;
                }
            }
        }
    }
}