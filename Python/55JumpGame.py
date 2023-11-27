"""
You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

 

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
"""
class Solution(object):
    def canJump(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        if(len(nums)==0 or len(nums)==1):
            return 1
        max = 0
        for x in nums:
            if max < x:
                max = x
        if(nums[len(nums)-1]==0):
            nums[len(nums) - 1]=1
        while(nums.count(0)>0):
            index_zero = nums.index(0)
            i=index_zero - 1
            found=False
            while(found==False):
                if i <=(index_zero - max) or i < 0:
                    return False
                elif(i + nums[i]) > index_zero:
                    found = True
                    nums[index_zero] = 1
                else:
                    i-=1
        return True

            