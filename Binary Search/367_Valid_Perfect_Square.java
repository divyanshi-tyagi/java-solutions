/*
LeetCode 367 - Valid Perfect Square

Difficulty: Easy
Topic: Binary Search

Time Complexity: O(log n)
Space Complexity: O(1)
*/
class Solution {
    public boolean isPerfectSquare(int num) {
        int h=num/2, l=2, mid;
        if(num==1 || num==4){
            return true;
        }
        while(l<=h){
            mid=l+(h-l)/2;
            if((long)mid*mid == (long)num) return true;
            else if((long)mid*mid>(long)num){
                h=mid-1;
            }else l=mid+1;
        }return false;

    }
}