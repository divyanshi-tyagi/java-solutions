/*
LeetCode 35 - Search Insert Position

Difficulty: Easy
Topic: Binary Search

Time Complexity: O(log n)
Space Complexity: O(1)
*/
class Solution {
    public int searchInsert(int[] nums, int target) {
    
         int l=0;
        int h=nums.length-1;
        int mid=(l+h)/2;
        while(l<=h){
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                h=mid-1;
            }else{
                l=mid+1;
            }mid=(l+h)/2;
        }return l;
    }
}