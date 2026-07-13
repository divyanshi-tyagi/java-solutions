/*
LeetCode 26 - Remove Duplicates from Sorted Array

Difficulty: Easy
Topic: Arrays

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[++j]=nums[i+1];
            }
        }
        return j+1;
    }
}