"""
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
"""
import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashmap = new HashMap <Integer, Integer>();
        Integer value;
        int highest = 0;
        int highestVal= 0;
        for(int i=0; i < nums.length; i++){
            value = hashmap.putIfAbsent(nums[i], 1);
            if(value != null ){
                value ++;
                hashmap.replace(nums[i], value);
            }
        }
        for(int i: hashmap.keySet()){
            if(hashmap.get(i) > highestVal){
                highestVal = hashmap.get(i);
                highest = i;
            }
        }
        return highest;
    }
}