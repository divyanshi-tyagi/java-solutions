/*
LeetCode 509 - Fibonacci Number

Difficulty: Easy
Topic: Recursion

Time Complexity: O(2ⁿ)
Space Complexity: O(n)
*/
class Solution {
    public int fib(int n) {
        int sum=0;
       if(n==0){
        return 0;
       }else if(n==1) return 1;
       else{
        sum=sum+ fib(n-1)+ fib(n-2);
        return sum;
       }
    }
}