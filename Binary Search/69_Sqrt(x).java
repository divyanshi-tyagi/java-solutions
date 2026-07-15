/*
LeetCode 69 - Sqrt(x)

Difficulty: Easy
Topic: Binary Search

Time Complexity: O(log n)
Space Complexity: O(1)
*/
class Solution {
    public int mySqrt(int x) {
        if(x==1) return 1;
        int l=0;
        int h=x/2;
        int mid;
        int ans=0;
        while(l<=h){
            mid=l+(h-l)/2;
            long sq=(long)mid*mid;
            if(sq==x) return mid;
            else if(sq > x){
                h=mid-1;
                
            }else {l=mid+1;
            ans=mid;}
        }return ans;
    }
}