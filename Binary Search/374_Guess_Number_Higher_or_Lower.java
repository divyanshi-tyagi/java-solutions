/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

/*
LeetCode 374 - Guess Number Higher or Lower

Difficulty: Easy
Topic: Binary Search

Time Complexity: O(log n)
Space Complexity: O(1)
*/
public class Solution extends GuessGame {
    public int guessNumber(int n) {
       int low=1, high=n, res, mid;
       while(low<=high){
        mid = low + (high - low) / 2;
        res=guess(mid);
        if(res==0){
            return mid;
        }else if(res==-1){
            high=mid-1;
        }else{low=mid+1; }
       }    
       return -1;  
    }
}