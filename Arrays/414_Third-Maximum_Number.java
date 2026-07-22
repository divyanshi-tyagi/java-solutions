/*
LeetCode 414 - Third Maximum Number

Difficulty: Easy
Topic: Arrays

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int thirdMax(int[] nums) {
        Long f=Long.MIN_VALUE;
        Long s=Long.MIN_VALUE;
        Long t=Long.MIN_VALUE;
        Long max=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==f || nums[i]==s || nums[i]==t){
                continue;
            }
            else if(nums[i]>f&& nums[i]>s && nums[i]>t){
                t=s;
                s=f;
                f=(long)nums[i];

            }else if(nums[i]<f && nums[i]>s && nums[i]>t){
                t=s;
                s=(long)nums[i];
            }else if(nums[i]<f && nums[i]<s && nums[i]>t){
                t=(long)nums[i];
            }
            //max=Math.max(f,s);
        }if(t==Long.MIN_VALUE){
            return f.intValue();
        }else{
            return t.intValue();
        }

    }
}            
        