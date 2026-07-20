/*
LeetCode 344 - Reverse String

Difficulty: Easy
Topic: String

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public void reverseString(char[] s) {
        int l=0;
        int r=s.length-1;
        while(l<r){
            char t=s[l];
            s[l]=s[r];
            s[r]=t;
            l++;r--;
        }return;
        }
       
    }
