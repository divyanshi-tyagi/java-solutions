/*
LeetCode 34 - Find First and Last Position of Element in Sorted Array

Difficulty: Medium
Topic: Binary Search

Time Complexity: O(log n)
Space Complexity: O(n)
*/
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int mid;
        int a1;
        int a2;
        int[] ans={-1,-1};
        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]==target){
                a1=mid;
                a2=mid;
                while(a1>0 && nums[a1-1]==target ){
                    a1--;
                }while(a2<nums.length-1 && nums[a2+1]==target  ){
                    a2++;
                }
                ans[0]=a1;
                ans[1]=a2;
                return ans;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }return ans;
    }
}