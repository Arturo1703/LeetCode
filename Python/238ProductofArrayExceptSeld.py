"""
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
"""
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        totalMul = 1
        output = []
        if(nums.count(0) >= 1):
            if(nums.count(0) > 1):
                totalMul = 0
            for num in nums:
                if num != 0:
                    totalMul=num * totalMul
                output.append(0)
            output[nums.index(0)]=totalMul
        else:
            for num in nums:
                totalMul=num * totalMul
            for num in nums:
                output.append(totalMul/num)
        return output

        